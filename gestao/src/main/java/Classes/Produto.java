package Classes;



public class Produto {
    String nome,quantidade, valor;
  
    
   
    public Produto(String nome, String quantidade, String valor) {
        this.nome = nome;

        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
   
    public String getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(String novaQuantidade) {
        this.quantidade = novaQuantidade;
    }
    public String getValor() {
        return valor;
    }
    public void setValor(String novoValor) {
        this.valor = novoValor;
    }
    
    

    
}
