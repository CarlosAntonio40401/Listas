package Lista3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista3_Exercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = leitor.nextInt();
        List<Integer> numeros = new ArrayList<Integer>();
        for (int i = 0; i <= num; i++) {
            numeros.add(i);
        }
        int contador;
        int numero = 0;
        for (Integer i : numeros) {
            contador = 0;
            for (int u = 1; u <= i; u++) {
                if (i % u == 0) {
                    contador++;
                    numero = u;
                }
            }
            if (contador == 2) {
                System.out.println("O Número: " + numero + " é primo ");
            }
        }
    }
}
