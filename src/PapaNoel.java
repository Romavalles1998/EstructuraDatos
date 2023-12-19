import java.util.ArrayList;
import java.util.Arrays;
public class PapaNoel {
    public static void main(String[] args) {
        ArrayList<Integer> portales = new ArrayList<>(Arrays.asList(2,5,1));
        System.out.println("Portales a visitar:"+portales);
        ArrayList<Integer> ruta = repartirRegalos(portales,3);
        System.out.println("Ruta de entrega" + ruta);
    }
    public static ArrayList<Integer> repartirRegalos(ArrayList<Integer> portales, int posicionActual){
        ArrayList<Integer> portalesVisitados = new ArrayList<>();
        while (!portales.isEmpty()){
            int portalMasCercano = encontrarPortalMasCercano(portales,posicionActual);
            portalesVisitados.add(Integer.valueOf(portalMasCercano));
            posicionActual = portalMasCercano;
        }
        return portalesVisitados;
    }
    public static int encontrarPortalMasCercano(ArrayList<Integer> portales, Integer posicionActual){
        int distanciaMinima = Integer.MAX_VALUE;
        int portalMasCercano = -1;
        for (int portal : portales){
            int distancia = Math.abs(posicionActual - portal);

            if (distancia <= distanciaMinima){
                distanciaMinima = distancia;
                portalMasCercano = portal;
            }
        }
        return portalMasCercano;
    }
}
