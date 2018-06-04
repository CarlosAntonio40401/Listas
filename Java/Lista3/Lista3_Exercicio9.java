package Lista3;

import java.util.Scanner;

/**
 *
 * @author Carlos Antonio
 */
public class Lista3_Exercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = leitor.nextInt();
        int primo = 0;
        for(int i = 2; i < num;i++){
            if(num%i==0){
                primo = 1;
            }
        }
        if(primo==0){
            System.out.println("primo");
        }
        else{
            System.out.println("Nao primo");
        }  
    }
    }


