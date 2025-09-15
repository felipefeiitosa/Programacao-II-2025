public class Venda {
    private int quantidade, idade,tipoIngresso;
    private double valorTotal;
    private String categoria;

    public Venda(int quantidade, int idade, int tipoIngresso) {
        this.quantidade = quantidade;
        this.idade = idade;
        this.tipoIngresso = tipoIngresso;
        calcularValor();
    }

    public void calcularValor() {
        if (idade <= 5) {
            valorTotal = 0;
            categoria = "Gratis";
        } else {
            double precoIngresso = 30;
            if (tipoIngresso == 1) {
                precoIngresso = 30;
                categoria = "Inteira";
            } else if (tipoIngresso == 2) {
                precoIngresso = 30 * 0.5;
                categoria = "Meia";
            } else if (tipoIngresso == 3) {
                precoIngresso = 30 * 0.7;
                categoria = "Promocional";
            }
            valorTotal = precoIngresso * quantidade;
        }
    }

    public double getValorTotal() { return valorTotal; }
    public String getCategoria() { return categoria; }
    public int getQuantidade() { return quantidade;}

            }
