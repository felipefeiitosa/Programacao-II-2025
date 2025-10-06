package gestaoLoja;

public class Vestuario extends Produto {
    private String tamanho;
    private String cor;

    public Vestuario(String codigo, String nome, double preco, String tamanho, String cor) {
        super(codigo, nome, preco);
        this.tamanho = tamanho;
        this.cor = cor;
    }
    public String getTamanho() {
        return tamanho;
    }
    public String getCor() {
        return cor;
    }
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Cor: " + cor);
    }
    public void mostrarDados(boolean verCor) {
        if(verCor) {
            System.out.println("Cor: " + cor);
        }
        else {
            mostrarDados();
        }
    }


}
