import java.util.Scanner;

public class Ejercicio1_c {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int [] array = {5, 15, 10, 7, 8, 3, 11};
        int num = 0;
        
        System.out.println("Vector: ");
        for(int i=0; i<7; i++){
            System.out.print(array[i]+" ");
        }
        
        System.out.print("\nIngrese un numero: ");
        num = sc.nextInt();
        
        int suma = suma(array, num);
        
        System.out.println("La suma de los numeros mayores a "+num+" en el vector es de: "+suma);
    }
    
    public static int suma(int array[], int num){
        int suma = 0;
        
        for(int i=0; i<7; i++){
            if(array[i]>num){
                suma+=array[i];
            }
        }
        
        return suma;
    }
}
