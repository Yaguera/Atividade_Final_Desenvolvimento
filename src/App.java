public class App {
    public static void main(String[] args) {
        
        Produto produto = new Produto("Coca-cola", 300);
        Produto produto2 = new Produto("Cerveja Bohemia", 100);
        Fornecedor fornecedor = new Fornecedor("Lucas", "rua b", "2222222", "lucas@hotmail.com");

        fornecedor.solicitarReabastecimento("Coca-cola", 100);

        produto.adicionarQuantidade(100);
        produto.removerQuantidade(50);
       
        produto2.adicionarQuantidade(230);
        produto2.removerQuantidade(127);
       
        fornecedor.cadastrarFornecedor();

        

    }
}
