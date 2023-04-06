package br.com.dio.desafio.dominio;

public class Curso {
    private String tituloCurso;
    private String descricaoCurso;
    private int cargaHoraria;

    public Curso() {
    }

    public String getTituloCurso() {
        return tituloCurso;
    }
    public void setTituloCurso(String tituloCurso) {
        this.tituloCurso = tituloCurso;
    }
    public String getDescricaoCurso() {
        return descricaoCurso;
    }
    public void setDescricaoCurso(String descricaoCurso) {
        this.descricaoCurso = descricaoCurso;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public static double calcularXp() {
        return 0;
    }

    @Override
    public String toString() {
        return "Curso =  [" +
                " TituloCurso = " + tituloCurso +
                " | DescricaoCurso = " + descricaoCurso +
                " | CargaHoraria-Mentoria = " + cargaHoraria +
                ']';
    }
}
