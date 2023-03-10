import java.util.Scanner;

public class Ejercicio1_a {

    public static void main(String[] args) {
        
        String palabra = " ";
        int cont = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra: ");
        palabra = sc.nextLine();
        
        System.out.println("Ingrese una letra (en minuscula) para buscarla en la palabra ingresada: ");
        char letra = sc.next().charAt(0);
        
        palabra = palabra.toLowerCase();

        cont=contarLetra(palabra, letra);
        
        System.out.println("La letra \""+letra+"\" aparece: "+cont);
    }
    
    public static int contarLetra(String palabra, char letra){
        
        int contador = 0;
        
        int posicion = palabra.indexOf(letra);
        while (posicion != -1){ 
            contador++;           
            posicion = palabra.indexOf(letra, posicion + 1);
        }
        
        return contador;
    }
    
}
