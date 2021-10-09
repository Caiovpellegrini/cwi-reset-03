public class Aplicacao {
    public static void main(String[] args) {
        Filme filmeUm = new Filme("Forrest Gump", "90", "1996", 5);
        filmeUm.Diretor("Joao Paulo", 85, 17);
        System.out.println("Reproduzir o filme" + filmeUm);

        Filme filmeDois = new Filme ("Ghost", "86", "1993", 3);
        filmeDois.Diretor("Noel Gallagher", 49, 34);
        System.out.println("Reproduzir o filme" );
    }
}
