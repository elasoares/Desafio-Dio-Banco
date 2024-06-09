public abstract class Conta implements IConta {

    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL ++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente(){ return cliente;}

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
     saldo += valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println();
            System.out.println("O valor R$"+ valor+" reais foi transferido com sucesso!" );
    }

 protected void imprimirInformacoes(){
        System.out.println("Títular "+ this.cliente.getNome());
        System.out.printf("Agencia %d%n", this.agencia);
        System.out.printf("Numero %d%n", this.numero);
        System.out.printf("Saldo %.2f", this.saldo);
    }


}
