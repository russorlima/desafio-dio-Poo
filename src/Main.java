import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JavaScript");
        curso2.setDescricao("descrição curso JavaScript");
        curso2.setCargaHoraria(6);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(Mentoria);

        Dev devRussor = new Dev();
        devRussor.setNome("Russor");
        devRussor.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devRussor.getConteudoInscritos());

        devRussor.progradir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos" + devRussor.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Russor" + devRussor.getConteudoConcluidos());

        System.out.println("------");

        Dev devRafael = new Dev();
        devRafael.setNome("Rafael");
        devRafael.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devRafael.getConteudoInscritos());

        devRafael.progradir();

        System.out.println("Conteudos Inscritos" + devRafael.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Rafael" + devRafael.getConteudoConcluidos());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);


    }

}
