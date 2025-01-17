import java.util.Scanner;

public class Loteria1 {
    public static void main(String[] args) {
        int aciertos = 0;
        int[] ganadora = { 3, 7, 12, 15, 25, 35 };
        int[] miBoleto = new int[6];
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tus 6 números (1-49):");
        for (int i = 0; i < 6; i++) {
            boolean numeroValido = false; 
            while (!numeroValido) {
                System.out.print("Número " + (i + 1) + ": ");
                int numeroIngresado = sc.nextInt();
            }
        }
    }
}