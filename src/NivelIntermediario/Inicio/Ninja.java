package NivelIntermediario.Inicio;

public class Ninja {

    String nome;
    String aldeia;
    int idade;


    //Criar um metodo Publico personalizado

    /*
     * O metodo void nao retorna valor nenhum!
     */
    public void shariganAtivado() {
        System.out.println("O Sharigan Ativoou!!");
    }

    /*
    Metodo String vai ter que retornar uma String
     */
    public String euSouUmNinja() {
        return "Oi, Eu sou um ninja!";
    }

    /*
    Metodo Int vai ter que retornar um int
     */
    public int anosParaSeTornarHokage(int idadeMininaParaSerHokage) {
        return idadeMininaParaSerHokage - idade;
    }

}

