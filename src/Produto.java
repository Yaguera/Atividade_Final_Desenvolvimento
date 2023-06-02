public class Produto {
    private String nome;
    private int quantidade;

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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Método para adicionar uma quantidade ao produto
    public int adicionarQuantidade(int quantidade) {
        this.quantidade += quantidade;
        return quantidade;
    }

    // Método para remover uma quantidade do produto
    public int removerQuantidade(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Não é possível remover a quantidade especificada. Quantidade insuficiente em estoque.");
        }
        return quantidade;
    }
}
