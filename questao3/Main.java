package questao3;

public class Main {
    public static void main(String[] args) {
        ItemPedido pedido1 = new ChantillyDecorator(new LeiteDecorator(new Espresso()));
        System.out.printf("Pedido 1: %s Preço Total: R$ %.2f", pedido1.getDescricao(), pedido1.getPreco());
        System.out.println();

        ItemPedido pedido2 = new Cha();
        System.out.printf("Pedido 2: %s Preço Total: R$ %.2f", pedido2.getDescricao(), pedido2.getPreco());
        System.out.println();

        ItemPedido pedido3 = new CaldaDecorator(new LeiteDecorator(new LeiteDecorator(new Espresso())));
        System.out.printf("Pedido 3: %s Preço Total: R$ %.2f", pedido3.getDescricao(), pedido3.getPreco());
    }
}