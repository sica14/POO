import java.util.Scanner;
public class inteiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um inteiro e dois numeros para o intervalo:");
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (n < x) {
            System.out.println("O número esta antes do intervalo");
        } else if(n > y){
            System.out.println("O número esta depois do intervalo");
        } else {
            System.out.println("O número esta dentro do intervalo");
        }


    }
}




