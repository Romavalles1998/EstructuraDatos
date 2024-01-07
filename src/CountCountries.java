import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CountCountries {

    public static void main(String[] args) throws IOException {
        //OK
        Map<String, Integer> countByCountry = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\allsk\\IdeaProjects\\Colfuturo-Seleccionados.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] campos = line.split(",");

                if (campos.length > 7) {
                    String pais = campos[7].trim(); // Suponiendo que el país está en el campo 7
                    countByCountry.put(pais, countByCountry.getOrDefault(pais, 0) + 1);
                }
            }
        }

        imprimirConteo(countByCountry);
    }

    public static void imprimirConteo(Map<String, Integer> countByCountry) {
        for (Map.Entry<String, Integer> entry : countByCountry.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " alumnos");
        }
    }
}