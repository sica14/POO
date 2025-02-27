import java.util.Scanner;

public class intervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite dois numeros:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int soma = 0;
        int count = 0;

        System.out.println("Numeros pares no intervalo:");
        if (a > b) {
            for (int i = b; i <= a; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                    soma += i;
                    count++;
                }
            }
        } else {
            for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                    soma += i;
                    count++;
                }
            }
        }

        double media = (count > 0) ? (double) soma / count : 0;
        System.out.println("Soma dos números pares: " + soma);
        System.out.println("Média dos números pares: " + media);
    }
}