package desafio1;

import java.util.Scanner;

public class DetectorPalindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase:");
        String texto = sc.nextLine();

        // Normalizar: tirar espaços, colocar tudo minúsculo
        String normalizado = texto.replaceAll("\\s+", "").toLowerCase();

        // Inverter
        String invertido = new StringBuilder(normalizado).reverse().toString();

        if (normalizado.equals(invertido)) {
            System.out.println("Resultado: É um palíndromo!");
        } else {
            System.out.println("Resultado: Não é um palíndromo.");
        }

        sc.close();
    }
}
