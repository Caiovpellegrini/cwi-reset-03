import java.util.ArrayList;
import java.util.List;

public class Filme {

    private String nome;
    private String descricao;
    private Integer duracaoFilme;
    private Integer anoLancamento;
    private Double avaliacao;
    private Diretor diretor;

    public Filme(String nome, String descricao, Integer duracaoFilme, Integer anoLancamento, Double avaliacao, Diretor diretor)
            throws AvaliacaoForadoPadraoException {
        if (avaliacao < 1 || avaliacao > 5) {
            throw new AvaliacaoForadoPadraoException();
        }
        this.nome = nome;
        this.descricao = descricao;
        this.duracaoFilme = duracaoFilme;
        this.anoLancamento = anoLancamento;
        this.avaliacao = avaliacao;
        this.diretor = diretor;
    }

    public void reproduzir() {
        System.out.println("Nome Filme: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Duração do filme: " + duracaoFilme);
        System.out.println("Diretor: " + diretor.getNome());
    }

    public static void main(String[] args) {
        List<String> filmes = new ArrayList<>();
        filmes.add("Debi & Lóide");
        filmes.add("Ace Ventura");
        filmes.add("O Maskara");
        filmes.add("O Mentiroso");
        for (String mostrar : filmes){
            System.out.println(mostrar);
        }

    }

}




