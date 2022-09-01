import java.io.IOException;
import java.util.Scanner;

public class CaracterEn {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte una Palabra/cadena");
        String lectTeclado = sc.next();
        System.out.println("Inserte un numero");
        int numero = sc.nextInt();

        try {
            char x;
            if (!(numero >lectTeclado.length())){
                x = lectTeclado.charAt(numero-1);
                System.out.println("El Caracter que se encuentra en la posicion " + numero + " es " + x );
            }else {
                throw new Exception("Has intentado recuperar una posición de la cadena de caracteres que no se encuentra dentro de la cadena que mandaste/escribiste;");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}