package questao1;

public class Main {
    public static void main(String[] args) {
        Produto notebook = new Produto("Cadeira", 10);

        AreaCompras compras = new AreaCompras();
        AreaVendas vendas = new AreaVendas();
        AreaAuditoria auditoria = new AreaAuditoria();

        notebook.adicionarObservador(compras);
        notebook.adicionarObservador(vendas);
        notebook.adicionarObservador(auditoria);

        System.out.println("Alteração 1: Reduzir para 4 unidades");
        notebook.setQuantidade(4);
        System.out.println();

        System.out.println("Alteração 2: Zerar estoque");
        notebook.setQuantidade(0);
        System.out.println();

        System.out.println("Alteração 3: Reestocar para 8 unidades");
        notebook.setQuantidade(8);
        System.out.println();

        System.out.println("Alteração 4: Mesma quantidade");
        notebook.setQuantidade(8);
        System.out.println();

        System.out.println("Alteração 5: Remover Área de Vendas, reduzir estoque para 2");
        notebook.removerObservador(vendas);
        notebook.setQuantidade(2);
    }
}