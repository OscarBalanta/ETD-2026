import java.util.*;

public class Punto5 {
    public static void main(String[] args) {
        double[] PU = {10.0, 20.0, 30.0};
        int[] CC = {2, 3, 1};
        String[] desc = {"Producto A", "Producto B", "Producto C"};
        double[] TG = new double[PU.length];
        double totalGeneral = 0;
        for(int i = 0; i < PU.length; i++) {
            TG[i] = PU[i] * CC[i];
            totalGeneral += TG[i];
        }
        double maxTG = TG[0];
        int indexMax = 0;
        for(int i = 1; i < TG.length; i++) {
            if(TG[i] > maxTG) {
                maxTG = TG[i];
                indexMax = i;
            }
        }
        System.out.println("Total gastado por producto: " + Arrays.toString(TG));
        System.out.println("Total general: " + totalGeneral);
        System.out.println("Producto con mayor gasto: " + desc[indexMax] + " con " + maxTG);
    }
}