package gestaoBancaria;

public class Conta {
    protected String numero;
    protected String titular;
    protected double saldo;

    public Conta(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    public String getNumero() {
        return numero;
    }
    public String getTitular() {
        return titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void mostrarDados() {
        System.out.printf("\nNúmero: %s\n", this.numero);
        System.out.printf("Titular: %s\n", this.titular);
        System.out.printf("Saldo: R$ %.2f\n", this.saldo);
    }
    public void mostrarDados(double projecaoMensal) {
        mostrarDados();
        double saldoProjetado = this.saldo * (1 + projecaoMensal / 100);
        System.out.printf("Saldo projetado (%.2f%%): R$ %.2f\n", projecaoMensal, saldoProjetado);
    }
}
