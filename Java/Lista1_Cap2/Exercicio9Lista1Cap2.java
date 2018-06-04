/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1Cap2;

import java.util.Scanner;

/**
 *
 * @author Carlos Antonio
 */
public class Exercicio9Lista1Cap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leitura = new Scanner(System.in);
        int numero1, numero2;
        
        System.out.println("Vamos determinar se numero1 é multiplo de numero2.\n");
        System.out.println("Insira o valor de numero1:");
        numero1 = leitura.nextInt();
        System.out.println("Insira o valor de numero2:");
        numero2 = leitura.nextInt();
        
       
        int multiplicador = numero1 / numero2;
        if (numero1 % numero2 == 0){
            System.out.println(numero1 + " é múltiplo de " + numero2 + ", seu multiplicador é " + multiplicador);
        }else{
            System.out.println(numero1 + " não é múltiplo de " + numero2);
        
        }
        
    }
    
    
}

    

