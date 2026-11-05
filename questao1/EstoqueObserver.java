package questao1;

public interface EstoqueObserver {
    public void atualizar(String nomeProduto, int quantidadeAntiga, int novaQuantidade);
}