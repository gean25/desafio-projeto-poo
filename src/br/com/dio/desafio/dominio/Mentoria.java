package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Mentoria {
    String tituloMentoria;
    String descricaoMentoria;
    LocalDate dataCurso;

    public Mentoria() {
    }

    public String getTituloMentoria() {
        return tituloMentoria;
    }

    public void setTituloMentoria(String tituloMentoria) {
        this.tituloMentoria = tituloMentoria;
    }

    public String getDescricaoMentoria() {
        return descricaoMentoria;
    }

    public void setDescricaoMentoria(String descricaoMentoria) {
        this.descricaoMentoria = descricaoMentoria;
    }

    public LocalDate getDataCurso() {
        return dataCurso;
    }

    public void setDataCurso(LocalDate dataCurso) {
        this.dataCurso = dataCurso;
    }

    public static double calcularXp() {
        return 0;
    }

    @Override
    public String toString() {
        return "Mentoria = [ " +
                " TituloMentoria = " + tituloMentoria +
                " | DescricaoMentoria = " + descricaoMentoria +
                " | DataCurso = " + dataCurso +
                " ]";
    }
}
