package questao3;

public abstract class ComplementoDecorator implements ItemPedido {
    public ItemPedido itemDecorado;

    public ComplementoDecorator(ItemPedido itemDecorado) {
        this.itemDecorado = itemDecorado;
    }

    @Override
    public String getDescricao() {
        return itemDecorado.getDescricao();
    }

    @Override
    public double getPreco() {
        return itemDecorado.getPreco();
    }
}