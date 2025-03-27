package classess;

public class Sequencia {
    private int inicio;
    private int fim;

    public Sequencia(int inicio, int fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public void defaultPrint() {
        for (int i = inicio; i <= fim; i++) {
            System.out.println(i);
        }
    }
    public void por2Print(int inicio) {
        for (int i = inicio; i <= fim; i+=inicio) {
            System.out.println(i);
        }
    }



}