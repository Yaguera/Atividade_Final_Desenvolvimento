public class App {
    public static void main(String[] args) {
        
        Produto produto = new Produto("Coca-cola", 300);
        Produto produto2 = new Produto("Cerveja Bohemia", 100);
        
        produto.adicionarQuantidade(100);
        produto.removerQuantidade(50);
       
        produto2.adicionarQuantidade(100);
        produto2.removerQuantidade(50);
       

        

    }
}
