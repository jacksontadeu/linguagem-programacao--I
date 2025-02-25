import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o salário: ");
        double salario = input.nextDouble();
        System.out.print("Digite o percentual de reajuste: ");
        double reajuste = input.nextDouble();

        double salarioAtual = salario + ((salario * reajuste) / 100);

        System.out.printf("Salário atual: R$ %.2f ",salarioAtual);
    }
}
