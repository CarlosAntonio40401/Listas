package Lista1Cap2;

import java.util.Scanner;

/**
 *
 * @author Carlos Antonio
 */
public class Exercicio1Lista1Cap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitura = new Scanner(System.in);

        double descontos, total, aluguelMensal1 = 550, aluguelMensal2 = 605, aluguelMensal3 = 665.50, aluguelMensal4 = 732.05;

        System.out.println("Dados aluguel:");
        System.out.println("1 ano - " + aluguelMensal1 + " - " + (aluguelMensal1 * 12) + " anual");
        System.out.println("2 ano - " + aluguelMensal2 + " - " + (aluguelMensal2 * 12) + " anual");
        System.out.println("3 ano - " + aluguelMensal3 + " - " + (aluguelMensal3 * 12) + " anual");
        System.out.println("4 ano - " + aluguelMensal4 + " - " + (aluguelMensal4 * 12) + " anual");
        total = ((aluguelMensal1 * 12) + (aluguelMensal2 * 12) + (aluguelMensal3 * 12) + (aluguelMensal4 * 12));
        System.out.println("Total:" + total);

        System.out.println("Informe o percentual de descontos:");
        descontos = leitura.nextDouble();
        System.out.println("O total do aluguel com desconto é: " + ((total - (total / 100) * descontos)));

    }

}
