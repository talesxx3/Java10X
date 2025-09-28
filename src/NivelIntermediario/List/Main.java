package NivelIntermediario.List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // ARRAY sao estaticos, nao altertam de tamanho
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";

        // Listas nao sao estaticas
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");
        ninjasList.add("Tobirama Senju");

        System.out.println("NinjasList = " + ninjasList);

        // Remover da lista
        ninjasList.remove("Tobirama Senju");
        System.out.println("NinjasList = " + ninjasList);

        // Trocar elementos
        ninjasList.set(0, "Hashirama Senju");
        System.out.println("NinjasList = " + ninjasList);

        // Ver o tamanho da lista
        System.out.println("Tamanho Lista = " + ninjasList.size() + " elementos");
    }
}
