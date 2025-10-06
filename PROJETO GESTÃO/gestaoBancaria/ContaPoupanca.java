package gestaoBancaria;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(String numero, String titular, double saldo, double taxaRendimento) {
        super(numero, titular, saldo);
        this.taxaRendimento = taxaRendimento;
    }
    public double getTaxaRendimento() {
        return taxaRendimento;
    }
    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
    public void mostrarDados() {
        super.mostrarDados();
        System.out.printf("Taxa de Rendimento: %.2f%%\n", this.taxaRendimento);
    }
    public void mostrarDados(boolean taxaAnual){
        if (taxaAnual) {
            mostrarDados();
            double valorAnual = this.taxaRendimento * 12;
            System.out.printf("Taxa de Rendimento Anual: %.2f%%\n", valorAnual);
        }
        else {
            mostrarDados();
        }
    }

}
