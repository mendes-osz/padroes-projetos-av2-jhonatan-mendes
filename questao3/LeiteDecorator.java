package questao3;

public class LeiteDecorator extends ComplementoDecorator {
    public double PRECO_LEITE = 2.00;

    public LeiteDecorator(ItemPedido itemDecorado) {
        super(itemDecorado);
    }

    @Override
    public String getDescricao() {
        return itemDecorado.getDescricao() + " + Leite";
    }

    @Override
    public double getPreco() {
        return itemDecorado.getPreco() + PRECO_LEITE;
    }
}