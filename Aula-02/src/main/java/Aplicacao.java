import java.time.LocalDate;

public class Aplicacao {

    public static void main(String[] args) {
        Diretor diretor = new Diretor("Christopher Nolan", LocalDate.of(1991, 5, 5), Genero.MASCULINO, 50 );
        diretor.imprimirAtributosPessoa();

        Ator ator = new Ator ("Teste", LocalDate.of(1991, 11, 18), Genero.FEMININO, 10);
        ator.imprimirAtributosPessoa();


      //  Filme interestelar = new Filme ("Interestelar", "Filme muito bom", 120,
      //          2014, 5.0, diretor);
     //   Filme batman = new Filme ("Batman", "Filme muito bom", 120,
     //           2014, 4.8, diretor);

     //   interestelar.reproduzir();
      //  batman.reproduzir();

    }
}
