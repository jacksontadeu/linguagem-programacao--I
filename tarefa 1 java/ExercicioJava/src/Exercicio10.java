import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

            System.out.print("Digite a primeira nota: ");
            double nota1 = input.nextDouble();
            System.out.print("Digite a segunda nota: ");
            double nota2 = input.nextDouble();

            double media = (nota1 + nota2) /2;
            if (media >= 6 ) System.out.println("Aprovado"); 
            else System.out.println("Reprovado");
            System.out.printf("Média: %.1f", media);

                
            
    }
}
