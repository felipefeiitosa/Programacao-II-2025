public class Bilheteria {
    private int totalIngressos;
    private int qtdInteira, qtdMeia, qtdPromo, qtdGratis;
    private double acumuloTotal;

    public void registroVenda(Venda v) {
        totalIngressos += v.getQuantidade();
        if (v.getCategoria().equals("Inteira")) {
            qtdInteira += v.getQuantidade();

        } else if (v.getCategoria().equals("Meia")) {
            qtdMeia += v.getQuantidade();
        } else if (v.getCategoria().equals("Promocional")) {
            qtdPromo += v.getQuantidade();
        } else if (v.getCategoria().equals("Gratis")) {
            qtdGratis += v.getQuantidade();
        }
        acumuloTotal += v.getValorTotal();
    }
    public void exibirRelatorio() {
        System.out.println("\n==== RELATÓRIO ====");
        System.out.println("Ingressos vendidos: " + totalIngressos);
        System.out.println("Inteira: " + qtdInteira);
        System.out.println("Meia: " + qtdMeia);
        System.out.println("Promocional: " + qtdPromo);
        System.out.println("Grátis: " + qtdGratis);
        System.out.printf("Valor total recebido: R$ %.2f", acumuloTotal);
    }
}
