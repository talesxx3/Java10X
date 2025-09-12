package NivelBasico.Arrays;

public class Array {
    public static void main(String[] args) {

        // Arrays sao tipos referencia!

        // String inicializa  como null
        String[] ninja = new String[6];
        ninja[0] = "Naruto";
        ninja[1] = "Sasuke";
        ninja[2] = "Sakura";
        ninja[3] = "Hinata";
        System.out.println(ninja[5]);

        // Redeclarar o Array
        ninja = new String[7];
        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Sarutobi";
        ninja[3] = "Minato Namikaze";
        ninja[4] = "Tsunade";
        ninja[5] = "Kakashi Hatake";
        ninja[6] = "Naruto Uzumaki";

        // For para fazer um LOOP no array
        for (int i = 0; i < 7 ; i++) {
            System.out.println(ninja[i]);

        }

        // Int inicializam como 0
        int [] idade = new int[2];
        idade[0] = 16;
        System.out.println(idade[1]);

        // Boolean inicializam como 0
        boolean[] verdadeiroOuFalso = new boolean[2];
        System.out.println(verdadeiroOuFalso[0]);

        // Double inicializam como 0.0
        double[] fluante = new double[1];
        System.out.println(fluante[0]);



    }
}
