import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             ArrayList<Consulta> consulta = new ArrayList<>();

             while(true) {
                System.out.println("\n======== GESTÃO DE CONSULTA ========");
                System.out.println("1. Registrar Consulta\n2. Exibir Consulta\n3. Sair");
                System.out.print("\nEscolha uma opção: ");
                int op = sc.nextInt();
                sc.nextLine();
                
                if(op == 1) {
                    System.out.println("\n===== REGISTRAR CONSULTA =====");
                    System.out.println("1. Consulta Individual\n2. Consulta em Grupo\n3. Consulta em Casal\n0. Voltar ao Menu");
                    System.out.print("\nEscolha uma opção: ");
                    int opcao = sc.nextInt();
                    sc.nextLine();

                    if(opcao == 0) {
                        continue;
                    }

                    if (opcao == 1) {
                        System.out.println("\n====== CONSULTA INDIVIDUAL ======");
                        System.out.print("Nome do Paciente: ");
                        String name = sc.nextLine();

                        System.out.print("Digite seu Psicólogo(a): ");
                        String psi = sc.nextLine();

                        System.out.print("Digite o dia da consulta: ");
                        String dia = sc.nextLine();

                        System.out.print("Digite o valor da Consulta: ");
                        double valor = sc.nextDouble();
                        sc.nextLine();

                        System.out.print("Digite a duração da consulta (em horas): ");
                        int duracao = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Deseja ver a duração em minutos na sua ficha? (s/n) ");
                        boolean verMinutos = sc.nextLine().equalsIgnoreCase("s");

                        ConsultaIndividual ci = new ConsultaIndividual(name, psi, dia, valor, duracao);
                        consulta.add(ci);
                        System.out.println(">>>>> PACIENTE REGISTRADO <<<<<");
                    }
                    else if (opcao == 2) {
                        System.out.println("\n====== CONSULTA EM GRUPO ======");
                        ArrayList<ConsultaGrupo> grupo = new ArrayList<>();
                    
                        System.out.print("Digite o número de pacientes: ");
                        int pessoas = sc.nextInt();
                        sc.nextLine();

                        for(int i = 0; i < pessoas; i++) {
                            System.out.printf("\nDigite o nome do %d° Paciente: ", i+1);
                            String nomePaciente = sc.nextLine();
                            System.out.printf("\nPaciente %s Cadastrado!\n", nomePaciente);
                        }

                        System.out.print("\nDigite seu Psicólogo(a): ");
                        String psi = sc.nextLine();

                        System.out.print("Digite o dia da consulta: ");
                        String dia = sc.nextLine();

                        System.out.print("Digite o valor da Consulta: ");
                        double valor = sc.nextDouble();
                        sc.nextLine();

                        ConsultaGrupo cg = new ConsultaGrupo(dia, psi, dia, valor, pessoas);
                        consulta.add(cg);
                        System.out.println(">>>> SESSÃO EM GRUPO REGISTRADA <<<<");
                    }
                    else if (opcao == 3) {
                        System.out.println("");
                        
                    }
                }
            }
        }
  }







                    