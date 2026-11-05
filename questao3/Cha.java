package questao3;

public class Cha implements ItemPedido {
    @Override
    public String getDescricao() {
        return "Chá de Camomila";
    }

    @Override
    public double getPreco() {
        return 4.50;
    }
}