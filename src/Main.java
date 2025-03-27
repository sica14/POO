import java.util.Scanner;

import classess.Data;
import classess.Sequencia;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero inicial e final: ");
        Sequencia s1 = new Sequencia(scanner.nextInt(), scanner.nextInt());
        s1.por2Print(scanner.nextInt());
        s1.defaultPrint();
        System.out.println(s1);
        Data d1 = new Data(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        d1.imprimir();
        System.out.println(d1.ehValida());
}
}