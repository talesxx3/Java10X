package NivelIntermediario.Generics2;

public class Main {
    public static void main(String[] args) {

        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
        bolsaNinja.adicionarFerramentas(new Kunai("Kunai Explosiva"));
        bolsaNinja.adicionarFerramentas(new Shuriken(3));
        bolsaNinja.adicionarFerramentas(new Pergaminho("Invocacao do sapo"));
        bolsaNinja.adicionarFerramentas(new Pergaminho("Invocacao do aguia"));
        bolsaNinja.adicionarFerramentas(new CompanheiroNinja("Mamaru"));

        System.out.println("Itens da bolsa ninja:");
        bolsaNinja.mostrarFerramenta();


    }
}
