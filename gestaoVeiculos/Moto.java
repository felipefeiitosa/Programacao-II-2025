package gestaoVeiculos;

public class Moto extends Veiculo {
    private int cilindradas;
    private boolean cavalosPotencia;
    
    public Moto(String placa, String marca, Double preco, int cilindradas, boolean cavalosPotencia) {
        super(placa, marca, preco);
        this.cilindradas = cilindradas;
        this.cavalosPotencia = cavalosPotencia;
    }    
    public int getCilindradas() {
        return this.cilindradas;
    }
    public boolean getCavalosPotencia() {
        return this.cavalosPotencia;
    }
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Cilindradas: " + getCilindradas());
    }
    public void mostrarDados(boolean cavalosPotencia) {
        if(cavalosPotencia) {
            super.mostrarDados();
            double cavalos = cilindradas / 25.0;
            System.out.printf("A potência em cavalos é: %.1f\n", cavalos);
        }
        else {
            this.mostrarDados();
        }
    }
    public void mostrarDados(double desconto) {
        super.mostrarDados(desconto);
        if (cavalosPotencia) {
            double cavalos = cilindradas / 25.0;
            System.out.printf("A potência em cavalos é: %.1f\n", cavalos);
        } 
        else {
            System.out.println("Cilindradas: " + getCilindradas());
        }
    }
}   