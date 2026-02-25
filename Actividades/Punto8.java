public class Punto8 {
    public static void main(String[] args) {
        int[] nums = new int[30];
        for(int i = 0; i < 30; i++) {
            nums[i] = (i % 10) + 1;
        }
        int max = nums[0];
        int min = nums[0];
        for(int num : nums) {
            if(num > max) max = num;
            if(num < min) min = num;
        }
        int countMax = 0;
        int countMin = 0;
        for(int num : nums) {
            if(num == max) countMax++;
            if(num == min) countMin++;
        }
        System.out.println("Mayor: " + max + ", se repite " + countMax + " veces");
        System.out.println("Menor: " + min + ", se repite " + countMin + " veces");
    }
}