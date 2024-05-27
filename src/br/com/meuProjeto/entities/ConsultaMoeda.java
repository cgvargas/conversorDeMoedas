package br.com.meuProjeto.entities;

import com.google.gson.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * A classe ConsultaMoeda representa uma consulta de conversão de moedas.
 * Esta classe utiliza uma API externa para obter a taxa de conversão entre duas
 * moedas e calcular o valor convertido.
 */
public class ConsultaMoeda {
    private final String moeda1;
    private final String moeda2;
    private final double valor;

    /**
     * Construtor da classe ConsultaMoeda.
     *
     * @param moeda1 A sigla da moeda corrente.
     * @param moeda2 A sigla da moeda destino.
     * @param valor O valor a ser convertido.
     */
    public ConsultaMoeda(String moeda1, String moeda2, double valor) {
        this.moeda1 = moeda1;
        this.moeda2 = moeda2;
        this.valor = valor;
    }

    /**
     * Realiza a consulta da taxa de conversão de moedas utilizando a API externa.
     *
     * @return O valor convertido da moeda de origem para a moeda de destino.
     * @throws IOException Se ocorrer um erro de I/O ao enviar a requisição.
     * @throws InterruptedException Se a operação for interrompida.
     */
    public double buscaMoeda() throws IOException, InterruptedException {
        // Monta a URL da API
        String codigoMoeda = "https://v6.exchangerate-api.com/v6/6d89269a6099dba2a01becc0/pair/" + moeda1 +
                "/" + moeda2 + "/" + valor;

        // Cria um cliente HTTP
        HttpClient client = HttpClient.newHttpClient();

        // Cria uma requisição HTTP GET para a URL montada
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(codigoMoeda))
                .build();

        try {
            // Envia a requisição e obtém a resposta
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body(); // Extrai o corpo da resposta (o JSON retornado)

            // Parseia o JSON para obter o valor da conversão
            JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();

            return jsonObject.get("conversion_result").getAsDouble();
        } catch (Exception e) {
            throw new RuntimeException("Erro na conversão da moeda...");
        }
    }

    /**
     * Retorna o nome da moeda a partir da sigla.
     *
     * @param sigla A sigla da moeda.
     * @return O nome da moeda correspondente.
     */
    private String getNomeMoeda(String sigla) {
        return Moedas.valueOf(sigla).getNome();
    }

    /**
     * Retorna uma representação em string da consulta de moeda.
     *
     * @return Uma string formatada com as informações da moeda corrente, moeda de destino,
     * valor corrente e valor convertido.
     */
    @Override
    public String toString() {
        try {
            String moedaCorrenteNome = getNomeMoeda(moeda1);
            String moedaDestinoNome = getNomeMoeda(moeda2);
            String valorCorrente = valor + " " + moedaCorrenteNome;
            String valorConvertido = buscaMoeda() + " " + moedaDestinoNome;

            return "Moeda corrente: " + moedaCorrenteNome + "\n" +
                    "Moeda destino: " + moedaDestinoNome + "\n" +
                    "Valor corrente: " + valorCorrente + "\n" +
                    "Valor convertido: " + valorConvertido;
        } catch (IOException | InterruptedException e) {
            return "Erro ao realizar a conversão de moeda: " + e.getMessage();
        }
    }

    public String getMoeda1Nome() {
        return getNomeMoeda(moeda1);
    }

    public String getMoeda2Nome() {
        return getNomeMoeda(moeda2);
    }

    public double getValorConvertido() {
        try {
            return buscaMoeda();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Erro ao buscar o valor convertido: " + e.getMessage());
        }
    }
}
