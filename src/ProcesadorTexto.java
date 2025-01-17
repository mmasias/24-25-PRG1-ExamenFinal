import java.util.Scanner;

class ProcesadorTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un texto:");
        String texto = sc.nextLine();
        String resultado = "";
        int palabras = 0;
        int letras = 0;
        boolean enPalabra = false;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == ' ' || c == '.' || c == ',' || c == ';') {
                if (enPalabra) {
                    palabras++;
                    enPalabra = false;º
                }
                if (c != ' ') {
                    resultado += c + " ";
                } else {
                    resultado += c;
                }
            } else {
                if (!enPalabra) {
                    enPalabra = true;
                }
                letras++;
                if (i == 0 || texto.charAt(i - 1) == '.' ||
                        texto.charAt(i - 1) == '!' || texto.charAt(i - 1) == '?') {
                    resultado += Character.toUpperCase(c);
                } else {
                    resultado += Character.toLowerCase(c);
                }
            }
        }
        if (enPalabra) {
            palabras++;
        }
        System.out.println("Texto procesado: " + resultado);
        System.out.println("Palabras: " + palabras);
        System.out.println("Letras: " + letras);
    }
}
