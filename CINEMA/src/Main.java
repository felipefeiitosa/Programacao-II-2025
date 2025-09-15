import java.util.Scanner;
public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        Bilheteria bilheteria = new Bilheteria();
        String continuar;
        int pagamento;

        while (true) {
            System.out.print("Quantidade de ingressos: ");
            int qtd = sc.nextInt();
            System.out.print("Tipo (1-Inteira, 2-Meia, 3-Promocional): ");
            int tipo = sc.nextInt();
            System.out.print("Idade: ");
            int idade = sc.nextInt();

            Venda venda = new Venda(qtd, idade, tipo);

            System.out.println("\nResumo da Compra:");
            System.out.println("Tipo do ingresso: " + venda.getCategoria());
            System.out.printf("Valor total: R$ %.2f" , venda.getValorTotal());

            if (venda.getValorTotal() > 0) {
                while (true) {
                    System.out.print("\nForma de pagamento (1-Dinheiro, 2-Cartão): ");
                    pagamento = sc.nextInt();

                    if (pagamento == 1 || pagamento == 2) {
                        break;
                    } else {
                        System.out.println("Opção inválida! Digite 1 para Dinheiro ou 2 para Cartão.");
                    }
                }

                if (pagamento == 1) {
                    System.out.print("Digite o valor pago: ");
                    double pago = sc.nextDouble();
                    if (pago >= venda.getValorTotal()) {
                        System.out.println("Troco: R$ " + (pago - venda.getValorTotal()));
                    } else {
                        System.out.println("Valor insuficiente!");
                    }
                } else {
                    System.out.println("Pagamento confirmado no cartão");
                }
            }
            else {
                System.out.println("\nIngresso grátis, não é necessário pagamento!");
            }

            bilheteria.registroVenda(venda);

            while (true) {
                System.out.print("\nAtender próximo cliente? (S/N): ");
                continuar = sc.next();
                if (continuar.equalsIgnoreCase("S") || continuar.equalsIgnoreCase("N")) {
                    break;
                } else {
                    System.out.println("Opção inválida! Digite S para sim ou N para não.");
                }
            }
            if (continuar.equalsIgnoreCase("N")) {
                break;
            }

        }
        bilheteria.exibirRelatorio();
        sc.close();
    }
}