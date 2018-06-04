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
public class Lista3_Exercicio3 {

    /**
     * @param args the command line arguments
     *
     * //Faça um algoritmo que calcula e escreve a seguinte soma: //soma = 1/1 +
     * 3/2 + 5/3 + 7/4 + ... + 99/50
     */
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int num1 = 1, num2 = 1, i = 0;
        double soma = 0;

        // verificar com o professor porque o resultado está errado
        for (num2 = 1; num2 < 51; num2++) {
            double numero1 = num1, numero2 = num2;
            soma = soma + (numero1 / numero2);

            System.out.println("Resultado:" + num1 + "/" + num2+ "=" + soma);
            num1 = num1 + 2;

        }
        System.out.println("Soma: " + soma);
    }

}
