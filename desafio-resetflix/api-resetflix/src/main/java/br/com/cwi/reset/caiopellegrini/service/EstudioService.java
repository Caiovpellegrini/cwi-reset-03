package br.com.cwi.reset.caiopellegrini.service;

import br.com.cwi.reset.caiopellegrini.FakeDatabase;
import br.com.cwi.reset.caiopellegrini.models.Estudio;
import br.com.cwi.reset.caiopellegrini.request.EstudioRequest;

import java.util.ArrayList;
import java.util.List;

public class EstudioService {
    private FakeDatabase fakeDatabase;

    public EstudioService(final FakeDatabase fakeDatabase) {
        this.fakeDatabase = fakeDatabase;
    }

    public void criarEstudio(EstudioRequest estudioRequest) throws Exception {

    }

    public List<Estudio> consultarEstudios(String filtroNome) throws Exception {
        List<Estudio> estudios = new ArrayList<>();
        return estudios;
    }

    public Estudio consultarEstudio(Integer id) throws Exception {
        return null;
    }

}
