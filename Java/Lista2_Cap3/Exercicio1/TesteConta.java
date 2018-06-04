package Lista2Cap2;

import java.util.Scanner;

/**
 *
 * @author Carlos Antonio
 */
public class TesteConta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta c = new Conta();
        Scanner leitura = new Scanner(System.in);
        int opcao = 0;

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Deposíto");
        System.out.println("2 - Saque");
        System.out.println("3 - Impressão de saldo");
        opcao = leitura.nextInt();
        while (opcao != 4) {

            switch (opcao) {
                case 1:
                    c.impressaoSaldo();
                    System.out.println("Informe o valor do deposito:");
                    double valor = leitura.nextDouble();
                    c.deposito(valor);

                    c.impressaoSaldo();
                    break;
                case 2:
                    c.impressaoSaldo();
                    System.out.println("Informe o valor do saque:");
                    Double valorSaque = leitura.nextDouble();
                    c.saque(valorSaque);

                    c.impressaoSaldo();
                    break;
                case 3:
                    c.impressaoSaldo();
                    break;
                default:
                    System.out.println("Essa opção nao é válida!");

            }

            System.out.println("Escolha uma opção:");
            System.out.println("1 - Deposíto");
            System.out.println("2 - Saque");
            System.out.println("3 - Impressão de saldo");
            System.out.println("4 - Sair");
            opcao = leitura.nextInt();
        }

    }
}
