import dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Curso curso1 = new Curso();
        curso1.setTitulo("confecção de labubu");
        curso1.setDescricao("Curso pra fazer labubus");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("confecção de Morango do amor");
        curso2.setDescricao("Curso pra cozinhar morango do love");
        curso2.setCargaHoraria(10);

        //System.out.println(curso1.toString());
        //System.out.println(curso2.toString());

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("consumo de midias");
        mentoria1.setDescricao("Manual de midias não problematicas para consumir");
        mentoria1.setData(LocalDate.now());

        //System.out.println(mentoria1.toString());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp JAva Midias");
        bootcamp.setDescrição("Descrição Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devGustavo = new Dev();
        devGustavo.setNome("Gustavo");
        devGustavo.inscreverBootcamp(bootcamp);
        System.out.println("conteudos Inscritos Gustavo: " + devGustavo.getConteudosInscritos());
        devGustavo.progredir();
        devGustavo.progredir();
        System.out.println( " ----------- ");
        System.out.println("Conteudo Concluidos Gustavo: " + devGustavo.getConteudosConcluidos());
        System.out.println(" XP Gustavo: " + devGustavo.calcularTotalXp());


        System.out.println( " --------------------- ");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("conteudos Inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println( " ------------- ");
        System.out.println("conteudos Inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteudo Concluidos Camila: " + devGustavo.getConteudosConcluidos());
        System.out.println(" Xp devCamila: " + devCamila.calcularTotalXp());



    }
}