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

        double totalBrancos = (brancos / eleitores) * 100;
        double totalNulos = (nulos / eleitores) * 100;
        double totalValidos = (validos / eleitores) * 100;

        System.out.println("Total de brancos: " + totalBrancos + "%");
        System.out.println("Total de nulos: " + totalNulos  + "%");
        System.out.println("Total de validos: " + totalValidos + "%");
    }
}
