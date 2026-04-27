public class Produto {
    private String nome;
    private  double valor;
    private int quantidade;

    public String getNome(){
        return this.nome;
    }
    public double getValor(){
        return this.valor;
    }
    public int  getQuantidade(){
        return this.quantidade;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
}
