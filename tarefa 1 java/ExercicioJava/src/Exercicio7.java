import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = input.nextInt();

        if (num > 10) System.out.println("É maior que 10");
        else System.out.println("Não é maior que 10");

    }
}
