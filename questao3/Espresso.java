package questao3;

public class Espresso implements ItemPedido {
    @Override
    public String getDescricao() {
        return "Café Espresso";
    }

    @Override
    public double getPreco() {
        return 6.00;
    }
}