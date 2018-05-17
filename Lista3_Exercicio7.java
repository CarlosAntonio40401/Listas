package Lista3;

import java.util.Scanner;

/**
 *
 * @author Carlos Antonio
 */
public class Lista3_Exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner lista3 = new Scanner(System.in);
        double mediaF, contaMedia = 0, mediaTurma, mediaMaior = 0, menorMedia = 0;
        int contador = 0;
        System.out.println("Programa encerra quando digitar um valor negativo");
        System.out.println("Informe a média final do aluno:");
        mediaF = lista3.nextDouble();
        mediaMaior = mediaF;
        menorMedia = mediaF;
        while (mediaF > 0) {
            contador = contador + 1;
            contaMedia = (mediaF + contaMedia);
            if (mediaMaior < mediaF) {
                mediaMaior = mediaF;
            } else if (menorMedia > mediaF) {
                menorMedia = mediaF;
            }
            System.out.println("Informe a média final do aluno:");

            mediaF = lista3.nextDouble();

        }
        mediaTurma = contaMedia / contador;
        System.out.println("Maior:" + mediaMaior);
        System.out.println("Menor:" + menorMedia);
        System.out.println("Media geral:" + mediaTurma);

    }

}
