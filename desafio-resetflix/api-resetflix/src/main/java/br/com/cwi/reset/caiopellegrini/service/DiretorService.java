package br.com.cwi.reset.caiopellegrini.service;

import br.com.cwi.reset.caiopellegrini.FakeDatabase;
import br.com.cwi.reset.caiopellegrini.exceptions.*;
import br.com.cwi.reset.caiopellegrini.models.Diretor;
import br.com.cwi.reset.caiopellegrini.request.DiretorRequest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class DiretorService {
    private FakeDatabase fakedatabase;

    public DiretorService(FakeDatabase fakedatabase) {

        this.fakedatabase = fakedatabase; // construtor base de dados
    }


public void cadastrarDiretor (DiretorRequest diretorRequest) throws Exception{

    if (diretorRequest.getNome() == null){ // se diretorRequest tiver o nome null
        throw new CampoObrigatórioNaoInformadoException(); // exceção com a classe exception criada
    }

    if (diretorRequest.getDataNascimento() == null){ //pegando data de nascimento em diretorRequest - se for null
        throw new CampoObrigatórioNaoInformadoException();
    }

    if (diretorRequest.getAnoInicioAtividade() == null){  //pegando ano inicio atividade - se for null
        throw new CampoObrigatórioNaoInformadoException();
    }

    if (diretorRequest.getNome().split(" ").length < 2) { // split para verificar nome e sobrenome - 2 palavras identificando pelo espaço entre aspas
        throw new NomeSobrenomeObrigatorioException();
    }

    LocalDate dataAtual = LocalDate.now(); // recebendo data de hoje
    if (dataAtual.isBefore(diretorRequest.getDataNascimento())){ // data atual é anterior a data de nascimento em diretorRequest
        throw new DataNascimentoException();
    }

    Integer anoNascimento = diretorRequest.getDataNascimento().getYear(); // criando variavel para receber ano nascimento

    if (diretorRequest.getAnoInicioAtividade() < anoNascimento){ // ano inicio de atividade é menor que ano nascimento?
        throw new AnoInicioInvalidoException();

    }


    Diretor diretor = null;

    fakedatabase.persisteDiretor(diretor);

}
    public List<Diretor> listarDiretores(final String filtroNome) throws Exception {
        final List<Diretor> diretoresCadastrados = fakedatabase.recuperaDiretores();

        if (diretoresCadastrados.isEmpty()) {
            throw new ListaVaziaException(TipoDominioException.DIRETOR.getSingular(), TipoDominioException.DIRETOR.getPlural());
        }

        final List<Diretor> retorno = new ArrayList<>();

        if (filtroNome != null) {
            for (Diretor diretor : diretoresCadastrados) {
                final boolean containsFilter = diretor.getNome().toLowerCase(Locale.ROOT).contains(filtroNome.toLowerCase(Locale.ROOT));
                if (containsFilter) {
                    retorno.add(diretor);
                }
            }
        } else {
            retorno.addAll(diretoresCadastrados);
        }

        if (retorno.isEmpty()) {
            throw new FiltroNomeNaoEncontrado("Diretor", filtroNome);
        }

        return retorno;
    }

    public Diretor consultarDiretor(final Integer id) throws Exception {
        if (id == null) {
            throw new IdNaoInformadoException();
        }

        final List<Diretor> diretores = fakedatabase.recuperaDiretores();

        for (Diretor diretor : diretores) {
            if (diretor.getId().equals(id)) {
                return diretor;
            }
        }

        throw new ConsultaIdInvalidoException(TipoDominioException.DIRETOR.getSingular(), id);
    }



}
