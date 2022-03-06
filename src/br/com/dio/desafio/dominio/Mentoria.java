package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);
        this.data = data;
    }

    @Override
    public String toString() {
        return "\nMentoria{\n" +
                "titulo='" + getTitulo() + '\'' +
                ",\ndescricao='" + getDescricao() + '\'' +
                ",\ndata=" + data +
                '}';
    }
}