import java.util.Scanner;
public class variavel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um inteiro:");
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }


    }
}




