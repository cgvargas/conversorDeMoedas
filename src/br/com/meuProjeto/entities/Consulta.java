package br.com.meuProjeto.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta {
    private final String moeda1Nome;
    private final String moeda2Nome;
    private final double valor;
    private final double valorConvertido;
    private final LocalDateTime dataConsulta;

    public Consulta(String moeda1Nome, String moeda2Nome, double valor, double valorConvertido, LocalDateTime dataConsulta) {
        this.moeda1Nome = moeda1Nome;
        this.moeda2Nome = moeda2Nome;
        this.valor = valor;
        this.valorConvertido = valorConvertido;
        this.dataConsulta = dataConsulta;
    }

    public LocalDateTime getDataConsulta() {
        return dataConsulta;
    }

    public String getDataFormatada() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dataConsulta.format(formatter);
    }

    @Override
    public String toString() {
        return "Moeda corrente: " + moeda1Nome + "\n" +
                "Moeda destino: " + moeda2Nome + "\n" +
                "Valor corrente: " + valor + "\n" +
                "Valor convertido: " + valorConvertido + "\n" +
                "Data da consulta: " + dataConsulta.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }
}
