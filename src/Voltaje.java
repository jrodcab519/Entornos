import java.util.Scanner;

public class Voltaje {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int potencia;

        System.out.println("Introduce un voltaje (V): ");
        int voltaje = s.nextInt();

        if(voltaje >= 100){
            System.out.println("Introduce una resistencia : ");
            int resistencia = s.nextInt();
            potencia = (voltaje * voltaje)/resistencia;
            System.out.println("La potencia sería " + potencia + " W");
        }else{
            System.out.println("El voltaje es menor de 100, no necesita resistencia");
        }
    }
}
