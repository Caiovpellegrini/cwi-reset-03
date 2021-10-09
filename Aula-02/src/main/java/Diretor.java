public class Diretor {
    private String nome;
    private Integer idade;
    private Integer quantidadeFilmes;
    private Genero genero;



    public Diretor(String nome, Integer idade, Integer quantidadeFilmes, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.quantidadeFilmes = quantidadeFilmes;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public Integer getQuantidadeFilmes() {
        return quantidadeFilmes;
    }

    public void imprimirInformacoes (){
        System.out.println("Nome: " + nome);
        System.out.println("Idade:" +idade);
        System.out.println("Quantidade de filmes: " + quantidadeFilmes);
        System.out.println("Gênero " + genero.getDescricao());

    }


}
