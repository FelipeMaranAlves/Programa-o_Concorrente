package Banco;
class ContaEspecial extends Conta {
    private double bonus;
    private static final double TAXA = 0.01;
    public ContaEspecial(String numero){
        super (numero);
        this.bonus = 0.0;
    }
    public void renderBonus(){
        super.creditar(this.bonus);
        bonus =0;
    }
    public double getBonus(){
        return this.bonus;
    }
    @Override
    public void creditar(double valor){
        bonus = bonus + (valor * TAXA);
        super.creditar(valor);       
    }
}