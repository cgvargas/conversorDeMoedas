package br.com.meuProjeto.entities;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Map;

/**
 * Classe responsável por buscar o nome de uma moeda a partir de sua sigla.
 * Utiliza um arquivo JSON contendo as taxas de conversão para realizar a busca.
 */
public class BuscaChaveValor {
    private String busca;

    /**
     * Construtor da classe.
     * @param busca A sigla da moeda a ser buscada.
     */
    public BuscaChaveValor(String busca) {
        this.busca = busca;
    }

    /**
     * Obtém a sigla da moeda a ser buscada.
     * @return A sigla da moeda.
     */
    public String getBusca() {
        return busca;
    }

    /**
     * Define a sigla da moeda a ser buscada.
     * @param busca A sigla da moeda.
     */
    public void setBusca(String busca) {
        this.busca = busca;
    }

    /**
     * Realiza a busca pelo nome da moeda correspondente à sigla fornecida.
     * @return O nome da moeda correspondente à sigla fornecida ou uma mensagem de erro
     * se a sigla não for encontrada.
     */
    public String chave() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (InputStream inputStream = getClass().getResourceAsStream("/conversion_rates.json")) {
            assert inputStream != null;
            try (Reader reader = new InputStreamReader(inputStream)) {

                // Carrega o JSON em um mapa
                Map<String, Object> jsonMap = gson.fromJson(reader, Map.class);

                // Obtém o mapa de taxas de conversão
                Map<String, String> conversionRates = (Map<String, String>) jsonMap.get("conversion_rates");

                // Verifica se a sigla da moeda fornecida pelo usuário está presente no mapa
                if (!conversionRates.containsKey(busca)) {
                    return "Moeda não encontrada para a sigla: " + busca;
                }

                // Retorna o nome da moeda correspondente à sigla fornecida pelo usuário
                return conversionRates.get(busca);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao buscar nome da moeda para a sigla: " + busca;
        }
    }
}

