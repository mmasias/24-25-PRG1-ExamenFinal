import java.util.Scanner;

public class BuscarTesoro {
    public static void main(String[] args) {
        char[][] tablero = new char[4][4];
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                tablero[i][j] = '?';
            }
        }
        
        int tesoroFila = (int)(Math.random() * 4);
        int tesoroCol = (int)(Math.random() * 4);
        int intentos = 5;
        boolean encontrado = false;
        
        while(intentos > 0 && !encontrado) {
            System.out.println("Intentos restantes: " + intentos);
            for(int i = 0; i < 4; i++) {
                for(int j = 0; j < 4; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }
            
            System.out.print("Fila (1-4): ");
            int fila = sc.nextInt() - 1;
            System.out.print("Columna (1-4): ");
            int col = sc.nextInt() - 1;
            
            if(fila == tesoroFila && col == tesoroCol) {
                tablero[fila][col] = 'T';
                encontrado = true;
                System.out.println("¡Has encontrado el tesoro!");
            } else {
                tablero[fila][col] = 'X';
                intentos--;
                if(intentos > 0) {
                    if(Math.abs(fila - tesoroFila) + Math.abs(col - tesoroCol) <= 1) {
                        System.out.println("¡Caliente!");
                    } else {
                        System.out.println("Frío...");
                    }
                }
            }
        }
        
        if(!encontrado) {
            System.out.println("¡Game Over! El tesoro estaba en la posición " + 
                             (tesoroFila + 1) + "," + (tesoroCol + 1));
        }
    }
}