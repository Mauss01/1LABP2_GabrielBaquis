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
                    
                    Ispalindrome(palabra);
                    break;
                    
                case 2:
                    System.out.println("Ingrese el mensaje a descifrar");
                    String mensaje = sc.next();
                    int validacion = mensaje.length();               
                    
                    if (validacion % 2 == 1) {
                        System.out.println("El codigo a descrifrar no puede ser impar");
                    } else {
                        desci(mensaje);
                        System.out.println(); 
                    }                    
                    break;
                    
                case 3:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
            }
        } while (opcion != 3);
    }        
    
    private static void desci(String mensaje) {
        
        for (int i = 0; i < mensaje.length(); i+=2) {            
            int poss1 = mensaje.charAt(i)-48;
            int poss2 = mensaje.charAt(i+1)-48;
                        
            String pos1 = String.valueOf(poss1);
            String pos2 = String.valueOf(poss2);
            
            String cadena = pos1 + pos2;
            
            switch(cadena){
                case "65":
                    System.out.print("A");
                    break;
                case "66":
                    System.out.print("B");
                    break;
                case "67":
                    System.out.print("C");
                    break;
                case "68":
                    System.out.print("D");
                    break;
                case "69":
                    System.out.print("E");
                    break;
                case "70":
                    System.out.print("F");
                    break;
                case "71":
                    System.out.print("G");
                    break;
                case "72":
                    System.out.print("H");
                    break;
                case "73":
                    System.out.print("I");
                    break;
                case "74":
                    System.out.print("J");
                    break;    
                case "75":
                    System.out.print("K");
                    break;
                case "76":
                    System.out.print("L");
                    break;
                case "77":
                    System.out.print("M");
                    break;
                case "78":
                    System.out.print("N");
                    break;
                case "79":
                    System.out.print("O");
                    break;
                case "80":
                    System.out.print("P");
                    break;
                case "81":
                    System.out.print("Q");
                    break;
                case "82":
                    System.out.print("R");
                    break;
                case "83":
                    System.out.print("S");
                    break;
                case "84":
                    System.out.print("T");
                    break;
                case "85":
                    System.out.print("U");
                    break;
                case "86":
                    System.out.print("V");
                    break;
                case "87":
                    System.out.print("W");
                    break;
                case "88":
                    System.out.print("X");
                    break;
                case "89":
                    System.out.print("Y");
                    break;
                case "90":
                    System.out.print("Z");
                    break;
            }            
        }        
    }     
    private static void Ispalindrome(String palabra) {
        boolean espalindromo = false;
        String valor = " ";
        
        String almacenador = " ";
        int posicion = 0;
        valor = recursivo(palabra, almacenador, 0, 3, posicion);                    
        
        if (valor.isEmpty()) {
            espalindromo = false;
        } else {
            espalindromo = true;
        }
        
        if (espalindromo) {
            System.out.println("Palabra Original: " + palabra);
            System.out.println("Palindromia: " + valor);            
        } else {
            System.out.println("Palabra Original: " + palabra);
            System.out.println("No se ha encontrado palindromia en este cadena");
        }
    }

    private static String recursivo(String palabra, String almacenador, int pos1, int pos2, int posicion) {                
            almacenador = palabra.substring(pos1, pos2);
        
            if (almacenador.charAt(pos1) == almacenador.charAt(pos2)) {            
                return almacenador;                
            } else if (posicion > palabra.length()-3) {
                return " ";
            } else {
                recursivo(palabra, almacenador, pos1+1,pos2+1, posicion+1);
            }
        return " ";
    }    
}
