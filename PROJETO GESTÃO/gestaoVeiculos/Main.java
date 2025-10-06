package gestaoVeiculos;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Veiculo> garagem = new ArrayList<>();

        while (true) {
            System.out.println("\n===== GERENCIA DE VEÍCULOS =====");
            System.out.println("1. Cadastrar Carro");
            System.out.println("2. Cadastrar Moto");
            System.out.println("3. Cadastrar Caminhão");
            System.out.println("4. Sair e mostrar todos os veículos");
            System.out.print("\nEscolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.print("\n======= Cadastro Carro =======\n");
                System.out.print("\nDigite a placa do carro: ");
                String placa = sc.nextLine();
                System.out.print("Digite a marca do carro: ");
                String marca = sc.nextLine();
                System.out.print("Digite o preço do carro: R$");
                Double preco = sc.nextDouble();
                System.out.print("Digite o número de portas do carro: ");
                int numPortas = sc.nextInt();
                sc.nextLine();
                System.out.print("Deseja ver o número de portas? (s/n)");
                boolean verNumPortas = sc.nextLine().equalsIgnoreCase("s");
           
                Carro carro = new Carro(placa, marca, preco, numPortas, verNumPortas);
                garagem.add(carro);
                System.out.println("\nSeu carro foi registrado!");
            }
            else if (opcao == 2) {
                System.out.print("\n======= Cadastro Moto =======\n");
                System.out.print("\nDigite a placa da moto: ");
                String placa = sc.nextLine();
                System.out.print("Digite a marca da moto: ");
                String marca = sc.nextLine();
                System.out.print("Digite o preço da moto: R$");
                Double preco = sc.nextDouble();
                System.out.print("Digite as cilindradas da moto: ");
                int cilindradas = sc.nextInt();
                sc.nextLine();
                System.out.print("Deseja ver a potência em cavalos? (s/n)");
                boolean cavalosPotencia = sc.nextLine().equalsIgnoreCase("s");
                
                Moto moto = new Moto(placa, marca, preco, cilindradas, cavalosPotencia);
                garagem.add(moto);
                System.out.println("\nSua moto foi registrada!");
            }
            else if (opcao == 3) {
                System.out.print("\n======= Cadastro Caminhão =======\n");
                System.out.print("Digite a placa do caminhão: ");
                String placa = sc.nextLine();
                System.out.print("Digite a marca do caminhão: ");
                String marca = sc.nextLine();
                System.out.print("Digite o preço do caminhão: R$");
                Double preco = sc.nextDouble();
                System.out.print("Digite a capacidade de carga do caminhão (em toneladas): ");
                double capacidadeCarga = sc.nextDouble();
                sc.nextLine();
                System.out.print("Deseja ver a capacidade em quilogramas? (s/n)");
                boolean verCapacidade = sc.nextLine().equalsIgnoreCase("s");
                
                Caminhao caminhao = new Caminhao(placa, marca, preco, capacidadeCarga, verCapacidade);
                garagem.add(caminhao);
                
                System.out.println("\nSeu caminhão foi registrado!");
            }
            else if (opcao == 4) {
                if (garagem.isEmpty()) {
                    System.out.println("Nenhum veículo cadastrado.");
                }
                else {
                    System.out.print("Deseja aplicar um desconto? (s/n): ");
                    boolean aplicarDesconto = sc.nextLine().equalsIgnoreCase("s");
                    double desconto = 0;
                    if (aplicarDesconto) {
                        System.out.print("Digite o valor do desconto (0 a 100): ");
                        desconto = sc.nextDouble();
                        sc.nextLine();
                    }
                    for (Veiculo veiculo : garagem) {
                        System.out.println("\n===== VEÍCULOS NA GARAGEM =====");
                        if (aplicarDesconto) {
                            veiculo.mostrarDados(desconto);
                        }
                        else {
                            if (veiculo instanceof Carro) {
                                Carro carro = (Carro) veiculo;
                                carro.mostrarDados(carro.getVerNumPortas());
                            }
                            else if (veiculo instanceof Moto) {
                                Moto moto = (Moto) veiculo;
                                moto.mostrarDados(moto.getCavalosPotencia());
                            }
                            else if (veiculo instanceof Caminhao) {
                                Caminhao caminhao = (Caminhao) veiculo;
                                caminhao.mostrarDados(caminhao.getVerCapacidade());
                            }
                        }
                    }
                }
                System.out.println("\nEncerrado o programa. Até mais...");
                break;
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
                              