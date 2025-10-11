package NivelIntermediario.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // QUEUE // FILAS
        Queue<String> ninjasQueue = new LinkedList<>();
        ninjasQueue.add("Naruto");
        ninjasQueue.add("Sasuke");
        ninjasQueue.add("Sakura");
        ninjasQueue.add("Kakashi");
        ninjasQueue.add("Shikamaru");

        // Mostrar a fila
        System.out.println("Ninjas na fila: " + ninjasQueue);

        // Tirar um ninja da fila
        ninjasQueue.poll();
        System.out.println("Ninjas tirado da fila: " + ninjasQueue);

        // Como ver quem é o primeiro
        System.out.println("Ninja no HEAD: " + ninjasQueue.peek());

        // Nao da pra deletar o tail

        // Esvaziar fila
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();

        // Verificar se esta vazia
        if (ninjasQueue.isEmpty()) {
            System.out.println("A fila está vazia");
        }
        


    }
}
