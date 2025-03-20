package formas;

public class Retangulo {
    private int largura;
    private int altura;
    private int x;
    private int y;
    public void mover(int novoX, int novoY) {
        x = novoX;
        y = novoY;
    }
    public void desenhar() {
        System.out.printf("Retangulo(%d, %d, %d, %d)\n",
                x, y, largura, altura);
    }
    public void redimensionar(float sx, float sy) {
        if (sx > 0 && sy > 0) {
            largura = (int) (sx / 100 * largura);
            altura = (int) (sy / 100 * altura);
        }
    }
    public void dividir(int novaaltura, int novalargura) {
        largura = largura / novaaltura;
        altura = altura / novalargura;
    }




    public Retangulo(int x, int y, int altura, int largura) {
        this.x = x;
        this.y = y;
        this.largura = largura;
        this.altura = altura;
    }

    public Retangulo(int lado, int x, int y) {
        this.largura = lado;
        this.altura = lado;
        this.x = x;
        this.y = y;
    }
}
