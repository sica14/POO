import java.util.Scanner;
public class numero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero real:");
        float x = scanner.nextFloat();
        int arredondar = (int)x;
        if (x - (int)x >= 0.5) {
            arredondar = (int) x + 1;
        }
        else{
            arredondar = (int)x;
        }
        System.out.println("O número arredondado é: " + arredondar);





    }
}




