class Poupanca extends Conta{
    public Poupanca(String id){
        super(id,0);
    }
    public void renderJuors(double Taxa){
        this.saldo = this.saldo * Taxa;
    }
}