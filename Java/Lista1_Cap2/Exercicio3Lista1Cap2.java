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
public class Exercicio3Lista1Cap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leitura=new Scanner(System.in);
        Integer numero;
        System.out.println("Informe um número inteiro que deseja mostrar o inverso, esse número deve conter no máximo 9 dígitos:");
        numero=leitura.nextInt();
        
        Integer a = new Integer(numero);
		String b = a.toString();
		String c = "";
		for (int i=b.length(); i > 0; i--) {
			c += b.substring(i - 1, i);
		}
		System.out.println("numero invertido:" + c);
        }
    }
    

