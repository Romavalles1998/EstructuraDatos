import java.util.Stack;

public class Pila1 {

    public static void main(String[] args) {
        String expresion1 = "{(a + b) * [c - d]}";
        String expresion2 = "[(a + b) * c - d}";

        System.out.println("Expresión 1 está balanceada: " + estaBalanceada(expresion1));
        System.out.println("Expresión 2 está balanceada: " + estaBalanceada(expresion2));
    }

    public static boolean estaBalanceada(String expresion) {
        Stack<Character> pila = new Stack<>();

        for (char caracter : expresion.toCharArray()) {
            if (esSimboloDeApertura(caracter)) {
                pila.push(caracter);
            } else if (esSimboloDeCierre(caracter)) {
                if (pila.isEmpty() || !esParDeApertura(pila.pop(), caracter)) {
                    return false; // No hay par para el símbolo de cierre o no coincide con el de apertura
                }
            }
        }

        return pila.isEmpty(); // La pila debe estar vacía al final si la expresión está balanceada
    }

    public static boolean esSimboloDeApertura(char caracter) {
        return caracter == '(' || caracter == '[' || caracter == '{';
    }

    public static boolean esSimboloDeCierre(char caracter) {
        return caracter == ')' || caracter == ']' || caracter == '}';
    }

    public static boolean esParDeApertura(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')') ||
                (apertura == '[' && cierre == ']') ||
                (apertura == '{' && cierre == '}');
    }
}