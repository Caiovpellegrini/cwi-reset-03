package br.com.cwi.reset.caiopellegrini.models;

public enum TipoAtuacao {
    PRINCIPAL("Personagem principal"),
    COADJUVANTE("Personagem Coadjuvante");

    private String descricaoTipoAtuacao;

    TipoAtuacao(String descricaoTipoAtuacao) {
        this.descricaoTipoAtuacao = descricaoTipoAtuacao;
    }

    public String getDescricaoTipoAtuacao() {
        return descricaoTipoAtuacao;
    }
}
