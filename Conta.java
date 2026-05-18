public class Conta{
    protected double saldo;
    protected String id;
    public Conta(String id,double saldo){
        this.id = id;
        this.saldo = saldo;
    }
    public void creditar(double cred){
        this.saldo += cred;
    }
    public void debitar(double deb){
        this.saldo -= deb;
    }
    public Double getSaldo(){
        return this.saldo;
    }

    public String getNumero(){
        return this.id;
    }
}