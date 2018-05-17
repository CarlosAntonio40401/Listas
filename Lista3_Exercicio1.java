package Lista3;

import java.util.Scanner;

/**
 *
 * @author Carlos Antonio
 */
public class Lista3_Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double numero,maior=0,menor = 0;
        
        System.out.println("Informe o 1º valor:");
            numero=leitura.nextDouble();
            menor=numero;
        for (int i = 2; i < 16; i++) {
            System.out.println("Informe o "+i+" valor:");
            numero=leitura.nextDouble();
            if (numero>maior) {
                maior=numero;
            }
            
            if (numero < menor) {
                menor=numero;
            }
        }
        System.out.println("o maior número é:"+maior);
        System.out.println("o menor número é:"+menor);
    }

}
