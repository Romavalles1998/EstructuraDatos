import java.util.HashMap;
import java.util.Map;

public class MejorTerminacion {

    public static void main(String[] args) {
        //OK
        String[] boletos1 = {"00004", "03847", "39804"};
        String[] boletos2 = {"58975", "25894", "52985", "98598"};

        // Procesar y mostrar resultados para el primer conjunto de boletos
        Map<Character, Integer> resultados1 = contarTerminaciones(boletos1);
        mostrarResultados(resultados1);

        // Procesar y mostrar resultados para el segundo conjunto de boletos
        Map<Character, Integer> resultados2 = contarTerminaciones(boletos2);
        mostrarResultados(resultados2);
    }

    public static Map<Character, Integer> contarTerminaciones(String[] boletos) {
        Map<Character, Integer> conteoTerminaciones = new HashMap<>();

        for (String boleto : boletos) {
            char ultimaCifra = boleto.charAt(boleto.length() - 1);
            conteoTerminaciones.put(ultimaCifra, conteoTerminaciones.getOrDefault(ultimaCifra, 0) + 1);
        }

        return conteoTerminaciones;
    }

    public static void mostrarResultados(Map<Character, Integer> resultados) {
        System.out.print("{");
        for (Map.Entry<Character, Integer> entry : resultados.entrySet()) {
            System.out.print(entry.getKey() + "=" + entry.getValue() + ", ");
        }
        System.out.println("}");
    }
}
