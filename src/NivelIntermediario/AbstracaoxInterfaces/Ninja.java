package NivelIntermediario.AbstracaoxInterfaces;

public abstract class Ninja {

    String nome;
    String aldeia;
    int idade;

    // Metodos abstratos
    public abstract void nomeDoNinja();

    public void tacarKunai() {
        System.out.println("eu taquei uma kunai");
    }

}
