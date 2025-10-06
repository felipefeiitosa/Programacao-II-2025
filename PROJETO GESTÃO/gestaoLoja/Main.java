package gestaoLoja;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n===== GERENCIA DE PRODUTOS =====");
            System.out.println("1. Cadastrar Alimento");
            System.out.println("2. Cadastrar Eletrônico");
            System.out.println("3. Cadastrar Vestuário");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();
            try {
                switch (opcao) {
                    case 1:
                        System.out.print("Código: ");
                        String codigoAlimento = sc.nextLine();
                        System.out.print("Nome: ");
                        String nomeAlimento = sc.nextLine();
                        System.out.print("Preço: ");
                        double precoAlimento = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Data de Validade (dd/mm/aaaa): ");
                        String dataValidade = sc.nextLine();
                        
                        Alimento alimento = new Alimento(codigoAlimento, nomeAlimento, precoAlimento, dataValidade);
                        alimento.mostrarDados();
                        
                        System.out.print("Deseja ver a validade? (s/n) ");
                        boolean verValidade = sc.nextLine().equalsIgnoreCase("s");
                        alimento.mostrarDados(verValidade);
                        
                        System.out.print("Deseja aplicar desconto? (0 a 100): ");
                        double descontoAlimento = sc.nextDouble();
                        sc.nextLine();

                        alimento.mostrarDados(descontoAlimento);
                        break;
                    case 2:
                        System.out.print("Código: ");
                        String codigoEletronico = sc.nextLine();
                        System.out.print("Nome: ");
                        String nomeEletronico = sc.nextLine();
                        System.out.print("Preço: ");
                        double precoEletronico = sc.nextDouble();
                        System.out.print("Garantia (meses): ");
                        int garantia = sc.nextInt();
                        sc.nextLine();
                        
                        Eletronico eletronico = new Eletronico(codigoEletronico, nomeEletronico, precoEletronico, garantia);
                        eletronico.mostrarDados();
                        
                        System.out.print("Deseja ver a garantia em anos? (s/n): ");
                        boolean verGarantia = sc.nextLine().equalsIgnoreCase("s");
                        eletronico.mostrarDados(verGarantia);
                        System.out.print("Deseja aplicar desconto? (0 a 100): ");
                        double descontoEletronico = sc.nextDouble();
                        eletronico.mostrarDados(descontoEletronico);
                        break;
                    case 3:
                        System.out.print("Código: ");
                        String codigoVestuario = sc.nextLine();
                        System.out.print("Nome: ");
                        String nomeVestuario = sc.nextLine();
                        System.out.print("Preço: ");
                        double precoVestuario = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Tamanho: ");
                        String tamanho = sc.nextLine();
                        System.out.print("Cor: ");
                        String cor;
                        cor = sc.nextLine();
                        Vestuario vestuario = new Vestuario(codigoVestuario, nomeVestuario, precoVestuario, tamanho, cor);
                        vestuario.mostrarDados();
                        System.out.print("Deseja ver a cor? (s/n): ");
                        boolean verCor = sc.nextLine().equalsIgnoreCase("s");
                        vestuario.mostrarDados(verCor);
                        System.out.print("Deseja aplicar desconto? (0 a 100): ");
                        double descontoVestuario = sc.nextDouble();
                        vestuario.mostrarDados(descontoVestuario);
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        continue;
                    case 0:
                        System.out.println("Saindo...");
                        sc.close();
                        return;
                }
            }
            catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
                sc.nextLine();
            }
        }
    }
}