package br.edu.umfg.tecnologia;

import java.util.Scanner;

public class main {
    static Aluno aluno = new Aluno();

    public static void main(String[] args) {
        // Apenas para chamar os metodos a baixo.
        cadastrarAluno();
        adicionarNota();
        resultado();
    }

    public static void cadastrarAluno(){
        // Esse metodo pede os dados de nome e RA e seta os dados para com o objeto;
        Scanner leia = new Scanner(System.in);
        System.out.println("Ola, seja bem vindo(A)!!");
        System.out.println("Entre com o nome completo: ");
        String nome = leia.next();
        System.out.println("Entre com o numero de registro de academico (RA): ");
        String RA = leia.next();
        aluno.setNome(nome);
        aluno.setRA(RA);
        System.out.println("Aluno Cadastrado!!!");
    }

    public static void adicionarNota(){
        // Esse metodo pede os dados de notas e seta os dados para com o objeto;
        Scanner leia = new Scanner(System.in);
        System.out.println("Nota da primeira prova: ");
        double prova1 = leia.nextDouble();
        System.out.println("Nota da segunda prova: ");
        double prova2 = leia.nextDouble();
        System.out.println("Nota do trabalho: ");
        double trabalho = leia.nextDouble();
        aluno.setNota1(prova1);
        aluno.setNota2(prova2);
        aluno.setNotaTrabalho(trabalho);
        System.out.println("Notas Cadastradas!!");
    }
    public static void resultado(){
        // Esse metodo eh apenas usado para chamar os outros metodos do obj.
        double media = aluno.calcMedia(aluno.getNota1(), aluno.getNota2(), aluno.getNotaTrabalho());
        boolean situacao = aluno.testaSituacao(media);

        aluno.situacao(situacao, media);
    }
}
