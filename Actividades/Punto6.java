public class Punto6 {
    public static void main(String[] args) {
        double[] alquileres = {1000, 2000, 1500};
        double[] porcentajes = {10, 15, 20};
        double[] ganancias = new double[alquileres.length];
        for(int i = 0; i < alquileres.length; i++) {
            ganancias[i] = alquileres[i] * porcentajes[i] / 100;
        }
        System.out.println("Ganancias: " + java.util.Arrays.toString(ganancias));
    }
}