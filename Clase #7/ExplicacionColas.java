import java.util.LinkedList;
import java.util.Queue;

public class ExplicacionColas {
    
    public static void main(String[] args) {
        
        Queue<Integer> objCola = new LinkedList<>();

        //agregar elementos a la cola sean (add) o (offer)
        objCola.add(29);
        objCola.add(16);
        objCola.add(10);
        objCola.add(34);

        //Para mostrar el sout

        System.out.println(objCola); //  Este Muestra toda la cola

        System.out.println("la Cabeza de la cola es: " + objCola.peek()); // Este muestra la cabeza, o el dato inicial
        System.out.println("la Cabeza de la cola es: " + objCola.element()); // hace exactamente lo mismo pero con element

        System.out.println("Elemento eliminado: " + objCola.poll()); //  Este elimina la cabeza de la cola 
        System.out.println("Elemento eliminado: " + objCola.remove()); //hace exactamente lo mismo pero con remove

        System.out.println(objCola); // Muestra la cola después de eliminar la cabeza

        System.out.println("El tamaño de la cola es: " + objCola.size()); // Este muestra el tamaño de la cola
    }

}
