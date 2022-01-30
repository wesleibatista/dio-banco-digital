import lombok.Data;

@Data
public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int sequencial = 1;
    private String nome;
    protected final int AGENCIA;
    protected int numConta;
    protected double saldo;

    public Conta(Cliente cliente) {
        this.nome = Cliente.getNome();
        this.AGENCIA = Conta.AGENCIA_PADRAO;
        this.numConta = sequencial++;

    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void tranferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInformacoes() {
        System.out.format("\tCliente:\t%s\n", this.nome);
        System.out.format("\tAgencia:\t%d\n", this.AGENCIA);
        System.out.format("\tNumero:\t    %d\n", this.numConta);
        System.out.format("\tSaldo:\t\tR$%.2f\n", this.saldo);
    }

    @Override
    public String toString() {
        return "\nNome: " + getNome() +
                " Agencia: " + getAGENCIA() +
                 " Conta: " + numConta + "\n";
    }
}

