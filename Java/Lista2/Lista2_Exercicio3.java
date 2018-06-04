/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista2;

import java.util.Scanner;

/**
 *
 * @author Carlos Antonio
 */
public class Lista2_Exercicio3 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        float n1, n2, n3, media;
        System.out.println("Informe primeira nota");
        n1 = leitura.nextFloat();

        System.out.println("Informe segunda nota");
        n2 = leitura.nextFloat();

        System.out.println("Informe terceira nota");
        n3 = leitura.nextFloat();

        if ((n1 > n2) && (n1 > n3)) {
            System.out.println("A maior Nota É " + n1);
        } 
        else if ((n2 > n1) && (n2 > n3)) {
            System.out.println("A maior Nota É " + n2);
                  
        }else if ((n3>n1)&&(n3>n2)){
            System.out.println("A maior Nota É "+n3);        
        }
       media=((n1+n2+n3)/3);
            System.out.println("A media das Notas é "+ media);
                        
    }
}
