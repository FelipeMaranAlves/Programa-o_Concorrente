public class Main {
    public static void main(String[] args) {
Conta conta;
conta = new ContaEspecial("21.342-7");
((Conta)conta).creditar(200.00);
conta.debitar(100.00);
if (conta instanceof ContaEspecial) {
((ContaEspecial) conta).renderBonus();
}
System.out.print(conta.getSaldo());
    }
}
