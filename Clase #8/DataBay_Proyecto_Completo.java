import java.util.*;

public class DataBay_Proyecto_Completo {
    public static void main(String[] args) {
        ContenedorBuque buque1 = new ContenedorBuque("MSC", "B001", "Italia");
        System.out.println("INFORMACIÓN DEL BUQUE:");
        System.out.println(buque1);

        Contenedor c1 = new Contenedor("C001", 250.5, "Shanghai", 1);
        Contenedor c2 = new Contenedor("C002", 180.3, "EEUU", 2);
        Contenedor c3 = new Contenedor("C003", 320.8, "Singapur", 1);

        Contenedor[] manifiesto = {c1, c2, c3};

        System.out.println("\nMANIFIESTO:");
        double total = 0;
        for (Contenedor contenedor : manifiesto) {
            System.out.println(contenedor);
            total += contenedor.getPeso();
        }
        System.out.println("Peso total: " + total + " toneladas");

        Contenedor[][] patio = new Contenedor[2][2];
        ubicarContenedores(manifiesto, patio);
        mostrarPatio(patio);

        Queue<Contenedor> inspeccion = new LinkedList<>();
        for (Contenedor contenedor : manifiesto) {
            if (contenedor.getPrioridad() == 1) {
                inspeccion.add(contenedor);
            }
        }

        System.out.println("\nINSPECCIÓN:");
        while (!inspeccion.isEmpty()) {
            System.out.println("Revisado: " + inspeccion.poll());
        }

        Stack<Contenedor> carga = new Stack<>();
        for (Contenedor contenedor : manifiesto) {
            if (carga.isEmpty() || contenedor.getPeso() <= carga.peek().getPeso()) {
                carga.push(contenedor);
            }
        }

        System.out.println("\nCARGA DEL BUQUE:");
        while (!carga.isEmpty()) {
            System.out.println("Sale: " + carga.pop());
        }
    }

    private static void ubicarContenedores(Contenedor[] manifiesto, Contenedor[][] patio) {
        int fila = 0;
        int columna = 0;

        for (Contenedor contenedor : manifiesto) {
            if (fila < patio.length) {
                if (columna == patio[fila].length) {
                    fila++;
                    columna = 0;
                }
                if (fila < patio.length) {
                    patio[fila][columna] = contenedor;
                    columna++;
                }
            }
        }
    }

    private static void mostrarPatio(Contenedor[][] patio) {
        System.out.println("\nPATIO DEL PUERTO:");
        for (int i = 0; i < patio.length; i++) {
            for (int j = 0; j < patio[i].length; j++) {
                if (patio[i][j] != null) {
                    System.out.println("Posición [" + i + "][" + j + "]: " + patio[i][j]);
                } else {
                    System.out.println("Posición [" + i + "][" + j + "]: vacío");
                }
            }
        }
    }
}
