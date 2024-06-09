public class Principal {
    public static void main(String[] args) {


        Banco conta = new Banco();
        Cliente cliente1 = new Cliente("Cliente 1");
        Cliente cliente2 = new Cliente("Cliente 2");

        Conta contaCorrente = new ContaCorrente(cliente1);

        contaCorrente.depositar(105);
        contaCorrente.imprimirExtrato();



        Conta contaPoupaca = new ContaPoupaca(cliente2);
        contaCorrente.transferir(contaPoupaca,55);


        contaPoupaca.imprimirExtrato();
        contaPoupaca.transferir(contaCorrente, 5);
        conta.adicionarConta(contaCorrente);
        conta.adicionarConta(contaPoupaca);
        conta.listaCliente();


    }
}
