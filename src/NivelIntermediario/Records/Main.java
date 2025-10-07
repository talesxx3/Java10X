package NivelIntermediario.Records;

public class Main {
    public static void main(String[] args) {

        Ninja cadastro = new Ninja("Naruto", "Naruto@email.com", 9999999);
        System.out.println("Cadastro = " + cadastro);
        System.out.println("Nome do cadastro: " + cadastro.getNome());

        NinjaRecord cadastroUsandoRecord = new NinjaRecord("Naruto", "Naruto@gmail.com", 111111);
        System.out.println("cadastroUsandoRecord = " + cadastroUsandoRecord.emailCaixaAlta());
        System.out.println("cadastroUsandoRecord = " + cadastroUsandoRecord.nome());

    }
}
