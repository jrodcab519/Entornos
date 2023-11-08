import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int numero;
        boolean es_primo = true;

        System.out.println("Introduzca un número, que será primo o no");

        numero = s.nextInt();

        for (int i = 2; i < numero; i++){

            if (numero % i ==0){
                es_primo = false;
                System.out.println("El número no es primo, es divisible entre " + i);
            }
        }
        if (es_primo)
            System.out.println("El número " + numero + " es primo.");
    }
}
