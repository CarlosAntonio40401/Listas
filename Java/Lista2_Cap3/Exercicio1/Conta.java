package Lista2Cap2;

/**
 *
 * @author Carlos Antonio
 */
public class Conta {

    Double valorSaque = 0.0;
    Double saldo = 0.0;
    Double valorDeposito = 0.0;

    public void saque(double valorSaque) {
        
        if (valorSaque>saldo ) {

            System.out.println("Saldo insuficiente!" + saldo);
        } else {
            
            saldo = saldo - valorSaque;
            System.out.println("Saque Efetuado com sucesso!");
        }
    }

    public void deposito(double valorDeposito) {
        saldo = saldo + valorDeposito;
    }

    public void impressaoSaldo() {

        System.out.println("--------IMPRESSAO SALDO--------------");
        System.out.println("Nome: Joanzinho");
        System.out.println("RG: 9.3454.00");
        System.out.println("Saldo disponível:");
        System.out.println("Valor:" + saldo+"R$");
        System.out.println("--------FIM IMPRESSAO SALDO--------------");
    }
}
