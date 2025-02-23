import java.util.Scanner;

public class Exercicio15 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Quantidade de horas trabalhadas: ");
        int qtdHoras = input.nextInt();
        System.out.print("Salário por hora: R$ ");
        double salarioHora = input.nextDouble();

        double salarioTotal;

        if (qtdHoras > 160){
            salarioTotal = salarioHora * (qtdHoras - 160) * 1.5;
            System.out.printf("Salário Total: R$ %.2f", salarioTotal);

        }else{
            salarioTotal = salarioHora * qtdHoras;
            System.out.printf("Salário Total: R$ %.2f", salarioTotal);
        }
    }
}
