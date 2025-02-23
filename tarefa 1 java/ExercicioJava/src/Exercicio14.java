import java.util.Scanner;

public class Exercicio14 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a hora inicial: ");
        int inicio = input.nextInt();
        System.out.print("Digite a hora terminal: ");
        int termino = input.nextInt();

        int duracao;

        if(inicio >= 12 && termino <= 12){
            duracao = 24 - inicio + termino;
            System.out.printf("A duração do jogo foi de %d horas",duracao);

        }else{
            duracao = termino - inicio;
            System.out.printf("A duração do jogo foi de %d horas.",duracao);
        }
    }
}
