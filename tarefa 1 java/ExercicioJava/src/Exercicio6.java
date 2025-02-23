import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double far = input.nextDouble();

        double celsius = (far - 32) * (5/9.0);

        System.out.printf("%.2f em fahrenheit é %.2f é celsius", far,celsius);
    }
}
