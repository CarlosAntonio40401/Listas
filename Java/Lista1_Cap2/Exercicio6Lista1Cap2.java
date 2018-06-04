package Lista1Cap2;

import java.util.Scanner;

/**
 *
 * @author Carlos Antonio
 */
public class Exercicio6Lista1Cap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("O exercício foi feito por suposição porque na lista não contém a figura 2.7");

        Scanner leitura = new Scanner(System.in);
        int num1, num2;
        double quo1,quo2;
        System.out.println("Entre com o Primeiro Numero:");
        num1 = leitura.nextInt();
        System.out.println("Entre com o Segundo Numero:");
        num2 = leitura.nextInt();
        System.out.println("Soma " + (num1 + num2));

        System.out.println("Produto " + (num1 * num2));
        System.out.println("Diferencça " + (num1 - num2));
        quo1=num1;
        quo2=num2;
        System.out.println("Divisão " + ((quo1 / quo2)));

    }

}
