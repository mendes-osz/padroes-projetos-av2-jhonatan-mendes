package questao2;

public class PerfilConveniadoStrategy implements PerfilCobrancaStrategy {
    public int MINUTOS_GRATIS = 30;
    public double VALOR_POR_HORA = 10.00;
    public double DESCONTO_PERCENTUAL = 0.20;

    @Override
    public double calcularValor(int minutosPermanencia) {
        int minutosCobrados = Math.max(0, minutosPermanencia - MINUTOS_GRATIS);
        int horasIniciadas = (int) Math.ceil(minutosCobrados / 60.0);
        double valorBruto = horasIniciadas * VALOR_POR_HORA;
        return valorBruto * (1.0 - DESCONTO_PERCENTUAL);
    }
}