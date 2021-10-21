package br.com.cwi.reset.caiopellegrini.service;

import br.com.cwi.reset.caiopellegrini.FakeDatabase;
import br.com.cwi.reset.caiopellegrini.exceptions.*;
import br.com.cwi.reset.caiopellegrini.models.Ator;
import br.com.cwi.reset.caiopellegrini.models.StatusCarreira;
import br.com.cwi.reset.caiopellegrini.request.AtorRequest;
import br.com.cwi.reset.caiopellegrini.response.AtorEmAtividade;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class AtorService {

    private FakeDatabase fakeDatabase;

    public AtorService(FakeDatabase fakeDatabase) {

        this.fakeDatabase = fakeDatabase; // base de dados
    }

    public void criarAtor(AtorRequest atorRequest) throws Exception { //Exception pode ser instanciada uma vez
        //logica
        if (atorRequest.getNome() == null){ // se atorRequest tiver o nome null
            throw new CampoObrigatórioNaoInformadoException(); // exceção com a classe exception criada
        }

        if (atorRequest.getDataNascimento() == null){ //pegando data de nascimento em atorRequest - se for null
            throw new CampoObrigatórioNaoInformadoException();
        }

        if (atorRequest.getStatusCarreira() == null){ //pegando status carreira - se for null
            throw new CampoObrigatórioNaoInformadoException();
        }

        if (atorRequest.getAnoInicioAtividade() == null){  //pegando ano inicio atividade - se for null
            throw new CampoObrigatórioNaoInformadoException();
        }

        if (atorRequest.getNome().split(" ").length < 2) { // split para verificar nome e sobrenome - 2 palavras identificando pelo espaço entre aspas
            throw new NomeSobrenomeObrigatorioException();
        }

        LocalDate dataAtual = LocalDate.now(); // recebendo data de hoje
        if (dataAtual.isBefore(atorRequest.getDataNascimento())){ // data atual é anterior a data de nascimento em atorRequest
            throw new DataNascimentoException();
        }

        Integer anoNascimento = atorRequest.getDataNascimento().getYear(); // criando variavel para receber ano nascimento

        if (atorRequest.getAnoInicioAtividade() < anoNascimento){ // ano inicio de atividade é menor que ano nascimento?
            throw new AnoInicioInvalidoException();

        }


            List<Ator> atores = fakeDatabase.recuperaAtores(); // pegando lista de atores - atores é a variavel - recuperaAtores() esta em fakeDataBase

        for (Ator atorCadastrado: atores){ //for para percorrer a base de dados dos atores
            if (atorCadastrado.getNome().equalsIgnoreCase(atorRequest.getNome())){ //verifica se já tem um ator ignorando case sensitive
                throw new JaExisteAtorCadastradoException();  //joga exceção e pega o nome
            }
        }

       final Integer idGerado = atores.size() +1; // gerando IDs automáticos a partir do 1

       final Ator ator = new Ator(idGerado, atorRequest.getNome(),
               atorRequest.getDataNascimento(), atorRequest.getStatusCarreira(),
                atorRequest.getAnoInicioAtividade()); //criando ator
        fakeDatabase.persisteAtor(ator);

    }

    public List<AtorEmAtividade> listarAtoresEmAtividade(String filtroNome) throws Exception { //criando lista AtorEmatividade e usando variavel String filtro nome
        final List <Ator> atoresCadastrados = fakeDatabase.recuperaAtores();

       if (atoresCadastrados.isEmpty()) {
           throw new ListaVaziaException(TipoDominioException.ATOR.getSingular(), TipoDominioException.ATOR.getPlural());
        }

       final List <AtorEmAtividade> retorno = new ArrayList<>();

        if(filtroNome != null) {
            for (Ator ator : atoresCadastrados){
                final boolean containsFilter = ator.getNome().toLowerCase(Locale.ROOT).contains((filtroNome.toLowerCase(Locale.ROOT)));
                final boolean emAtividade = StatusCarreira.EM_ATIVIDADE.equals(ator.getStatusCarreira());
                if (containsFilter && emAtividade) {
                    retorno.add(new AtorEmAtividade(ator.getId(), ator.getNome(), ator.getDataNascimento()));
                }

        }
    } else {
        for(Ator ator : atoresCadastrados) {
            final boolean emAtivdade = StatusCarreira.EM_ATIVIDADE.equals(ator.getStatusCarreira());
                if (emAtivdade) {
                    retorno.add(new AtorEmAtividade(ator.getId(), ator.getNome(), ator.getDataNascimento()));
                }

            }
        }
if(retorno.isEmpty()) {
    throw new FiltroNomeNaoEncontrado("Ator", filtroNome);
}
return retorno;
    }
        public Ator consultarAtor (Integer id) throws Exception {
        if(id == null) {
            throw new IdNaoInformadoException();
        }
        final List <Ator> atores = fakeDatabase.recuperaAtores();

        for(Ator ator: atores) {
            if (ator.getId().equals(id)) {
                return ator;
            }
        }
            throw new ConsultaIdInvalidoException(TipoDominioException.ATOR.getSingular(), id);
    }

    public List<Ator> consultarAtores() throws Exception {
        final List<Ator> atores = fakeDatabase.recuperaAtores();

        if (atores.isEmpty()) {
            throw new ListaVaziaException(TipoDominioException.ATOR.getSingular(), TipoDominioException.ATOR.getPlural());
        }

        return atores;
    }

   }

