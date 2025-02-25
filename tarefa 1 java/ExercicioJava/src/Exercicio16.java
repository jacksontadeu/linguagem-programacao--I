public class Exercicio16 {
    

    public static void main(String[] args) {
        
        double janeiro = 15000;
        double fevereiro = 23000;
        double marco = 17000;
        double gastoTotal = janeiro+fevereiro+marco;
        double mediaMensal = gastoTotal / 3;

        System.out.printf("Gasto total do trimestre: R$ %.2f \n", gastoTotal );
        System.out.printf("A média mensal de gastos: R$ %.2f",mediaMensal );
    }
}
