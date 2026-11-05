package questao1;

public class AreaCompras implements EstoqueObserver {
    @Override
    public void atualizar(String nomeProduto, int quantidadeAntiga, int novaQuantidade) {
        if (novaQuantidade < 5) {
            System.out.println("Compras: Produto " + nomeProduto + " com estoque baixo (" + novaQuantidade + " unidades)");
        }
    }
}