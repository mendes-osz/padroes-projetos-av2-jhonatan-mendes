package questao2;

public class PerfilMensalistaStrategy implements PerfilCobrancaStrategy {
    public double VALOR_FIXO_MENSAL = 250.00;

    @Override
    public double calcularValor(int minutosPermanencia) {
        return VALOR_FIXO_MENSAL;
    }
}