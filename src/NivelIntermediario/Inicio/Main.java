package NivelIntermediario.Inicio;

public class Main {
    public static void main(String[] args) {

        // Criar o ninja Naruto - Naruto é um OBJETO
        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da folha";
        Naruto.idade = 17;

        // Criar ninja Sasuke Uchiha - Sasuke é um OBJETO
        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 18;

        //Aplicando Metodos aos meus objetos
        Sasuke.shariganAtivado();
        String chamandoMetodo = Sasuke.euSouUmNinja();
        System.out.println(chamandoMetodo);

       int quantoTempoFalta = Sasuke.anosParaSeTornarHokage(70);
        System.out.println("Faltam " + quantoTempoFalta + " anos para se tornar Hokage");


        // Criar Sakura Haruno
        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.idade = 18;

    }
}
