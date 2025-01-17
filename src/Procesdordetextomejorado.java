import  java.util.Scanner;

public class Procesdordetextomejorado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un texto para poder ver de que esta compuesta :");
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
                if (!enPalabra) enPalabra = true;
                letras++;
                resultado += (resultado.isEmpty() || resultado.endsWith(".") || resultado.endsWith("!") || resultado.endsWith("?"))
                        ? Character.toUpperCase(c) : Character.toLowerCase(c);
            }
        }
        if (enPalabra) palabras++;

        System.out.println("Texto procesado: " + resultado);
        System.out.println("Número de palabras: " + palabras);
        System.out.println("Número de letras: " + letras);
    }


        






    }

    
