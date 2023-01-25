import models.Jogo;
import models.Livro;
import services.Caixa;

public class Main {

    public static void main(String[] args) {
        Caixa caixa = new Caixa(1000.0);

        Jogo jogo = new Jogo(10.0);
        Livro livro = new Livro(50.0);

        try {
            caixa.cadastraProduto(jogo);
            caixa.cadastraProduto(livro);
        } catch (Exception e) {
            System.err.printf("[ERROR] %s\n", e.getMessage());
        }
        caixa.vendeProduto(jogo);
        caixa.vendeProduto(livro);

        System.out.println(caixa.getDinheiro());
    }
}
