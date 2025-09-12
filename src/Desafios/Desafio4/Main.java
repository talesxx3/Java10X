package Desafios.Desafio4;

public class Main  {
    public static void main(String[] args) {
        Ninja ninjaB = new NinjaBasico("Naruto", "ninjutsu", 10);
        Ninja ninjaA = new NinjaAvancado("Sasuke", "Sharingan", "domínio de técnicas de fogo e raio", 18);

        ninjaB.mostrarInformacoes();
        ninjaB.executarHabilidade();

        System.out.println("-----------------------------");

        ninjaA.mostrarInformacoes();
        ninjaA.executarHabilidade();

    }
}
