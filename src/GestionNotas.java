import java.util.Scanner;

class GestionNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] notas = new int[10];
        System.out.println("Introduce 10 notas");
        for (int i = 0; i < 10; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextInt();
        }
        int suma = 0;
        for (int i = 0; i < 10; i++) {
            suma += notas[i];
        }
        double media = suma / 10.0;
        System.out.println("Media: " + media);
        int aprobados = 0;
        int suspensos = 0;
        for (int i = 0; i < 10; i++) {
            if (notas[i] >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }
        }
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Suspensos: " + suspensos);
        int max = notas[0];
        int min = notas[0];
        for (int i = 1; i < 10; i++) {
            if (notas[i] > max) {
                max = notas[i];
            }
            if (notas[i] < min) {
                min = notas[i];
            }
        }
        System.out.println("Nota máxima: " + max);
        System.out.println("Nota mínima: " + min);
        for (int i = 0; i < 10; i++) {
            System.out.print("Alumno " + (i + 1) + ": ");
            for (int j = 0; j < notas[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
