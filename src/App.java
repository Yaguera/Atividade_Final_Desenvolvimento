public class App {
    public static void main(String[] args) {
        
        Produto produto = new Produto("Coca-cola", 300);
        
        
        produto.getFornecedor().cadastrarFornecedor();
        System.out.println("----------------------------");
        produto.cadastrarProduto();
        System.out.println("----------------------------");
        produto.adicionarQuantidade(100);
        System.out.println("----------------------------");
        produto.removerQuantidade(50);
        System.out.println("----------------------------");
        
        Produto produto2 = new Produto("Cerveja Bohemia", 100);
        produto2.cadastrarProduto();
        produto2.adicionarQuantidade(230);
        System.out.println("----------------------------");
        produto2.removerQuantidade(127);
       

        

    }
}
