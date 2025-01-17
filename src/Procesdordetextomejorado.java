import  java.util.Scanner;

public class Procesdordetextomejorado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un texto:");
        String texto = scanner.nextLine();
        
        String resultado = "";
        int palabras = 0, letras = 0;
        boolean enPalabra = false;
      
        for (char c : texto.toCharArray()) {
            if (Character.isWhitespace(c) || c == '.' || c == ',' || c == ';') {
                if (enPalabra) {
                    palabras++;
                    enPalabra = false;
                }
                resultado += (c != ' ') ? c + " " : c;
            } else {
        






    }

    
}