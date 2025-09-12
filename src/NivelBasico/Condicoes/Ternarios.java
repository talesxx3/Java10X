package NivelBasico.Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        /*
         * Ternarios: Sao maneiras de reduzir o codigo
         * variavel = (condição) ? valorSeVerdadeiro : valorSeFalso;
         * */

        short numeroDeMissoes = 1;
        String nivel = (numeroDeMissoes >= 10) ? "Rank Jounin" : "Rank Chunnin";
        System.out.println(nivel);
    }
}
