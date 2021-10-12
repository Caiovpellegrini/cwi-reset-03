package br.com.cwi.reset.caiopellegrini;

public enum StatusCarreira {
    EM_ATIVIDADE ("Em atividade"),
    APOSENTADO ("Está Aposentado");

    private String descricaoStatusCarreira;

    StatusCarreira(String descricaoStatusCarreira) {
        this.descricaoStatusCarreira = descricaoStatusCarreira;
    }

    public String getDescricaoStatusCarreira() {
        return descricaoStatusCarreira;
    }

}
