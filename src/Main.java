import java.util.Scanner;
import formas.Retangulo;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o X e Y: ");
        Retangulo r1 = new Retangulo(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println(r1);
        Retangulo r2 = new Retangulo(3,4,5,6);
        r1.mover(4,5);
        Retangulo r3 = new Retangulo(8,7,9,10);
        r3.desenhar();
        Retangulo r4 = new Retangulo(3,4,5,6);
        r4.redimensionar(3,4);
        Retangulo r5 = new Retangulo(3,4,5,6);
        r5.dividir(3,5);
        r2.desenhar();
        r3.desenhar();
        r4.desenhar();
        r5.desenhar();
      }
}