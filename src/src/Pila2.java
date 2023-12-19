package src;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Pila2 {

    public static void main(String[] args) {
        String expresionPostfija = "3 4 + 5 *"; // Cambia la expresión según tus necesidades

        System.out.println("Resultado (Pila): " + evaluarExpresionPila(expresionPostfija));
        System.out.println("Resultado (Cola): " + evaluarExpresionCola(expresionPostfija));
    }

    public static int evaluarExpresionPila(String expresionPostfija) {
        Stack<Integer> pila = new Stack<>();

        for (String token : expresionPostfija.split(" ")) {
            if (esOperando(token)) {
                pila.push(Integer.parseInt(token));
            } else {
                int operand2 = pila.pop();
                int operand1 = pila.pop();
                int resultado = aplicarOperador(operand1, operand2, token);
                pila.push(resultado);
            }
        }

        return pila.pop();
    }

    public static int evaluarExpresionCola(String expresionPostfija) {
        Deque<Integer> cola = new ArrayDeque<>();

        for (String token : expresionPostfija.split(" ")) {
            if (esOperando(token)) {
                cola.addLast(Integer.parseInt(token));
            } else {
                int operand2 = cola.removeLast();
                int operand1 = cola.removeLast();
                int resultado = aplicarOperador(operand1, operand2, token);
                cola.addLast(resultado);
            }
        }

        return cola.removeLast();
    }

    public static boolean esOperando(String token) {
        return token.matches("\\d+");
    }

    public static int aplicarOperador(int operand1, int operand2, String operador) {
        switch (operador) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2; // No se maneja la división por cero en este ejemplo
            default:
                throw new IllegalArgumentException("Operador no válido: " + operador);
        }
    }
}

