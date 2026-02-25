import java.util.*;

public class Punto7 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        for(int num : A) {
            if(num % 2 == 0) pares.add(num);
            else impares.add(num);
        }
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }
}