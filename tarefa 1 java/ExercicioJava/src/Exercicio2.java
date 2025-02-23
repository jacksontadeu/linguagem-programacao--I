import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o total de eleitores: ");
        double eleitores = input.nextDouble();
        System.out.print("Total de votos brancos: ");
        double brancos = input.nextDouble();
        System.out.print("Total de votos nulos: ");
        double nulos = input.nextDouble();
        System.out.print("Total de votos validos: ");
        double validos = input.nextInt();

        System.out.println("Total de brancos: " + (brancos / eleitores) * 100 + "%");
        System.out.println("Total de nulos: " + (nulos / eleitores) * 100 + "%");
        System.out.println("Total de validos: " + (validos / eleitores) * 100 + "%");
    }
}
