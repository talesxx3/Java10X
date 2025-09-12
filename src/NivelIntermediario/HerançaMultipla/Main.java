package NivelIntermediario.HerançaMultipla;

public class Main {
    public static void main(String[] args) {

        // obj Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da folha";
        sasuke.idade = 18;
        sasuke.shariganAtivado();

        // obj Hatake
        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi Hatake";
        kakashi.aldeia = "Aldeia da folha";
        kakashi.idade = 48;
        kakashi.boasVindas();
        kakashi.shariganAtivado();
        kakashi.ninjaDeElite();



    }
}
