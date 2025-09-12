package Desafios.Desafio3;

public class Ninja {
    String nome;
    String missao;
    String nivelDificuldade;
    String statusDaMissao;
    int idade;

    public void mostrarInformacoes() {
        System.out.println("nome = " + nome);
        System.out.println("Nivel de dificuldade = " + nivelDificuldade);
        System.out.println("Status da Missao = " + statusDaMissao);
        System.out.println("Missao = " + missao);
        System.out.println("idade = " + idade);
    }
}
