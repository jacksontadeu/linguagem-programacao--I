import java.util.Scanner;

public class Exercicio13 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num1, num2;
        do{
            System.out.print("Digite o primeiro número: ");
            num1 = input.nextInt();
            System.out.print("Digite outro número: ");
            num2 = input.nextInt();
            if(num2==num1) System.out.println("Tente novamente os números NÂO podem ser iguais!!!");
        
        }while(num1==num2);

        if (num1 < num2) System.out.printf("%d %d", num1, num2);
        else System.out.printf("%d %d ", num2, num1);
        

    }
}
