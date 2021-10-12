import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ator extends Pessoa {

    private Integer numeroOscars;

    public Ator (String nome, LocalDate dataNascimento, Genero genero, Integer numeroOscars ){
        super (nome, dataNascimento, genero);
        this.numeroOscars = numeroOscars;
    }

   // private String nome;
   // private Integer idade;
    // private Genero genero;

    // public Ator(String nome, Integer idade, Integer numeroOscars, Genero genero) {
       // this.nome = nome;
       // this.idade = idade;
       // this.numeroOscars = numeroOscars;
       // this.genero = genero;
    }

  /* public void imprimirInformacoes (){
        System.out.println("Nome: " + nome);
        System.out.println("Idade:" +idade);
        System.out.println("Números de oscars vencidos: " + numeroOscars);
        System.out.println("Gênero " + genero.getDescricao());

    } */

//}
