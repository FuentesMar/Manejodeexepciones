import java.io.IOException;
import java.util.Scanner;

public class CaracterEn {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte una Palabra/cadena");
        String word = sc.next();
        System.out.println("Inserte un numero");
        int numero = sc.nextInt();

        try {
            caracterEn(word, numero);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void caracterEn(String word, int numero) throws Exception {
        char x;
        if (!(numero > word.length())) {
            x = word.charAt(numero - 1);
            System.out.println("El Caracter que se encuentra en la posicion " + numero + " es " + x);
        } else {
            throw new Exception("Has intentado recuperar una posición de la cadena de caracteres que no existe;");
        }
    }
}