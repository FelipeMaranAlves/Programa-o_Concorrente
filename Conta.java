public class Conta{
    protected double saldo;
    protected String id;
    public Conta(String id){
        this.id = id;
        this.saldo = 0;
    }
    public void creditar(double cred){
        this.saldo += cred;
    }
    public void debitar(double deb){
        this.saldo -= deb;
    }
    public double getSaldo(){
        return this.saldo;
    }

    public String getNumero(){
        return this.id;
    }
}