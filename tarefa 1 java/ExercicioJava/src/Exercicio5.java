import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o salário fixo: R$ ");
        double fixo = input.nextDouble();
        System.out.print("Digite o quantidade de carros vendidos: ");
        int qtdeCarros= input.nextInt();
        System.out.print("Digite o total das vendas: R$ ");
        double totalVendas= input.nextDouble();
        System.out.print("Digite valor por carro vendido: R$ ");
        double valorCarro = input.nextDouble();

        double salarioTotal = fixo + (qtdeCarros * valorCarro) + (totalVendas * 0.05);
        System.out.printf("Salário total: R$ %.2f", salarioTotal);
    }
}
