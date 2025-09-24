package NivelIntermediario.GetterseSetters;

public abstract class Ninja {

    private String nome;
    private String aldeia;
    private int idade;
    private int numeroDeMissoesConcluidas;
    private double altura = 2.10;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, double altura) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.altura = altura;
    }

    // Tirar dados ou mostrar para o usuario eu uso o GET + NOME DA VARIAVEL

    public String getNome() {
        return nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public int getNumeroDeMissoesConcluidas() {
        return numeroDeMissoesConcluidas;
    }

    public double getAltura() {
        return altura;
    }

    // Setter recebe valores

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNumeroDeMissoesConcluidas(int numeroDeMissoesConcluidas) {
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
