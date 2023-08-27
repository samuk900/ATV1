import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double n3 = scanner.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double n4 = scanner.nextDouble();

        double media = (n1 + n2 + n3 + n4)/4;
        System.out.printf("A media final e %.2f", media);

    }
}

