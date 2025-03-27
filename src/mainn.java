import java.util.Scanner;

import grafico.Circulo;
import grafico.Retangulo;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o X e Y: ");
        Retangulo r1 = new Retangulo(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        r1.mover(4,5);
        r1.desenhar();
        r1.dividir(6,8);
        r1.redimensionar(3,4);
        System.out.println(r1);


        Circulo c1 = new Circulo(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        c1.mover(4,5);
        c1.desenhar();
        c1.redimensionar(3);
        c1.dividir(7,8,9);
        System.out.println(c1);

    }
}
