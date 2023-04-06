import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();

        curso.setTituloCurso("Programação Orientada a Objetos");
        curso.setDescricaoCurso("Descrição exemplo");
        curso.setCargaHoraria(4);
        System.out.println(curso);

        mentoria.setTituloMentoria("Mentoria Java");
        mentoria.setDescricaoMentoria("Descriação Mentoria");
        mentoria.setDataCurso(LocalDate.of(2023,12,1));
        System.out.println(mentoria);
    }

}
