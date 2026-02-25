import java.util.*;
public class arreglo {
    public static void main(String[] args) throws Exception {
       
        int[] a = {2, 6, 8, 1, 20, 40, 7, 3, 5};
        
        System.out.println("a[4]=" + a[4]); //20
        System.out.println("a[7]=" + a[7]); //3
        System.out.println("a[2]=" + a[2]); //8
        System.out.println("a[0]=" + a[0]); //2
        System.out.println("a[1]=" + a[1]); //6

        System.out.println("tamaño del arreglo a: "+ a.length);

        for(int i= 0; i < a.length; i++){
            System.out.println("a["+ i + "]=" +a[i]);
        }

        int suma = 0;
         for(int i= 0; i < a.length; i++){
            suma = suma + a[i];
         }
         System.out.println("Suma de los todos los  elementos del arreglo es: " + suma);

         //hacer suma de Numeros pares he impares del arreglo
         int sumaPares = 0;
         int sumaImpares = 0;
         for(int i= 0; i < a.length; i++){
            if(a[i] % 2 == 0){  
                sumaPares = sumaPares + a[i];
            }else{  
                sumaImpares = sumaImpares + a[i];
            }       
         }
    
        System.out.println(" La Suma de los numeros pares es: " + sumaPares);
        System.out.println("Suma de los numeros impares es: " + sumaImpares);       
    }
}