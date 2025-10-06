package gestaoBancaria;

public class ContaCorrente extends Conta {
    private double limiteCheque;
    
    public ContaCorrente(String numero, String titular, double saldo, double limiteCheque) {
        super(numero, titular, saldo);
        this.limiteCheque = limiteCheque;
    }
    public double getLimiteCheque() {
        return limiteCheque;
    }
    public void setLimiteCheque(double limiteCheque) {
        this.limiteCheque = limiteCheque;
    }
    public void mostrarDados() {
        super.mostrarDados();
        System.out.printf("Limite do Cheque Especial: R$ %.2f\n", this.limiteCheque);
    }
    public void mostrarDados(boolean detalharLimite){
        if (detalharLimite) {
            mostrarDados();
            double saldoDisponivel = getSaldo() + this.limiteCheque;
            System.out.printf("Saldo Disponível (com limite incluso): R$ %.2f\n", saldoDisponivel);
        }
        else {
            mostrarDados();
        }
    }
}
