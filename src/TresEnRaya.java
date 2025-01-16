import java.util.Scanner;

public class TresEnRaya {
    public static void main(String[] args) {
        char[][] tablero = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }

        Scanner sc = new Scanner(System.in);
        boolean turnoX = true;
        boolean fin = false;

        while (!fin) {
            System.out.println("  1 2 3");
            for (int i = 0; i < 3; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Turno de " + (turnoX ? "X" : "O"));
            System.out.print("Fila: ");
            int fila = sc.nextInt() - 1;
            System.out.print("Columna: ");
            int col = sc.nextInt() - 1;

            if (fila >= 0 && fila < 3 && col >= 0 && col < 3 &&
                    tablero[fila][col] == ' ') {
                tablero[fila][col] = turnoX ? 'X' : 'O';

                boolean victoria = false;
                for (int i = 0; i < 3; i++) {
                    if (tablero[i][0] != ' ' &&
                            tablero[i][0] == tablero[i][1] &&
                            tablero[i][1] == tablero[i][2]) {
                        victoria = true;
                    }
                }

                for (int j = 0; j < 3; j++) {
                    if (tablero[0][j] != ' ' &&
                            tablero[0][j] == tablero[1][j] &&
                            tablero[1][j] == tablero[2][j]) {
                        victoria = true;
                    }
                }

                if (tablero[0][0] != ' ' &&
                        tablero[0][0] == tablero[1][1] &&
                        tablero[1][1] == tablero[2][2]) {
                    victoria = true;
                }
                if (tablero[0][2] != ' ' &&
                        tablero[0][2] == tablero[1][1] &&
                        tablero[1][1] == tablero[2][0]) {
                    victoria = true;
                }

                if (victoria) {
                    System.out.println("¡Gana " + (turnoX ? "X" : "O") + "!");
                    fin = true;
                } else {
                    turnoX = !turnoX;
                }
            } else {
                System.out.println("Movimiento no válido");
            }
        }
    }
}
