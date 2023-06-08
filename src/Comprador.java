 public class Comprador extends Fornecedor{
    int idComprador;
    String nomeComprador;
    String telefoneComprador;
    
    public int getIdComprador() {
        return idComprador;
    }

    public void setIdComprador(int idComprador) {
        this.idComprador = idComprador;
    }

    public String getNomeComprador() {
        return nomeComprador;
    }

    public void setNomeComprador(String nomeComprador) {
        this.nomeComprador = nomeComprador;
    }

    public String getTelefone() {
        return telefoneComprador;
    }

    public void setTelefone(String telefoneComprador) {
        this.telefoneComprador = telefoneComprador;
    }

    public Comprador(int idComprador, String nomeComprador, String telefoneComprador) {
        super(nomeComprador, nomeComprador, telefoneComprador, telefoneComprador);
        this.idComprador = idComprador;
        this.nomeComprador = nomeComprador;
        this.telefoneComprador = telefoneComprador;
        
    }


    public void cadastrarComprador(int idComprador, String telefone){
        System.out.println(idComprador + "Seu cadastro foi realizado com sucesso!");
    }

   public void pedidoComprador(String nomeComprador){
        System.out.println("Olá," + nomeComprador + ". Seu pedido foi inciado!");
    }

   public void ligarParaFornecedor(String telefone){
        System.out.println("Ligar para o" + getTelefone() + " do fornecedor!");
    } 
     


}