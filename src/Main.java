package src;

public class Main {
    public static void main(String[] args) {

        Cliente Thais = new Cliente();
        Thais.setNome("Thais");

        IConta cc = new ContaCorrente(Thais);
        IConta poupanca = new ContaPoupanca(Thais);

        cc.depositar(100);
        cc.transferir(100,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
