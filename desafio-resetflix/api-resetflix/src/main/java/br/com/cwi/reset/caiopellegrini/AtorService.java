package br.com.cwi.reset.caiopellegrini;

public class AtorService extends AtorRequest{

    private FakeDatabase fakeDatabase;

    public AtorService(FakeDatabase fakeDatabase) {
        this.fakeDatabase = fakeDatabase;
    }

   public void criarAtor (){
       System.out.println("Nome: " + getNome();
       System.out.println("dataNascimento: " + getDataNascimento());
       System.out.println("Status Carreira: " + getStatusCarreira());
       System.out.println("Ano de ínicio de atividade: " +getAnoInicioAtividade());
   }

   public static void List<AtorEmAtividade> get
}