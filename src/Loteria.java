import java.util.Scanner;

public class Loteria {
    public static void main(String[] args) {
        int aciertos = 0;
        int[] ganadora = { 3, 7, 12, 15, 25, 35 };
        int[] miBoleto = new int[6];
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tus 6 números (1-49):");
        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            miBoleto[i] = sc.nextInt();
        }

        for (int i = 0; i < ganadora.length; i++) {
            for (int j = 0; j < miBoleto.length; j++) {
                if (ganadora[i] == miBoleto[j]) {
                    aciertos++;
                }
            }
        }

        System.out.println("Has acertado " + aciertos + " números");
        if (aciertos == 6) {
            System.out.println("¡Primera categoría!");
        } else if (aciertos == 5) {
            System.out.println("¡Segunda categoría!");
        } else if (aciertos == 4) {
            System.out.println("¡Tercera categoría!");
        } else {
            System.out.println("Sin premio");
        }
    }
}