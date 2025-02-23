import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de maçãs: ");
        int qtde = input.nextInt();

        if (qtde < 12) {
            double precoTotal = qtde * 1.30;
            System.out.printf("Preço total: R$ %.2f", precoTotal);
            
        } else {
            double precoTotal = qtde * 1.00;
            System.out.printf("Preço total: R$ %.2f", precoTotal);
            
        }
        input.close();
    }
}
