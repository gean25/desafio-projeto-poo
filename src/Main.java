import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();
        Conteudo conteudoMentoria = new Mentoria();
        Conteudo conteudoCurso = new Curso();

        curso.setTitulo("Programação Orientada a Objetos");
        curso.setDescricao("Descrição exemplo");
        curso.setCargaHoraria(4);
        System.out.println(curso);

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descriação Mentoria");
        mentoria.setDataCurso(LocalDate.of(2023,12,1));
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do bootcamp");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Devs dev = new Devs();
        dev.setNome("Gean");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos -- "+ dev.getNome() + " = "  + dev.getConteudosInscritos());
        dev.progredir();
        System.out.println("\nConteudos Inscritos -- " + dev.getNome() + " = " + dev.getConteudosInscritos());
        System.out.println("Conteudos Concluidos -- " + dev.getNome() + " = "  + dev.getConteudosConcluidos());
        System.out.println("Total XP " + dev.getNome() + " : " + dev.calcularTotalXp());
        dev.calcularTotalXp();

        Devs dev1 = new Devs();
        dev1.setNome("Ana");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("\nConteudos Inscritos -- "+ dev1.getNome() + " = "  + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("\nConteudos Inscritos -- "+ dev1.getNome() + " = "  + dev1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos -- "+ dev1.getNome() + " = "  + dev1.getConteudosConcluidos());
        System.out.println("Total XP " + dev1.getNome() + " : " + dev1.calcularTotalXp());


    }

}
