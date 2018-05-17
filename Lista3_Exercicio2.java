/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista3;


/**
 *
 * @author Carlos Antonio
 */
public class Lista3_Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 10; i++) {
            
            System.out.println("Tabuada do número:"+i);
            
            for (int j = 0; j < 11; j++) {
                
                System.out.println(i + "X" + j+"="+(j*i));
            }   
        }
    }
}
