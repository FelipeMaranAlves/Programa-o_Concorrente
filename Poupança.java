class Poupanca extends Conta{
    public Poupanca(String id){
        super(id);
    }
    public void renderJuros(double Taxa){
        this.saldo = this.saldo * Taxa;
    }
}