package Lista1Cap2;

import java.util.Scanner;

/**
 *
 * @author Carlos Antonio
 */
public class Exercicio7Lista1Cap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leitura = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("informe o 1º número:");
        numero1 = leitura.nextInt();
        System.out.println("informe o 2º número:");
        numero2 = leitura.nextInt();
        
        if (numero1>numero2) {
            System.out.println(numero1+" is larger");
        }else if(numero2>numero1){
            System.out.println(numero2+" is larger");
        }else if (numero1==numero2) {
            System.out.println("These numbers are equal");
        }

    }

}
