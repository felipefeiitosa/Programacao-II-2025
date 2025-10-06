package gestaoBancaria;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n====== GESTÃO BANCÁRIA ======");
            System.out.println("1. Criar Conta Corrente");
            System.out.println("2. Criar Conta Poupança");
            System.out.println("3. Criar Conta Investimento");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();
            if (opcao == 0) {
                System.out.println("\nAté logo...");
                break;
            }
            else if (opcao == 1) {
                System.out.print("======= Cadastro Conta Corrente =======\n");
                System.out.print("Digite o número da conta: ");
                String numC = sc.nextLine();
                System.out.print("Digite o nome do titular: ");
                String titularC = sc.nextLine();
                System.out.print("Digite o saldo inicial: R$");
                double saldoC = sc.nextDouble();
                sc.nextLine();
                System.out.print("Digite o limite do cheque especial: R$");
                double limiteC = sc.nextDouble();
                sc.nextLine();

                ContaCorrente cc = new ContaCorrente(numC, titularC, saldoC, limiteC);
                cc.mostrarDados(true);
            }
            else if (opcao == 2) {
                System.out.print("======= Cadastro Conta Poupança =======\n");
                System.out.print("Digite o número da conta: ");
                String numP = sc.nextLine();
                System.out.print("Digite o nome do titular: ");
                String titularP = sc.nextLine();
                System.out.print("Digite o saldo inicial: R$");
                double saldoP = sc.nextDouble();
                sc.nextLine();
                System.out.print("Digite a taxa de rendimento mensal (em %): ");
                double taxaRendimento = sc.nextDouble();
                sc.nextLine();

                ContaPoupanca cp = new ContaPoupanca(numP, titularP, saldoP, taxaRendimento);
                cp.mostrarDados(true);
            }
            else if (opcao == 3) {
                System.out.print("======= Cadastro Conta Investimento =======\n");
                System.out.print("Digite o número da conta: ");
                String numI = sc.nextLine();
                System.out.print("Digite o nome do titular: ");
                String titularI = sc.nextLine();
                System.out.print("Digite o saldo inicial: R$");
                double saldoI = sc.nextDouble();
                sc.nextLine();
                System.out.print("Digite a taxa de administração (em %): ");
                double taxaAdm = sc.nextDouble();
                sc.nextLine();

                ContaInvestimento ci = new ContaInvestimento(numI, titularI, saldoI, taxaAdm);
                ci.mostrarDados(true);
            }
            else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        System.out.println("\n========================================");
        System.out.println("Sistema encerrado.");
        System.out.println("========================================");
        sc.close();
    }
}
