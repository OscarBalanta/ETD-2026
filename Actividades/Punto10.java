import java.util.*;

public class Punto10 {
    public static void main(String[] args) {
        int[] A = {8, 5, 3, 10, 2, 8, 1};
        int N = A.length;
        int[] B = new int[(N + 1) / 2];
        for(int i = 0; i < N / 2; i++) {
            B[i] = A[i] + A[N - 1 - i];
        }
        if(N % 2 == 1) {
            B[B.length - 1] = A[N / 2];
        }
        System.out.println("Arreglo B: " + Arrays.toString(B));
    }
}