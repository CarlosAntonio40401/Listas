/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;

import java.util.Scanner;

/**
 *
 * @author Carlos Antonio
 */
public class Lista1_Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double num1,num2;
        Scanner leitura = new Scanner(System.in);
        
        System.out.println("Entre com o Primeiro Numero:");
        num1 = leitura.nextDouble();
        System.out.println("Entre com o Segundo Numero:");
        num2 = leitura.nextDouble();
        System.out.println("Soma "+(num1+num2));
        System.out.println("Diferencça "+(num1-num2));
        System.out.println("Produto "+(num1*num2));
        System.out.println("Media "+((num1+num2)/2));
        
        
        
        
        
        // TODO code application logic here
    }
    
}
