import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o ano atual: ");
        int atual = input.nextInt();
        System.out.print("Digite o ano de nascimento: ");
        int nasc = input.nextInt();

        int idade = atual - nasc;
        System.out.println("Sua idade : " + idade + " anos");
        if (idade >= 18) System.out.println("Você pode VOTAR");
        else System.out.print("Você NÂO pode VOTAR");
            
        
    }
    
}
