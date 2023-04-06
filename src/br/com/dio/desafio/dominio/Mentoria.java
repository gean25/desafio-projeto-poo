package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Mentoria extends Conteudo{
    LocalDate dataCurso;

    public Mentoria() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getDataCurso() {
        return dataCurso;
    }

    public void setDataCurso(LocalDate dataCurso) {
        this.dataCurso = dataCurso;
    }

    @Override
    public String toString() {
        return "Mentoria = [ " +
                " TituloMentoria = " + getTitulo() +
                " | DescricaoMentoria = " + getDescricao() +
                " | DataCurso = " + dataCurso +
                " | Xp Mentoria = " + calcularXp() +
                " ]";
    }
}
