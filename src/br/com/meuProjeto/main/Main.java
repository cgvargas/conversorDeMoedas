package br.com.meuProjeto.main;

import br.com.meuProjeto.entities.ConsultaMoeda;
import br.com.meuProjeto.entities.Moedas;
import br.com.meuProjeto.entities.Consulta;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=========================================");
            System.out.println("          Conversor de Moedas            ");
            System.out.println("=========================================");

            List<Consulta> consultasRealizadas = new ArrayList<>();
            String converte = "";

            while (!converte.equalsIgnoreCase("sim")) {
                System.out.print("Deseja inserir o nome da moeda local? (S/N): ");
                String resposta = scanner.nextLine().trim();
                String siglaMoeda1;

                if (resposta.equalsIgnoreCase("S")) {
                    System.out.print("Informe o nome da moeda local: ");
                    String nomeMoedaLocal = scanner.nextLine().trim();
                    siglaMoeda1 = Moedas.siglaPeloNome(nomeMoedaLocal);

                    if (siglaMoeda1 == null) {
                        System.out.print("\nEscolha uma das siglas para moeda corrente: ");
                        siglaMoeda1 = scanner.nextLine().trim();
                    }
                } else {
                    System.out.print("Informe a sigla da moeda corrente: ");
                    siglaMoeda1 = scanner.nextLine().trim();
                }

                System.out.print("\nDeseja inserir o nome da moeda destino? (S/N): ");
                resposta = scanner.nextLine().trim();
                String siglaMoeda2;

                if (resposta.equalsIgnoreCase("S")) {
                    System.out.print("Informe o nome da moeda destino: ");
                    String nomeMoedaDestino = scanner.nextLine().trim();
                    siglaMoeda2 = Moedas.siglaPeloNome(nomeMoedaDestino);

                    if (siglaMoeda2 == null) {
                        System.out.print("\nEscolha uma das siglas para moeda destino: ");
                        siglaMoeda2 = scanner.nextLine().trim();
                    }
                } else {
                    System.out.print("Informe a sigla da moeda destino: ");
                    siglaMoeda2 = scanner.nextLine().trim();
                }

                System.out.print("Informe o valor: ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Por favor, insira um valor numérico válido.");
                    scanner.next();
                    System.out.print("Informe o valor: ");
                }
                double valor = scanner.nextDouble();
                scanner.nextLine(); // Limpa o buffer após ler o double

                ConsultaMoeda consultaMoeda = new ConsultaMoeda(siglaMoeda1, siglaMoeda2, valor);
                LocalDateTime dataConsulta = LocalDateTime.now();

                double valorConvertido = consultaMoeda.getValorConvertido(); // Usando o método getValorConvertido
                Consulta consulta = new Consulta(
                        consultaMoeda.getMoeda1Nome(),
                        consultaMoeda.getMoeda2Nome(),
                        valor, valorConvertido, dataConsulta
                );

                consultasRealizadas.add(consulta);

                System.out.println("\n=========================================");
                System.out.println("          Resultado da Conversão:");
                System.out.println("=========================================");
                System.out.println(consultaMoeda);
                System.out.println("=========================================");

                System.out.print("\n>> Deseja finalizar o sistema (Sim/Não): ");
                converte = scanner.nextLine().trim();
            }

            System.out.print("Deseja consultar uma conversão passada? (Sim/Não): ");
            String consultar = scanner.nextLine().trim();
            if (consultar.equalsIgnoreCase("Sim")) {
                System.out.print("Informe a data da consulta (dd/MM/yyyy): ");
                String dataInformada = scanner.nextLine().trim();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                try {
                    LocalDate dataConsulta = LocalDate.parse(dataInformada, formatter);
                    List<Consulta> consultasEncontradas = new ArrayList<>();
                    for (Consulta consulta : consultasRealizadas) {
                        if (consulta.getDataConsulta().toLocalDate().isEqual(dataConsulta)) {
                            consultasEncontradas.add(consulta);
                        }
                    }
                    if (!consultasEncontradas.isEmpty()) {
                        System.out.println("\nConsultas encontradas:");
                        System.out.println("----------------------------------------");
                        for (Consulta consulta : consultasEncontradas) {
                            System.out.println(consulta);
                            System.out.println("----------------------------------------");
                        }
                    } else {
                        System.out.println("Nenhuma consulta encontrada para a data informada.");
                    }
                } catch (Exception e) {
                    System.out.println("Formato de data inválido. Certifique-se de usar o formato dd/MM/yyyy.");
                }
            }
        }
    }
}
