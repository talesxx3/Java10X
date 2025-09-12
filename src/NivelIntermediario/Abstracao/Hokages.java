package NivelIntermediario.Abstracao;

public abstract class Hokages {

    String nome;
    int idade;
    boolean vivoOuMorto;

    public abstract void sabedoriaHokage();

    // Construtor Vazio, noArgs
    public Hokages() {

    }


    // Criar um construtor com argumento
    public Hokages(String nome) {
        this.nome = nome;
    }

    public Hokages(int idade) {
        this.idade = idade;
    }

    // All args constructor = Construtor com todos os argumentos
    public Hokages(String nome, int idade, boolean vivoOuMorto) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuMorto = vivoOuMorto;
    }
}
