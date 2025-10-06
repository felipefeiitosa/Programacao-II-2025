package gestaoVeiculos;

public class Caminhao extends Veiculo {
    private double capacidadeCarga;
    private boolean verCapacidade;

    public Caminhao(String placa, String marca, Double preco, double capacidadeCarga, boolean verCapacidade) {
        super(placa, marca, preco);
        this.capacidadeCarga = capacidadeCarga;
        this.verCapacidade = verCapacidade;
    }
    public double getCapacidadeCarga() {
        return this.capacidadeCarga;
    }
    public boolean getVerCapacidade() {
        return this.verCapacidade;
    }
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Capacidade de carga: " + getCapacidadeCarga() + " toneladas");
    }
    public void mostrarDados(boolean verCapacidade) {
        if (verCapacidade) {
            super.mostrarDados();
            double kg = capacidadeCarga * 1000;
            System.out.println("A capacidade de carga em quilogramas é: " + kg + "kg");
        }
        else {
            this.mostrarDados();
        }
    }
    public void mostrarDados(double desconto) {
        super.mostrarDados(desconto);
        if (verCapacidade) {
            double kg = capacidadeCarga * 1000;
            System.out.println("A capacidade de carga em quilogramas é: " + kg + "kg");
        } 
        else {
            System.out.println("Capacidade de carga: " + getCapacidadeCarga() + " toneladas");
        }
    }
}