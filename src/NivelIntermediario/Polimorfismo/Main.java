package NivelIntermediario.Polimorfismo;

public class Main {
    public static void main(String[] args) {

        // Obj Ninja nao pode ser criado


        // Obj Uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";

        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        // Obj Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 17;

        sasuke.habilidadeEspecial();

        //  Obj Uchiha 2
        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da folha", 27  );
        itachi.habilidadeEspecial();

    }

}
