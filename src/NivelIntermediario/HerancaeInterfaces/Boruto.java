package NivelIntermediario.HerancaeInterfaces;

public class Boruto extends Uzumaki implements HyugaUzumaki {

    @Override
    public void ativarJougan() {
        System.out.println("Ativei o Jougan");
    }

    @Override
    public void ativarOKarma() {
        System.out.println("O karma foi ativado");
    }
}
