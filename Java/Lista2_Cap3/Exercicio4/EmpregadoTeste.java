package Lista2Cap2.Exercicio4;

import java.util.Scanner;

/**
 *
 * @author Carlos Antonio
 */
public class EmpregadoTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado();
        Scanner leitura = new Scanner(System.in);

        String nome, sobrenome;
        double salarioMensal;

        System.out.println("Digite os dados do empregado 1");
        System.out.println("Digite o primeiro nome do empregado:");
        nome = leitura.next();
        empregado1.setPrimeiroNome(nome);

        System.out.println("Digite o sobrenome:");
        sobrenome = leitura.next();
        empregado1.setSobrenome(sobrenome);

        System.out.println("Digite o salário:");
        salarioMensal = leitura.nextDouble();
        empregado1.setSalarioMensal(salarioMensal);

        System.out.println("Salário anual sem aumento do empregado 1: R$ " + empregado1.salarioAnualSemAumento(salarioMensal) + "\n");

        Empregado empregado2 = new Empregado();

        System.out.println("***********Dados do Empregado 2************");
        System.out.println("Digite o primeiro nome do empregado 2:");
        nome = leitura.next();
        empregado2.setPrimeiroNome(nome);

        System.out.println("Digite o sobrenome:");
        sobrenome = leitura.next();
        empregado2.setSobrenome(sobrenome);

        System.out.println("Digite o salário:");
        salarioMensal = leitura.nextDouble();
        empregado2.setSalarioMensal(salarioMensal);

        System.out.println("Salário anual sem aumento do empregado 2: R$ " + empregado2.salarioAnualSemAumento(salarioMensal) + "\n");

        System.out.println("Informações do empregado 1 com aumento de 10%:");
        empregado1.mostrarDadosEmpregados();
        System.out.println("");
        System.out.println("Informações do empregado 2 com aumento de 10%:");
        empregado2.mostrarDadosEmpregados();
    }

}
