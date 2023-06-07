
public class Comprador{
    int idComprador;
    String nomeComprador;
    String telefone;
    
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
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Comprador(int idComprador, String nomeComprador, String telefone) {
        this.idComprador = idComprador;
        this.nomeComprador = nomeComprador;
        this.telefone = telefone;
    }


    public void cadastrarFornecedor(int idComprador, String telefone){
        System.out.println(idComprador + "Seu cadastro foi realizado com sucesso!");
    }

   public void fazerPedido(String nomeComprador){
        System.out.println("Olá," + nomeComprador + ". Seu pedido foi inciado!");
    }

     


}