package questao3;

public class ChantillyDecorator extends ComplementoDecorator {
    public double PRECO_CHANTILLY = 3.00;

    public ChantillyDecorator(ItemPedido itemDecorado) {
        super(itemDecorado);
    }

    @Override
    public String getDescricao() {
        return itemDecorado.getDescricao() + " + Chantilly";
    }

    @Override
    public double getPreco() {
        return itemDecorado.getPreco() + PRECO_CHANTILLY;
    }
}