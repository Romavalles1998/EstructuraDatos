import java.util.ArrayList;
import java.util.Scanner;

public class Alturas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Método 1: Obtener el número de alumnos
        int numAlumnos = numeroAlumnos(scanner);

        // Método 2: Leer alturas de los alumnos
        ArrayList<Double> alturas = new ArrayList<>();
        leerAlturas(scanner, alturas, numAlumnos);

        // Método 3: Calcular la media de las alturas
        double media = calcularMedia(alturas);

        // Método 4: Calcular el número de alumnos con altura superior a la media
        int alumnosAlturaSuperior = calcularAlumnosAlturaSuperior(alturas, media);

        // Método 5: Calcular el número de alumnos con altura inferior a la media
        int alumnosAlturaInferior = calcularAlumnosAlturaInferior(alturas, media);

        // Método 6: Mostrar resultados
        mostrarResultados(alturas, media, alumnosAlturaSuperior, alumnosAlturaInferior);
    }
    // Método 1
    public static int numeroAlumnos(Scanner scanner) {
        System.out.print("Ingrese el número de alumnos: ");
        return scanner.nextInt();
    }
    // Método 2
    public static void leerAlturas(Scanner scanner, ArrayList<Double> alturas, int numAlumnos) {
        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Ingrese la altura del alumno " + (i + 1) + " en metros: ");
            double altura = scanner.nextDouble();
            alturas.add(altura);
        }
    }
    // Método 3
    public static double calcularMedia(ArrayList<Double> alturas) {
        double suma = 0;
        for (double altura : alturas) {
            suma += altura;
        }
        return suma / alturas.size();
    }
    // Método 4
    public static int calcularAlumnosAlturaSuperior(ArrayList<Double> alturas, double media) {
        int contador = 0;
        for (double altura : alturas) {
            if (altura > media) {
                contador++;
            }
        }
        return contador;
    }
    // Método 5
    public static int calcularAlumnosAlturaInferior(ArrayList<Double> alturas, double media) {
        int contador = 0;
        for (double altura : alturas) {
            if (altura < media) {
                contador++;
            }
        }
        return contador;
    }
    // Método 6
    public static void mostrarResultados(ArrayList<Double> alturas, double media,
                                          int alumnosAlturaSuperior, int alumnosAlturaInferior) {
        System.out.println("Alturas de los alumnos:");
        for (int i = 0; i < alturas.size(); i++) {
            System.out.println("Alumno " + (i + 1) + ": " + alturas.get(i) + " metros");
        }

        System.out.println("\nAltura media de la clase: " + media + " metros");
        System.out.println("Alumnos más altos que la media: " + alumnosAlturaSuperior);
        System.out.println("Alumnos más bajos que la media: " + alumnosAlturaInferior);
    }
}

