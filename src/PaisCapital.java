import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PaisCapital {
    public static void main(String[] args) {
        Map<String, String> paises = new HashMap<String, String>();
        paises.put("España", "Madrid");
        paises.put("Marruecos", "Rabat");
        paises.put("Italia", "Roma");
        paises.put("Alemania", "Berlín");

        System.out.println("Introduce un país");
        Scanner sc = new Scanner(System.in);
        String pais = sc.next();

        if (paises.containsKey(pais)) {
            System.out.println("La capital del país introducido es " + paises.get(pais));
        } else {
            System.out.println("No se encuentra el país");

            }
        }
        public static String contiene (Map<String, String> contiene, String pais) {
        return contiene.get(pais);
    }
}
