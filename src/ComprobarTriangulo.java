import java.util.Scanner;

public class ComprobarTriangulo {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Introduce 3 valores enteros que no sean 0: ");
        int valor1 = Math.abs(s.nextInt());
        int valor2 = Math.abs(s.nextInt());
        int valor3 = Math.abs(s.nextInt());

        if (valor1==0 || valor2==0 || valor3==0) {
            System.out.println("No se puede introducir 0. Pruebe de nuevo. ");
        }else {
            if (valor1 == valor2 && valor1 == valor3) {
                System.out.println("Pueden representar los lados de un triángulo equilátero. ");
            } else {
                System.out.println("No pueden representar los lados de un triángulo equilátero. ");
            }
            if (valor1 == valor2 && valor1 != valor3 || valor1 == valor3 && valor1 != valor2 || valor2 == valor3 && valor2 != valor1) {
                System.out.println("Pueden representar los lados de un triángulo isósceles. ");
            } else {
                System.out.println("No pueden representar los lados de un triángulo isósceles. ");
            }
        }
    }
}
