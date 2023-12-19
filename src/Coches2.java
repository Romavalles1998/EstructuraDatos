import java.util.ArrayList;
import java.util.Collections;

public class Coches2 {
    public static void main(String[] args) {
        ArrayList<String> coches = new ArrayList<>();
        coches.add("Volvo");
        coches.add("Seat");
        coches.add("Fiat");

        Collections.sort(coches);
        for (String coche : coches){
            System.out.println(coche);
        }
    }
}
