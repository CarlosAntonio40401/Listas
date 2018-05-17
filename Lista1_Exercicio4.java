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
public class Lista1_Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float a,b,c;        
        Scanner leitura=new Scanner (System.in);
        System.out.println("Informe o Valor de A");
        a=leitura.nextFloat();
        System.out.println("Informe o Valor de B");
        b=leitura.nextFloat();
        c=a;
        a=b;
        b=c;
        System.out.println("Novo Valor de A  "+a );
        System.out.println("Novo Valor de B  "+b);
               // TODO code application logic here
    }
    
}
