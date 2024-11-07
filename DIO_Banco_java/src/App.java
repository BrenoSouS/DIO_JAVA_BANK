public class App {
    public static void main(String[] args) {
        Cliente Breno = new Cliente();
        Breno.setNome("Breno");

        Conta cc = new ContaCorrente(Breno);
        Conta cp = new ContaPoupanca(Breno);

        cc.depositar(10.0);
        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
