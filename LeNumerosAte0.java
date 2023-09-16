import java.util.Scanner;

public class LeNumerosAte0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite seus numeros, 0 encerra");
        int soma = 0;
        int n = scanner.nextInt();
        while (n != 0) {
            soma = soma + n;
            System.out.print("Proximo: ");
            n = scanner.nextInt();
        }
        System.out.println("Soma dos valores: " + soma);
        scanner.close();
    } 
}
