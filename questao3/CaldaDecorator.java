package questao3;

public class CaldaDecorator extends ComplementoDecorator {
    public double PRECO_CALDA = 2.50;

    public CaldaDecorator(ItemPedido itemDecorado) {
        super(itemDecorado);
    }

    @Override
    public String getDescricao() {
        return itemDecorado.getDescricao() + " + Calda de Chocolate";
    }

    @Override
    public double getPreco() {
        return itemDecorado.getPreco() + PRECO_CALDA;
    }
}