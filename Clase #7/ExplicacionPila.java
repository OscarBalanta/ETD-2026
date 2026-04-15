import java.util.Stack;

public class ExplicacionPila {
    
        public static void main(String[] args) {
            Stack<String> objPila = new Stack<>();

            objPila.push("Camilo");
            objPila.push("Daniela");
            objPila.push("Francisco");
            objPila.push("Sofia");
            objPila.push("Kevin");

            System.out.println(objPila);  // Muestra toda la pila

            System.out.println("Tope de la pila: " + objPila.peek()); // Este muestra el tope, o el dato final 

            System.out.println("Pila vacia?: " + objPila.empty()); // Este muestra si la pila esta vacia o no

            System.out.println("Eliminando del tope: " + objPila.pop()); // Este elimina el tope de la pila

            System.out.println(objPila); // Muestra la pila después de eliminar el tope

            System.out.println("Posición de 'Camilo': " + objPila.search("Camilo")); // Este muestra la posicion de un dato de la Pila, si no hay dato aparece -1
            System.out.println("Posición de 'Daniela': " + objPila.search("Daniela"));
            System.out.println("Posición de 'Francisco': " + objPila.search("Francisco"));
            System.out.println("Posición de 'Sofia': " + objPila.search("Sofia"));
            System.out.println("Posición de 'Kevin': " + objPila.search("Kevin"));

        }
}
