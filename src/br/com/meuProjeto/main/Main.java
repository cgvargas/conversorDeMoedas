package br.com.meuProjeto.main;

import br.com.meuProjeto.entities.ConsultaMoeda;
import br.com.meuProjeto.entities.Moedas;
import java.util.Scanner;

/**
 * A classe Main representa o ponto de entrada para o conversor de moedas.
 * Este programa permite ao usuário converter um valor de uma moeda para outra,
 * utilizando uma API externa para obter a taxa de conversão.
 * O usuário pode informar a sigla das moedas ou buscar a sigla pelo nome da moeda.
 */
public class Main {
    /**
     * O método principal que inicia a execução do programa.
     *
     * @param args Argumentos da linha de comando (não utilizados).
     */

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=========================================");
            System.out.println("          Conversor de Moedas            ");
            System.out.println("=========================================");
            String siglaMoeda1;
            String siglaMoeda2;
            double valor;

            // Verifica se o usuário deseja inserir o nome da moeda local
            System.out.print("Deseja inserir o nome da moeda local? (S/N): ");
            String resposta = scanner.nextLine().trim();

            if (resposta.equalsIgnoreCase("S")) {
                System.out.print("Informe o nome da moeda local: ");
                String nomeMoedaLocal = scanner.nextLine().trim();
                siglaMoeda1 = Moedas.siglaPeloNome(nomeMoedaLocal);

                // Se a sigla não for encontrada, solicitar ao usuário que insira manualmente
                if (siglaMoeda1 == null) {
                    System.out.print("\nEscolha uma das siglas para moeda corrente: ");
                    siglaMoeda1 = scanner.nextLine().trim();
                }
            } else {
                System.out.print("Informe a sigla da moeda corrente: ");
                siglaMoeda1 = scanner.nextLine().trim();
                // Verifica se o usuário deseja inserir o nome da moeda destino
                scanner.nextLine(); // Limpa o buffer
            }

            System.out.print("\nDeseja inserir o nome da moeda destino? (S/N): ");
            resposta = scanner.nextLine().trim();

            if (resposta.equalsIgnoreCase("S")) {
                System.out.print("Informe o nome da moeda destino: ");
                String nomeMoeda2 = scanner.nextLine().trim();
                siglaMoeda2 = Moedas.siglaPeloNome(nomeMoeda2);
                if (siglaMoeda2 != null) {
                    System.out.println("A sigla da moeda destino é: " + siglaMoeda2);
                }
            } else {
                System.out.print("Informe a sigla da moeda destino: ");
                siglaMoeda2 = scanner.nextLine().trim();
            }

            System.out.print("Informe o valor: ");
            valor = scanner.nextDouble();

            ConsultaMoeda consultaMoeda = new ConsultaMoeda(siglaMoeda1, siglaMoeda2, valor);

            // Realiza a consulta e exibe o resultado utilizando o toString() da classe ConsultaMoeda
            System.out.println("\n=========================================");
            System.out.println("Resultado da Conversão:");
            System.out.println("=========================================");
            System.out.println(consultaMoeda.toString());

        }
    }
}
