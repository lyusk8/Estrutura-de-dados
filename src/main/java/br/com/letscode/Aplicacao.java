package br.com.letscode;

public class Aplicacao {

    public static void main(String[] args) {

        Queue fila = new Queue();

        Pessoa p1 = new Pessoa("Marcão", "teuemail@site.com", "23/06/1982");
        Pessoa p2 = new Pessoa("Elias", "meuemail@site.com", "25/11/1972");
        Pessoa p3 = new Pessoa("Maria", "meuemail@site.com", "18/09/1985");
        Pessoa p4= new Pessoa("Ana", "meuemail@site.com", "23/03/1984");
        Pessoa p5 = new Pessoa("Gabriel", "meuemail@site.com", "05/09/1995");
        Pessoa p6 = new Pessoa("Fernando", "meuemail@site.com", "08/12/1999");
        Pessoa p7 = new Pessoa("Carlos", "meuemail@site.com", "28/02/2002");
        Pessoa p8 = new Pessoa("Atonio", "meuemail@site.com", "08/05/1965");
        Pessoa p9 = new Pessoa("Jorge", "meuemail@site.com", "17/03/1975");
        Pessoa p10 = new Pessoa("Felipe", "meuemail@site.com", "27/12/2007");
        Pessoa p11 = new Pessoa("Nathalia", "meuemail@site.com", "22/07/2014");
        fila.adicionar(p1);
        fila.adicionar(p2);
        fila.adicionar(p3);
        fila.adicionar(p4);
        fila.adicionar(p5);
        fila.adicionar(p6);
        fila.adicionar(p7);
        fila.adicionar(p8);
        fila.adicionar(p9);
        fila.adicionar(p10);
        fila.adicionar(p11);

        fila.remover(0);
        fila.remover(0);
        fila.remover(10);
        fila.remover(p1);

        fila.adicionar(new Pessoa("Edelso", "meuemail@site.com", "25/11/1972"));
        fila.listarTodos();

        System.out.println("Resultado da busca");
        fila.buscar("Fernando");

        System.out.println("Nome consultado:");
        System.out.println(fila.getPessoa(4));

    }

}
