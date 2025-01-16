import java.util.Scanner;

class CalculadoraEstadistica {
    public static void main(String[] args) {
        int numeros = pedirCantidad();
        double suma = 0;
        double sumaCuadrados = 0;
        for (int i = 1; i <= numeros; i++) {
            System.out.print("Número " + i + ": ");
            double num = new Scanner(System.in).nextDouble();
            suma = suma + num;
            sumaCuadrados = sumaCuadrados + num * num;
        }
        double media = calcularMedia(suma, numeros);
        double desviacion = calcularDesviacion(sumaCuadrados, suma, numeros);
        System.out.println("Media: " + media);
        System.out.println("Desviación: " + desviacion);
    }

    static int pedirCantidad() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("¿Cuántos números? ");
            n = sc.nextInt();
        } while (n <= 0);
        return n;
    }

    static double calcularMedia(double suma, int cantidad) {
        return suma / cantidad;
    }

    static double calcularDesviacion(double sumaCuadrados, double suma, int n) {
        double media = suma / n;
        return Math.sqrt(sumaCuadrados / n - media * media);
    }
}
