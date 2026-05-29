package Banco;
public abstract class ContaAbstrata {
    private String numero;
    private double saldo;
    ContaAbstrata (String num){
        this.numero = num;
        this.saldo = 0;
    }
    public void creditar(double valor){
            this.saldo += valor;
    }
    public double getSaldo(){
        return this.saldo;
    }

    public String getNumero(){
        return this.numero;
    }

    protected void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public abstract void debitar(double valor) throws SIException;
}
