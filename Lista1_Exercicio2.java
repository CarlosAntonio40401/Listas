// Faça um algoritmo e implemente no (VISUALG) que leia uma
//temperatura em graus Centígrados e apresente a temperatura
//convertida em graus Fahrenheit. A equação de conversão é: F = (9 * C +
//160) / 5. Em que F é a temperatura em Fahrenheit e C é a temperatura
//em Centígrados. Faça também o algoritmo em fluxograma
package Lista1;

import java.util.Scanner;



/**
 *
 * @author Carlos Antonio
 */
public class Lista1_Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    float c,F;
    Scanner leitura = new Scanner(System.in);
    System.out.println("Informe a Temperatua em Graus Centigrados");
    c=leitura.nextFloat();
    System.out.println(c);
    F=(9*c+160)/5;
    System.out.println(F);
   
   
    
   
        
    
        // TODO code application logic here
    }
    
}
