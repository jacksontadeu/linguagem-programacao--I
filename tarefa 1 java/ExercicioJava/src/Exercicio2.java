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
        double validos = eleitores - brancos - nulos;

        double totalBrancos = (brancos / eleitores) * 100;
        double totalNulos = (nulos / eleitores) * 100;
        double totalValidos = (validos / eleitores) * 100;

        System.out.printf("Total de brancos: %.2f \n" , totalBrancos );
        System.out.printf("Total de nulos: %.2f \n ", totalNulos );
        System.out.printf("Total de validos: %.2f \n ", totalValidos );
    }
}
