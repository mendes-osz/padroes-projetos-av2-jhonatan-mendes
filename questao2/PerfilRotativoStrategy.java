package questao2;

public class PerfilRotativoStrategy implements PerfilCobrancaStrategy {
    public double VALOR_POR_HORA = 10.00;

    @Override
    public double calcularValor(int minutosPermanencia) {
        int horasIniciadas = (int) Math.ceil(minutosPermanencia / 60.0);
        return horasIniciadas * VALOR_POR_HORA;
    }
}