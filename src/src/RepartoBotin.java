package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RepartoBotin {

    public static void main(String[] args) {
        int[] billetes1 = {10, 20, 50, 200, 500};
        int[] billetes2 = {50, 20, 100, 200, 500, 10, 50};

        // Procesar y mostrar resultados para el primer conjunto de billetes
        Map<Integer, ArrayList<Integer>> resultados1 = repartirBotin(2, billetes1);
        mostrarResultados(resultados1);

        // Procesar y mostrar resultados para el segundo conjunto de billetes
        Map<Integer, ArrayList<Integer>> resultados2 = repartirBotin(3, billetes2);
        mostrarResultados(resultados2);
    }

    public static Map<Integer, ArrayList<Integer>> repartirBotin(int numParticipantes, int[] billetes) {
        Map<Integer, ArrayList<Integer>> reparto = new HashMap<>();

        // Barajar los billetes
        ArrayList<Integer> billetesBarajados = new ArrayList<>();
        for (int billete : billetes) {
            billetesBarajados.add(billete);
        }
        Collections.shuffle(billetesBarajados);

        // Repartir los billetes
        for (int i = 0; i < numParticipantes; i++) {
            reparto.put(i, new ArrayList<>());
        }

        for (int i = 0; i < billetesBarajados.size(); i++) {
            int participante = i % numParticipantes;
            reparto.get(participante).add(billetesBarajados.get(i));
        }

        return reparto;
    }

    public static void mostrarResultados(Map<Integer, ArrayList<Integer>> resultados) {
        System.out.print("{");
        for (Map.Entry<Integer, ArrayList<Integer>> entry : resultados.entrySet()) {
            System.out.print(entry.getKey() + "=" + entry.getValue() + ", ");
        }
        System.out.println("}");
    }
}

