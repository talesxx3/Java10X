package Desafios.Desafio4;

public class NinjaAvancado implements Ninja {
    String nome;
    String habilidade;
    String especialidade;
    int idade;

    public NinjaAvancado(String nome, String habilidade, String especialidade, int idade) {
        this.nome = nome;
        this.habilidade = habilidade;
        this.idade = idade;
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Ninja Avancado: ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Especialidade: " + especialidade );
    }

    @Override
    public void executarHabilidade() {
        System.out.println(nome + " executa a habilidade avançada: " + habilidade);
        System.out.println(nome + " também usa sua especialidade: " + especialidade);
    }
}

