import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = input.nextInt();

        if (num < 0) System.out.println("Negativo");
        else System.out.println("Positivo");

    }
}