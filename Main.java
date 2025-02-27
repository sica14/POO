import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tempo em segundos:");
        int t = scanner.nextInt();
        int horas = t / 3600;
        int minutos = (t % 3600) / 60;
        int segundos = (t % 3600) % 60;
        System.out.printf("%d segundos equivalem a %d horas, %d minutos e %d segundos.%n", t, horas, minutos, segundos);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        }
    }




