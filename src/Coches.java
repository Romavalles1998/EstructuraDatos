import javax.swing.text.Utilities;
import java.util.ArrayList;
import java.util.Collections;

public class Coches {
    public static void main(String[] args) {
        ArrayList<String> coches = new ArrayList<>();
        String coche;

        do{
            coche = Utilidades.leerCadena("Introduce los coches que deseas");
            if (!coches.isEmpty()) {
                coches.add(coche);
            }
        }while (coches.isEmpty());
        Collections.sort(coches);
        System.out.println(coches);
    }
}
