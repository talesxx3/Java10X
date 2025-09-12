package Desafios.Desafio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um Personagem?");
        System.out.println("1 - Obito Uchiha");
        System.out.println("2 - Itachi Uchiha");
        System.out.println("3 - Sasuke Uchiha");

        int escolhaDoUsuario = sc.nextInt();

        System.out.println("Voce escolheu o numero " + escolhaDoUsuario);

        switch (escolhaDoUsuario) {
            case 1:
                Uchiha Obito = new Uchiha();
                Obito.nome = "Obito Uchiha";
                Obito.idade = 26;
                Obito.nivelDificuldade = "Impossível";
                Obito.statusDaMissao = "Em Andamento";
                Obito.missao = "Destruir a vila da Folha.";
                Obito.mostrarInformacoes();
                break;
            case 2:
                Uchiha Itachi = new Uchiha();
                Itachi.nome = "Itachi Uchiha";
                Itachi.idade = 20;
                Itachi.nivelDificuldade = "Elevada";
                Itachi.statusDaMissao = "Em Andamento";
                Itachi.missao = "Proteger a vila da Folha";
                Itachi.mostrarInformacoes();
                break;
            case 3:
                Uchiha Sasuke = new Uchiha();
                Sasuke.nome = "Sasuke Uchiha";
                Sasuke.idade = 18;
                Sasuke.missao = "Recuperar o Pingente Sagrado";
                Sasuke.nivelDificuldade = "Moderado";
                Sasuke.statusDaMissao = "Em andamento";
                Sasuke.mostrarInformacoes();
                break;
            default:
                System.out.println("Opcao invalida.");


        }
        

        sc.close();
    }


}
