import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a distancia, o tempo gasto e a quantidade de gasolina consumida:");
        int d = scanner.nextInt();
        int t = scanner.nextInt();
        int q = scanner.nextInt();
        float velocidade = (float)d / t;
        float consumo = (float)d / q;
        System.out.println("A velocidade média foi: " + velocidade + "km/h" + " e o consumo médio foi: " + consumo + "km/l");


    }
}




