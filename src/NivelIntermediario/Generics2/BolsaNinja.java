package NivelIntermediario.Generics2;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {

    // Inicializar nosso ARRAY
    private List<T> ferramentas;

    // Construtor
   public BolsaNinja() {
       this.ferramentas = new ArrayList<>();
   }

    // Colocar ferramentas no nosso array
    public void adicionarFerramentas(T ferramenta) {
        ferramentas.add(ferramenta);

    }

    // Mostrar a nossa lista de ferramentas
    public void mostrarFerramenta() {
        for (T ferramenta : ferramentas) {
            System.out.println(ferramenta);
        }
    }
}
