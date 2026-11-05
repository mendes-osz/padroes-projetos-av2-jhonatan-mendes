package questao1;

public class AreaAuditoria implements EstoqueObserver {
    @Override
    public void atualizar(String nomeProduto, int quantidadeAntiga, int novaQuantidade) {
        System.out.println("Auditoria: Estoque do produto " + nomeProduto + " alterado de " + quantidadeAntiga + " para " + novaQuantidade);
    }
}