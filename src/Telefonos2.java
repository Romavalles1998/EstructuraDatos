import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telefonos2 {
    public static void main(String[] args) {
        //OK
        HashMap<String, ArrayList<String>> agenda = new HashMap<>();
        ArrayList<String> telefonos = new ArrayList<>();
        telefonos.add("667337785");
        telefonos.add("656788785");
        agenda.put("Pepe", telefonos);


        telefonos = new ArrayList<>();
        telefonos.add("655358689");
        telefonos.add("666334535");
        agenda.put("Juan", telefonos);

        System.out.println("¿Qué contacto estás buscando?");
        Scanner sc = new Scanner(System.in);
        String contacto = sc.next();
        if (agenda.containsKey(contacto)) {
            System.out.println("Los números del contacto introducido son:" + agenda.get(contacto));
        } else {
            System.out.println("No se encuentra el contacto");
        }
    }
}