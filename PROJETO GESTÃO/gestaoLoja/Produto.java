package gestaoLoja;

public class Produto {
    protected String codigo;
    protected String nome;
    protected double preco;

    public Produto(String codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public void mostrarDados() {
        System.out.println("\n=== Dados do Produto ===");
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
    }
    public void mostrarDados(double desconto) {
        mostrarDados();
        if (desconto < 0 || desconto > 100) {
            System.out.println("Desconto inválido. Deve ser entre 0 e 100.");
            return;
        }
        else { 
            double precoComDesconto = preco - (preco * desconto / 100);
            System.out.println("Preço com desconto de " + desconto + "%: R$ " + precoComDesconto);
        }
    }
}