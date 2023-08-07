package br.edu.umfg.tecnologia;

public class Aluno {

    //Atributos:
    private String RA;
    private String nome;
    private double nota1;
    private double nota2;
    private double notaTrabalho;
    //Gets:
    //Os unicos 'gets' necessarios sao os de notas, caso precise dos outros pode se colocar.
    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNotaTrabalho() {
        return notaTrabalho;
    }

    // Sets:
    public void setRA(String RA) {
        this.RA = RA;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }
    // COnstrutores:
    public Aluno() {
        super();
    }
    // Metodos:
    public double calcMedia(double nota1, double nota2, double notaTrabalho){
        //Esse metodo apenas pega os valores e calcula a media, retornado-a de volta.
        double calcNotaTrabalho = notaTrabalho * 0.3;
        double calcNotaProva = (nota1 + nota2) * 0.35;
        double media = calcNotaTrabalho + calcNotaProva;
        return media;
    }

    public boolean testaSituacao(double media){
        //Esse metodo apenas testa a media gerada pelo metodo calcMedia() e retorna um boolean atribuido.
        if(media >= 7){
            return true;
        }else {
            return false;
        }
    }

    public void situacao(boolean situacao, double media){
        // Esse metodo testa o resultado retornado pelo metodo testaSituacao() e mostra na tela.
        if (situacao){
            System.out.printf("Resultado: RA: %s; Nome: %s; Nota Final: %1f; Situacao: APROVADO", RA, nome, media);
        } else {
            System.out.printf("Resultado: RA: %s; Nome: %s; Nota Final: %1f; Situacao: EXAME", RA, nome, media);
        }
    }

}
