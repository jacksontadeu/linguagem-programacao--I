import java.util.Scanner;

public class Exercicio17 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Nota P1: ");
        double p1 = input.nextDouble();
        System.out.print("Trabalho 1: ");
        double e1 = input.nextDouble();
        System.out.print("Trabalho 2: ");
        double e2 = input.nextDouble();

        double media = ((p1*0.6)+ ((e1 + e2 )/ 2 * 0.4)) * 0.5;
        System.out.println(media);
        double max = Math.max(((p1*0.6)+ ((e1 + e2 )/ 2 * 0.4))- 5.9,0);
        System.out.println(max);
        double fator =  max / (((p1*0.6)+ ((e1 + e2 )/ 2 * 0.4))- 5.9);
        System.out.println(fator);

        double api, mediaFinal, sub;

        if(fator ==1){
            System.out.print("Nota API: ");
            api = input.nextDouble();
            mediaFinal = media + (api * 0.5);
            System.out.println(mediaFinal);

        }else{
            System.out.print("Nota SUB: ");
            sub = input.nextDouble();
            mediaFinal = media + (sub * 0.3);
            System.out.println(mediaFinal);

        }
    }
}
