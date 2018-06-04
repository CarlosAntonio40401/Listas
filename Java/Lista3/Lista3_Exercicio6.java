package Lista3;

import java.util.Scanner;

/**
 *
 * @author Carlos Antonio
 */
public class Lista3_Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner lista3 = new Scanner(System.in);

        double valor1, valor2, valor3, soma, produto, media;

        System.out.println("Informe o 1º valor:");
        valor1 = lista3.nextDouble();
        System.out.println("Informe o 2º valor:");
        valor2 = lista3.nextDouble();
        System.out.println("Informe o 3º valor:");
        valor3 = lista3.nextDouble();

        while ((valor1 < valor2) && (valor2 < valor3) && (valor1 < valor3)) {
            soma = (valor1 + valor2 + valor3);
            produto = (valor1 * valor2 * valor3);
            media = (valor1 + valor2 + valor3) / 3;

            System.out.println("A soma:" + soma);
            System.out.println("o produto:" + produto);
            System.out.println("A média:" + media);

            System.out.println("Informe o 1º valor:");
            valor1 = lista3.nextDouble();
            System.out.println("Informe o 2º valor:");
            valor2 = lista3.nextDouble();
            System.out.println("Informe o 3º valor:");
            valor3 = lista3.nextDouble();

        }
    }

}
