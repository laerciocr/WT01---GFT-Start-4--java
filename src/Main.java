import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("C# Course: Object-Oriented Programming Principles", "Description", 30 );

        Mentoria mentoria = new Mentoria("Java mentorship", "Description", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Java Developer Bootcamp", "Description");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev dev_1 = new Dev("James Gosling");
        dev_1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos James Gosling:\n" + dev_1.getConteudosInscritos());
        dev_1.progredir();
        dev_1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos James Gosling:\n" + dev_1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos James Gosling:\n" + dev_1.getConteudosConcluidos());
        System.out.println("XP:" + dev_1.calcularTotalXp());

        System.out.println("-------");

        Dev dev_2 = new Dev("Anders Hejlsberg");
        dev_2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Anders Hejlsberg:\n" + dev_2.getConteudosInscritos());
        dev_2.progredir();
        dev_2.progredir();
        dev_2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Anders Hejlsberg:\n" + dev_2.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Anders Hejlsberg:\n" + dev_2.getConteudosConcluidos());
        System.out.println("XP:" + dev_2.calcularTotalXp());

    }

}