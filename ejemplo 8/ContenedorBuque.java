import java.util.*;

class ContenedorBuque {
    private String nombre;
    private String codigo;
    private String origen;

    public ContenedorBuque(String nombre, String codigo, String origen) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.origen = origen;
    }

    public String toString() {
        return "Buque{nombre=" + nombre + ", codigo=" + codigo + ", origen=" + origen + "}";
    }
}

class Contenedor {
    private String codigo;
    private double peso;
    private String origen;
    private int prioridad;

    public Contenedor(String codigo, double peso, String origen, int prioridad) {
        this.codigo = codigo;
        this.peso = peso;
        this.origen = origen;
        this.prioridad = prioridad;
    }

    public double getPeso() { return peso; }
    public int getPrioridad() { return prioridad; }

    public String toString() {
        return "Contenedor{codigo=" + codigo + ", peso=" + peso + ", origen=" + origen + ", prioridad=" + prioridad + "}";
    }
}

public class DataBay_Proyecto_Completo {
    public static void main(String[] args) {
        ContenedorBuque buque1 = new ContenedorBuque("MSC", "B001", "Italia");
        System.out.println("INFORMACION DEL BUQUE");
        System.out.println(buque1);

        Contenedor c1 = new Contenedor("C001", 250.5, "Shanghai", 1);
        Contenedor c2 = new Contenedor("C002", 180.3, "EEUU", 2);
        Contenedor c3 = new Contenedor("C003", 320.8, "Singapur", 1);

        // MODULO 1: ARREGLO
        Contenedor[] manifiesto = new Contenedor[3];
        manifiesto[0] = c1;
        manifiesto[1] = c2;
        manifiesto[2] = c3;

        double total = 0;
        System.out.println("\nMANIFIESTO:");
        for (int i = 0; i < manifiesto.length; i++) {
            System.out.println(manifiesto[i]);
            total += manifiesto[i].getPeso();
        }
        System.out.println("Peso total: " + total);

        // MODULO 2: MATRIZ
        Contenedor[][] patio = new Contenedor[2][2];
        for (int x = 0; x < manifiesto.length; x++) {
            boolean ubicado = false;
            for (int i = 0; i < patio.length; i++) {
                for (int j = 0; j < patio[i].length; j++) {
                    if (patio[i][j] == null) {
                        patio[i][j] = manifiesto[x];
                        ubicado = true;
                        break;
                    }
                }
                if (ubicado) break;
            }
        }

        // MODULO 3: COLA FIFO
        Queue<Contenedor> inspeccion = new LinkedList<>();
        for (int i = 0; i < manifiesto.length; i++) {
            if (manifiesto[i].getPrioridad() == 1) {
                inspeccion.add(manifiesto[i]);
            }
        }
        System.out.println("\nINSPECCION:");
        while (!inspeccion.isEmpty()) {
            System.out.println("Revisado: " + inspeccion.poll());
        }

        // MODULO 4: PILA LIFO
        Stack<Contenedor> carga = new Stack<>();
        for (int i = 0; i < manifiesto.length; i++) {
            if (carga.isEmpty() || manifiesto[i].getPeso() <= carga.peek().getPeso()) {
                carga.push(manifiesto[i]);
            }
        }

        System.out.println("\nCARGA DEL BUQUE:");
        while (!carga.isEmpty()) {
            System.out.println("Sale: " + carga.pop());
        }
    }
}
