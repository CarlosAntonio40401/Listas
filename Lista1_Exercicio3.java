
//calcular e apresentar o valor do volume de uma lata de óleo, utilizando a
//equação: Volume = PI * raio2 * altura.
package Lista1;

import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author Carlos Antonio
 */
public class Lista1_Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    double altura,volume,raio;
    Scanner leitura = new Scanner(System.in);
    System.out.println("Informe a altura da Lata");
    altura=leitura.nextDouble();
    System.out.println("Informe o raio da Lata");
    raio=leitura.nextDouble();
    volume=(PI*Math.pow(raio, 2)*altura);
    System.out.println(volume);
    
    
        // TODO code appl
}
}