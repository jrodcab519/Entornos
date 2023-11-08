import java.util.Scanner;

public class MaquinaMonedas {
    public static void main(String[] args) {

        int cantidad = 0;
        String moneda;
        boolean continua = true;
        Scanner s = new Scanner(System.in);

        System.out.println("Deposite moneda (10-20-50 céntimos) ó pida artículo (100).");

        do{
            moneda = s.nextLine();

            switch (moneda) {
                case "10": cantidad += 10;
                    System.out.println("Cantidad incrementada en 10 céntimos" );
                    break;
                case "20": cantidad += 20;
                    System.out.println("Cantidad incrementada en 20 céntimos" );
                    break;
                case "50": cantidad += 50;
                    System.out.println("Cantidad incrementada en 50 céntimos" );
                    break;
                case "P":
                    if(cantidad < 300){
                        System.out.println("Por favor, para el artículo, introduzca más monedas" );
                        continua = true;
                    }
                    break;
                default: System.out.println("Entrada errónea. Introduzca una correcta" );
                    break;
            }

            System.out.println("De momento llevas introducido: " + cantidad + " céntimos" );

            if(cantidad >= 300)
                continua = false;

        }while (cantidad < 300 || continua != false);

        System.out.println("Has comprado el artículo" );

        if (cantidad > 300)
            System.out.println("Se te devuelve " + (cantidad - 300) + " céntimos");
    }
}
