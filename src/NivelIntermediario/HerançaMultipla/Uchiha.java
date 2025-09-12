package NivelIntermediario.HerançaMultipla;

public class Uchiha extends Ninja implements ShariganInterface {

    // Esse metodo vem direto da interface!
    public void shariganAtivado(){
        System.out.println(nome + ": Ativoou o Sharigan!!!");
    }
}
