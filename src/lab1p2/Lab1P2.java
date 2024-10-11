package lab1p2;
import java.util.Scanner;
/**
 *
 * @author gabri
 */
public class Lab1P2 {

    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opcion;
        
        do {
            System.out.println("Menu De Programas");
            System.out.println("1. Encontrar palindromía en una cadena");
            System.out.println("2. Mensajes alienígenas?");
            System.out.println("3. Salir");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Ingrese la palabra: ");
                    String palabra = sc.next();
                    
                    palindromia(palabra);
                    break;
                    
                case 2:
                    System.out.println("Ingrese el mensaje a descifrar");
                    String mensaje = sc.next();
                    
                    desci(mensaje);
                    break;
                    
                case 3:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
            }
        } while (opcion != 3);
    }
    
    private static void palindromia(String palabra) {
        
    }
    
    private static void desci(String mensaje) {
        int validacion = mensaje.length();        
        
        System.out.println(validacion);
        if (validacion % 2 == 1) {
            System.out.println("Impar");
        } else {
            System.out.println("par");
        }
    } 
    
}
