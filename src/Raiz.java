import java.util.Scanner;

public class Raiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Introduzca el numero al que quiera sacar raiz");
            int numero = sc.nextInt();
            Double raiz;
            if (!(numero < 0)) {
                raiz = Math.sqrt(numero);
                System.out.println("El valor de la raiz de " + numero + " es: " + raiz);
            } else {
                throw new NumeroNegativoException("El numero tiene un valor negativo, por lo cual no tiene una raiz",
                        new Throwable("Numero: " + numero));

            }
        } catch (NumeroNegativoException ex) {
            System.out.println(ex);
        }
    }
}


