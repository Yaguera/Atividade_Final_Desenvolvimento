public class App {
    public static void main(String[] args) {
        
        Produto produto = new Produto("Coca-cola", 300);
        System.out.println("Adicionado " + produto.getQuantidade() + " unidades de " + produto.getNome() + " ao estoque.");
        
        int addQtd = produto.adicionarQuantidade(100);
        System.out.println("Foi adicionado " + addQtd + " unidades de " + produto.getNome() + ". Agora temos " + produto.getQuantidade() + " unidades no estoque.");
        int removeQtd = produto.removerQuantidade(50);
        System.out.println("Foi removido " + removeQtd + " unidades de " + produto.getNome() + ". Agora temos " + produto.getQuantidade() + " unidades no estoque.");
        

        

    }
}
