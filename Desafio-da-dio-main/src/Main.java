import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCarga_horaria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCarga_horaria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCristiano = new Dev();
        devCristiano.setNome("Chris");
        devCristiano.inscreverbootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Chris" + devCristiano.getConteudosInscritos());

        devCristiano.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Chris" + devCristiano.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Chris" + devCristiano.getConteudosConcluidos());
        System.out.println("XP:" + devCristiano.calculartotalxp());

        System.out.println("----------");

        Dev devAlberto = new Dev();
        devAlberto.setNome("Alberto");
        devAlberto.inscreverbootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Alberto" + devAlberto.getConteudosInscritos());

        devAlberto.progredir();
        devAlberto.progredir();
        devAlberto.progredir();
        devAlberto.progredir();
        devAlberto.progredir();
        devAlberto.progredir();
        devAlberto.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Alberto" + devAlberto.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Alberto" + devAlberto.getConteudosConcluidos());
        System.out.println("XP:" + devAlberto.calculartotalxp());

    }
    }
