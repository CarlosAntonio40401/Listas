package Lista2Cap2.Exercicio3;

import java.util.Scanner;

/**
 *
 * @author Carlos Antonio
 */
public class FaturaTeste {

    
    public static void main(String[] args) {
        
        Fatura fat = new Fatura();

        Scanner leitura=new Scanner(System.in);
        
        
        String numero, tipo;
        int qtdCompradaItem;
        double precoItem;
        
        System.out.println("Digite o número da fatura:");
        numero=leitura.next();
        fat.setNumero(numero);
        
        System.out.println("Digite o tipo da fatura:");
        tipo=leitura.next();
        fat.setTipo(tipo);
        
        System.out.println("Digite a quantidade comprada:");
        qtdCompradaItem=leitura.nextInt();
        fat.setQtdCompradaItem(qtdCompradaItem);
        
        System.out.println("Informe o preço do item:");
        precoItem=leitura.nextDouble();
        fat.setPrecoItem(precoItem);
        
        System.out.println("**************Dados da fatura*****************");
        System.out.println("");
        System.out.println("Nº da fatura: "+fat.getNumero());
        System.out.println("Tipo de fatura: "+fat.getTipo());
        System.out.println("Quantidade comprada: "+fat.getQtdCompradaItem());
        System.out.println("Preço do item: "+fat.getPrecoItem()+" R$");
        System.out.println("Total da fatura: "+fat.calcula(qtdCompradaItem, precoItem)+" R$");
    }
    
}
