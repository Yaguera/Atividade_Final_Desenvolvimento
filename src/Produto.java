public class Produto {
    private String nome;
    private int quantidade;

    Fornecedor fornecedor = new Fornecedor("Carlos", "Rua B", " 999999999", "Carlos@email.com");

    // Construtor da classe
    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Método para adicionar uma quantidade ao produto
    public int adicionarQuantidade(int Quantidade) {
        this.quantidade += Quantidade;
        System.out.println("Foi adicionado " + Quantidade + " unidades de " + nome + ". Agora temos " + quantidade
                + " unidades no estoque.");
        return quantidade;
    }

    // Método para remover uma quantidade do produto
    public int removerQuantidade(int Quantidade) {
        if (this.quantidade >= Quantidade) {
            this.quantidade -= Quantidade;
            System.out.println("Foi removido " + Quantidade + " unidades de " + nome + ". Agora temos " + quantidade
                    + " unidades no estoque.");
        } else {
            System.out.println("Não é possível remover a quantidade especificada. Quantidade insuficiente em estoque.");
        }
        return quantidade;
    }

    public void cadastrarProduto() {
        System.out.println(quantidade + " unidades do produto " + nome + " do fornecedor " + fornecedor.getNome()
                + " foram cadastradas com sucesso.");
    }

    public void inventariarEstoque() {
        System.out.println("Existem " + quantidade + "unidades em estoque.");
    }

}
