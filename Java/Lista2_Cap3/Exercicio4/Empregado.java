package Lista2Cap2.Exercicio4;

/**
 *
 * @author Carlos Antonio
 */
public class Empregado {
    
    private String primeiroNome;
    private String sobrenome;
    private Double salarioMensal;

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(Double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public double salarioAnualSemAumento(double salarioMensal) {
        if (salarioMensal < 0) {
            salarioMensal = 0.0;
        }
        double salarioAnual = salarioMensal * 12;
        return salarioAnual;
    }

    public double aumentoPercentual(Double salarioMensal) {
        if (salarioMensal < 0) {
            salarioMensal = 0.0;
        }
       
        double aumento=0.10;
        double salarioAumentado=(salarioMensal*aumento)+salarioMensal;
       
        return salarioAumentado*12;
    }

    public void mostrarDadosEmpregados(){
        System.out.println("Informações sobre o empregado:");
        System.out.println("Nome: " + getPrimeiroNome());
        System.out.println("Sobrenome: " +getSobrenome());
        System.out.println("Salário anual sem aumento é: R$ " +salarioAnualSemAumento(salarioMensal));
        System.out.println("Salário anual com aumento de 10% é: R$ " +aumentoPercentual(salarioMensal));

    }

}
