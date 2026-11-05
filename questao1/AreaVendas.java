package questao1;

public class AreaVendas implements EstoqueObserver {
    @Override
    public void atualizar(String nomeProduto, int quantidadeAntiga, int novaQuantidade) {
        if (quantidadeAntiga == 0 && novaQuantidade > 0) {
            System.out.println("Vendas: Produto " + nomeProduto + " com novo estoque. Nova quantidade: " + novaQuantidade);
        }
    }
}