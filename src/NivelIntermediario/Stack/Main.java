package NivelIntermediario.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Array
        // sao estaticos e tem ref de memoria
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto";

        // Listas
        // Sao dinamicas e tamanho aumenta e diminui conforme precisa
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto");

        // Stack
        // O ultimo elemento que entrou é obrigatoriamnente o primeiro a sair
        Stack<String> ninjasStack = new Stack<>();
        ninjasStack.push("Naruto");
        ninjasStack.push("Sasuke");
        ninjasStack.push("Sakura");
        System.out.println("Minha Stack atual: " + ninjasStack);
        ninjasStack.pop();
        System.out.println("Minha Stack atualizada com pop: " + ninjasStack);
        System.out.println("Minha Stack com o proximo elemento do topo: " + ninjasStack.peek());
        System.out.println("Tamanho da Stack: " + ninjasStack.size());
    }
}
