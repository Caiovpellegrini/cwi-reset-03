public class Aplicacao {
    public static void main(String[] args) {
        Diretor diretor = new Diretor("Christopher Nolan", 51 , 58);
        Filme interestelar = new Filme ("Interestelar", "Filme muito bom", 120,
                2014, 5.0, diretor);
        Filme batman = new Filme ("Batman", "Filme muito bom", 120,
                2014, 4.8, diretor);

        interestelar.reproduzir();
        batman.reproduzir();

    }
}
