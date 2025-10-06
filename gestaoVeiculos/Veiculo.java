package gestaoVeiculos;

public class Veiculo {
    protected String placa;
    protected String marca;
    protected Double preco;

    public Veiculo(String placa, String marca, Double preco) {
        this.placa = placa;
        this.marca = marca;
        this.preco = preco;
    }

    public String getPlaca(){
        return placa;
    }

    public String getMarca(){
        return marca;
    }

    public Double getPreco(){
        return preco;
    }

    public void mostrarDados(){
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Preço: R$" + getPreco());
    }

    public void mostrarDados(double desconto) {
        if (desconto < 0 || desconto > 100) {
            System.out.println("Desconto inválido");
        }
        else {
            double valorDesconto = preco * (desconto / 100);
            double valorFinal = preco - valorDesconto;

            System.out.println("Placa: " + getPlaca());
            System.out.println("Marca: " + getMarca());
            System.out.printf("Preço com desconto: " + "R$%.2f\n", valorFinal);
        }
    }
}
