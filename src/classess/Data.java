package classess;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public boolean ehValida() {
        if (ano > 0 && mes > 0 && mes < 13) {
            int[] diasPorMes = {0, 31, ehBissexto() ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (dia > 0 && dia <= diasPorMes[mes]) {
                return true;
            }
        }
        return false;

    }
    public boolean ehBissexto(){
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0){
            return true;
        }
        return false;
    }
    public void imprimir(){
        System.out.printf("%d/%d/%d\n", dia, mes, ano);
    }
}

