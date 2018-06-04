/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista3;

import java.util.Scanner;


/**
 *
 * @author Carlos Antonio
 */
public class Lista3_Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        for (int i = 1000; i < 2000; i++) {
            if (i % 11==5) {
                System.out.println("Números que tem o resto 5:"+i);
            }
        }
    }
    
}
