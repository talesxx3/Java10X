package NivelBasico.Condicoes;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        /*
         * SwitchCases: Que servem para gerar casos especificos
         * Objetivo: Pedir pro usuario escolher entre os Ninjas
         * switchCase
         * */

        // Pedir para o usuario
        Scanner scanner = new Scanner(System.in);

        // Mostrar opcoes para o usuario
        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto");
        System.out.println("2 - Sasuke");
        System.out.println("3 - Sakura");

        // Pedir para o usuario escolher uma das opcoes
        int escolhaDoUsuario = scanner.nextInt();

        // Reacao ao escolher um personagem
        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("Voce escolheu o Naruto");
                break;
            case 2:
                System.out.println("Voce escolheu o Sasuke");
                break;
            case 3:
                System.out.println("Voce escolheu a Sakura");
                break;
            default:
                System.out.println("Voce nao digitou uma resposta valida! Tente denovo");
        }


        scanner.close();
    }
}
