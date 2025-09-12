package Desafios.Desafio4;

public class NinjaBasico implements Ninja {
    String nome;
    String habilidade;
    int idade;

    public NinjaBasico(String nome, String habilidade, int idade) {
        this.nome = nome;
        this.habilidade = habilidade;
        this.idade = idade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Ninja Basico: ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println(nome + " executa a habilidade básica: " + habilidade);
    }
}
