import java.util.Scanner;
public class Fornecedor {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;

    public Fornecedor (String nome, String endereco, String telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }
    public String getNome() {
        return nome;
    }
    public void setNome (String nome) {
        this.nome = nome;
    }
    public String getEndereco () {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail () {
        return email;
    }
    public void setEmail (String email) {
        this.email = email;
    }

    // Método para solicitar o reabastecimento de determinado produto
    public void solicitarReabastecimento(String produto, int quantidade) {
        System.out.println ("Solicitar reabastecimento de " + quantidade + " unidades de " + produto + " ao fornecedor " + nome);
    }
   // Método para notificar atraso na entrega de um pedido de determinado fornecedor
   public void notificarAtrasoEntrega (String pedidoID) {
    System.out.println("Notificar atraso na entrega do pedido " + pedidoID + " ao fornecedor " + nome);
   }
    
   public void cadastrarFornecedor() {
    Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do fornecedor: ");
        String input = scanner.nextLine();
        
        System.out.println("Você digitou: " + input);
        
        scanner.close();
    
   }
} 