import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String palabra = "";
        int desplazamiento = 0;
        
        System.out.print("Ingrese la palabra a codificar: ");
        palabra = sc.nextLine();
        
        System.out.print("Ingrese el valor del desplazamiento: ");
        desplazamiento = sc.nextInt();
        
        System.out.println("Pabra codificada: "+codificar(palabra, desplazamiento));
        System.out.println("Palabra decodificada: "+decodificar(palabra, desplazamiento));
    }
    
    public static String codificar(String palabra, int desplazamiento){
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<palabra.length(); i++){
            char c = palabra.charAt(i);
            if(Character.isLetter(c)){
                c = (char) (c+desplazamiento);
                if(c>122){
                    int dif = (int) c - 122;
                    c = (char) (96+dif);
                }
            }
            if(Character.isSpaceChar(c)){
                c = (char) (96+desplazamiento);
            }
            
            sb.append(c);
        }
        
        return sb.toString();
    }
    
    public static String decodificar(String palabra, int desplazamiento){
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<palabra.length(); i++){
            char c = palabra.charAt(i);
            if(Character.isLetter(c)){
                c = (char) (c-desplazamiento+desplazamiento);
            }
            if(Character.isSpaceChar(c)){
                c = (char) (95);
            }
            
            sb.append(c);
        }
        
        return sb.toString();
    }
}