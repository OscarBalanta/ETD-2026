import java.util.Random;

public class PrincipalSUMI {
     public static void main(String[] args) {

        int[] energias = new int[12];
        Random random = new Random();

        
        for (int i = 0; i < energias.length; i++) {
            energias[i] = random.nextInt(101) + 50;
        }

        System.out.println("Cargas Randoms generadas:");
        for (int valor : energias) {
            System.out.print(valor + " ");
        }
        System.out.println("\n");

        int[] listaMultiplos = new int[12];
        int indice = 0;

        
        for (int valor : energias) {
            if (valor % 10 == 0) {
                listaMultiplos[indice++] = valor;
            }
        }

        int[][] mapa = new int[3][3];
        int aux = 0;

        // Llenar matriz
        for (int fila = 0; fila < mapa.length; fila++) {
            for (int col = 0; col < mapa[fila].length; col++) {

                if (aux < indice) {
                    mapa[fila][col] = listaMultiplos[aux++];
                } else {
                    mapa[fila][col] = -1;
                }
            }
        }

        System.out.println("Mapa de carga:");
        for (int[] fila : mapa) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }

        Suministros[] manifiesto = new Suministros[9];
        int posicion = 0;

        // Crear objetos
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {

                if (mapa[i][j] != -1) {

                    int energia = mapa[i][j];
                    String prioridad = (energia > 100) ? "ALTA" : "ESTÁNDAR";

                    String codigo = "C-" + i + "-" + j;

                    manifiesto[posicion] = new Suministros(codigo, energia, prioridad);

                } else {
                    manifiesto[posicion] = null;
                }

                posicion++;
            }
        }

        System.out.println("\nManifiesto de vuelo:");

        for (Suministros s : manifiesto) {
            if (s != null) {
                System.out.println(
                        s.id + " | Energia: " +
                        s.nivelEnergia + " | Prioridad: " +
                        s.prioridad
                );
            } else {
                System.out.println("NULL");
            }
        }
    }
}
