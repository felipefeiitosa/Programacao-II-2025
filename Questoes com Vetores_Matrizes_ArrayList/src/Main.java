import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------Média-------");

        System.out.print("nota 1: ");
        double nota = sc.nextDouble();
        System.out.print("nota 2: ");
        double nota2 = sc.nextDouble();
        System.out.print("nota 3: ");
        double nota3 = sc.nextDouble();
        System.out.print("nota 4: ");
        double nota4 = sc.nextDouble();
        System.out.print("nota 5: ");
        double nota5 = sc.nextDouble();

        double[] notas = new double[5];
        notas[0] = nota;
        notas[1] = nota2;
        notas[2] = nota3;
        notas[3] = nota4;
        notas[4] = nota5;


        double media = (nota + nota2 + nota3 + nota4 + nota5) / 5;
        System.out.printf("\nMedia da Turma: %.1f\n", media);

        for (int i = 0; i < 5; i++) {
            if (notas[i] > media) {
                System.out.println("Acima da média.");
            } else {
                System.out.println("Abaixo da média.");
            }
        }
    }
}