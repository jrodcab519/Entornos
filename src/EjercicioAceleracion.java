public class EjercicioAceleracion {
    public static void main(String[] args) {

        double a = 9.78;

        for (int t= 0 ;t < 5;t++) {
            double s = 0.5 * a * Math.pow(t,2);
        System.out.println("La distancia después de " + t +" segundos es de " + s + " metros.");
        }
        System.out.println("Aquí termina el bucle");
    }
}
