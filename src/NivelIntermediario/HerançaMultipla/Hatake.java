package NivelIntermediario.HerançaMultipla;

public class Hatake extends Ninja implements ShariganInterface, AnbuInterface {

    public void boasVindas(){
        System.out.println(nome + ": Eu sou um hatake");
    }

    public void shariganAtivado(){
        System.out.println(nome + ": Ativoou o Sharigan!!!");
    }

    @Override
    public void ninjaDeElite() {
        System.out.println(nome + ": Eu sou um ninja de elite da ANBU");
    }
}
