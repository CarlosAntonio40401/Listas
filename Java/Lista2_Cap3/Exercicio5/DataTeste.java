package Lista2Cap2.Exercicio5;

import java.util.Scanner;

/**
 *
 * @author Carlos Antonio
 */
public class DataTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        Data data = new Data();

        int dia, mes, ano;

        System.out.println("Digite o dia:");
        dia = leitura.nextInt();
        data.setDia(dia);

        System.out.println("Digite o mês:");
        mes = leitura.nextInt();
        data.setMes(mes);

        System.out.println("Digite o ano:");
        ano = leitura.nextInt();
        data.setAno(ano);

        data.mostraData();
    }

}
