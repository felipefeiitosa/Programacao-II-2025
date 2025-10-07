import java.util.Scanner;
public class Main {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("===== Clinica de Psicologia =====");
            System.out.println("1 - Consulta Individual\n2 - Consulta de Casal\n3 - Consulta em Grupo\n4 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Nome do Paciente: ");
                    String pacienteInd = sc.nextLine();
                    System.out.print("Nome do Psicólogo: ");
                    String psicologoInd = sc.nextLine();
                    System.out.print("Valor da Consulta: R$");
                    double valorInd = sc.nextDouble();
                    System.out.print("Duração da Consulta (em minutos): ");
                    int duracao = sc.nextInt();
                    
                    ConsultaIndividual ci = new ConsultaIndividual(pacienteInd, psicologoInd, valorInd, duracao);
                    ci.mostrarDados();
                    System.out.print("Deseja ver a duração em horas? (s/n): ");
                    boolean emHoras = sc.next().equalsIgnoreCase("s");
                    if(emHoras){
                        ci.mostrarDados(emHoras);
                    }
                    else 
                    break;


            }
        }
    }
}
