import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor que você recebe por hora: ");
        double valorPorHora = scanner.nextDouble();
        System.out.print("Digite o numero de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();
        double salBruto = valorPorHora * horasTrabalhadas;
        double ir = 0.11 * salBruto;
        double inss = 0.08 * salBruto;
        double sindicato = 0.05 * salBruto;
        double salLiquido = salBruto - ir - inss - sindicato;

        System.out.println("Salário Bruto: R$" + salBruto);
        System.out.println("IR (11%): R$" + ir);
        System.out.println("INSS (8%): R$" + inss);
        System.out.println("Sindicato (5%): R$" + sindicato);
        System.out.printf("Salário Líquido: R$ %.2f", salLiquido);


    }
}
