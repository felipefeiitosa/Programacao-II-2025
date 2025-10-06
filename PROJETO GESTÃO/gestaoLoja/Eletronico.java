package gestaoLoja;

public class Eletronico extends Produto {
    private int garantia;

    public Eletronico(String codigo, String nome, double preco, int garantia) {
        super(codigo, nome, preco);
        this.garantia = garantia;
    }
    public int getGarantia() {
        return garantia;
    }
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Garantia: " + garantia + " meses");
    }
    public void mostrarDados(boolean verGarantia) {
        if(verGarantia) {
            double garantiaAnos = garantia / 12.0;
            System.out.println("Garantia em anos: " + garantiaAnos + " anos");
        }
        else {
            mostrarDados();
        }
    }
}

