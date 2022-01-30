import lombok.Getter;
import lombok.Setter;

public class Cliente {

    @Getter @Setter
    private static String nome;

    public Cliente(String nome) {
        Cliente.nome = nome;
    }
}
