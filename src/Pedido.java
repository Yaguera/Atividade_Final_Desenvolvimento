
public class Pedido extends Comprador{
    private int numeroDoPedido;
    private String fornecedor;
    private String produto;
    private int quantidade;
    private double valorUnitario;

    //contrutor
    public Pedido(int numeroDoPedido, String fornecedor, String produto, int quantidade, double valorUnitario) {
        super(quantidade, fornecedor, produto);
        this.numeroDoPedido = numeroDoPedido;
        this.fornecedor = fornecedor;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    //Get's and set's
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

    public double getvalorUnitario() {
        return valorUnitario;
    }

    public void setvalorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    // Métodos

    public void lancarPedido() {
        System.out.println("Pedido Lançado por: " + getNomeComprador());
    }

    public void valorTotalPedido() {
        System.out.println("O valor total do pedido é de: R$" + quantidade*valorUnitario);
    }

}
