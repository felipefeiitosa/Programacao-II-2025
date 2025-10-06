package gestaoVeiculos;

public class Carro extends Veiculo {
    private int numPortas;
    private boolean verNumPortas;
    public Carro(String placa, String marca, Double preco, int numPortas, boolean verNumPortas) {
        super(placa, marca, preco);
        this.numPortas = numPortas;
        this.verNumPortas = verNumPortas;
        
    }
        public int getNumPortas(){
            return this.numPortas;
    }
        public boolean getVerNumPortas(){
            return this.verNumPortas;
    }
        public void mostrarDados(){
            super.mostrarDados();
            System.out.println("Número de portas: " + getNumPortas());
        }
        public void mostrarDados(boolean verNumPortas) {
            if (verNumPortas) {
                this.mostrarDados();
            }
            else {
                super.mostrarDados();
            }
        }
        public void mostrarDados(double desconto) {
        super.mostrarDados(desconto);
        if (verNumPortas) {
            System.out.println("Número de portas: " + getNumPortas());
        }
    }
}