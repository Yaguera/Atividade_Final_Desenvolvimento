
public class Pedido extends Fornecedor{
    private int numeroDoPedido;
    private String fornecedor;
    private String produto;
    private int quantidade;

    public Pedido(int numeroDoPedido, String fornecedor, String produto, int quantidade) {
        super();
        this.numeroDoPedido = numeroDoPedido;
        this.fornecedor = fornecedor;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public int getNumeroDoPedido() {
        return numeroDoPedido;
    }

    public void setNumeroDoPedido(int numeroDoPedido) {
        this.numeroDoPedido = numeroDoPedido;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Método

    public void lancarPedido() {
        System.out.println("Pedido Lançado");
    }

    public void abastecerEstoque() {
        System.out.println("Estoque atualizado!");
        cadastrarFornecedor();
        
    }

}
