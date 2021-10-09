public class Pessoa {
    private String nome;
    private Integer idade;
    private Genero genero;

    public Pessoa(String nome, Integer idade, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public void imprimirAtributosPessoa (){
        System.out.println("nome: " + nome);
        System.out.println("idade" + idade);
        System.out.println("Genero: " + + genero.getDescricao());
    }
}
