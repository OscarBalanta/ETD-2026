public class Punto9 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2, 4, 2};
        int num = 2;
        int count = 0;
        for(int n : arr) {
            if(n == num) count++;
        }
        System.out.println("El número " + num + " aparece " + count + " veces");
    }
}