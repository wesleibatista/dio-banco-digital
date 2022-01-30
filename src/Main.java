import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Conta> contas = new ArrayList<>();

        Conta cc = new ContaCorrente(new Cliente("cliente cc"));
        contas.add(cc);

        Conta cp = new ContaPoupanca(new Cliente("cliente cp"));
        contas.add(cp);

        cc.depositar(100.208);
        cc.tranferir(50, cp);
        System.out.println(contas);

        cp.imprimirExtrato();
    }
}
