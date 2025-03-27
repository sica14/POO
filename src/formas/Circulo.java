package grafico;

public class Circulo {
    private int raio;
    private int x;
    private int y;

    public Circulo(int raio, int x, int y) {
        this.raio = raio;
        this.x = x;
        this.y = y;
    }
    public Circulo(Circulo outro) {
        this.raio = outro.raio;
        this.x = outro.x;
        this.y = outro.y;
    }

    public void mover(int novox, int novoy){
        this.x = novox;
        this.y = novoy;

    }
    public void desenhar(){
        System.out.printf("Circulo(%d, %d, %d)\n", x, y, raio);
    }
    public void redimensionar(float sx){
        if (sx > 0){
            raio = (int) (sx / 100 * raio);
        }
    }
    public void dividir(int novox, int novoy, int novoraio){
        x = x / novox;
        y = y / novoy;
        raio = raio / novoraio;
    }
    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


