

import java.time.LocalDate;
import java.time.Period;

public abstract class Pessoa {

    private String nome;
    private LocalDate dataNascimento;
    private Genero genero;

    public Pessoa(String nome, LocalDate dataNascimento, Genero genero) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }


    public void imprimirAtributosPessoa () {
        System.out.println("nome: " + nome);
        System.out.println("Idade: " + this.calcularIdade());
        System.out.println("Genero: " +  genero.getDescricao());
    }

    public String  getNome() {
        return nome;
    }


    private Integer calcularIdade() {
    return Period.between(dataNascimento, LocalDate.now()).getYears();
        }
        }