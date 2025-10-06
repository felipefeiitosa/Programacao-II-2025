package gestaoBancaria;

public class ContaInvestimento extends Conta {
    private double taxaAdministracao;

    public ContaInvestimento(String numero, String titular, double saldo, double taxaAdministracao) {
        super(numero, titular, saldo);
        this.taxaAdministracao = taxaAdministracao;
    }
    public double getTaxaAdministracao() {
        return taxaAdministracao;
    }
    public void setTaxaAdministracao(double taxaAdministracao) {
        this.taxaAdministracao = taxaAdministracao;
    }
    public void mostrarDados() {
        super.mostrarDados();
        System.out.printf("Taxa de Administração: %.2f%%\n", this.taxaAdministracao);
    }
    public void mostrarDados(boolean considerarTaxa) {
        if(considerarTaxa) {
            mostrarDados();
            double saldoLiquido = getSaldo() * (1 - this.taxaAdministracao / 100);
            System.out.printf("Saldo Líquido (descontando taxa de ADM): R$ %.2f\n", saldoLiquido);
        }
        else {
            mostrarDados();
        }
    }
}
