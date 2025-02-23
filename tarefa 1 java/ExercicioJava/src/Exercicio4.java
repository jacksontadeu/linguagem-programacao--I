import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do carro: R$ ");
        double valorCarro = input.nextDouble();
        double valorTotal = (valorCarro + (valorCarro * 0.28) + (valorCarro * 0.45));
        System.out.printf("O valor do carro é R$ %.2f", valorTotal);
    }
}
