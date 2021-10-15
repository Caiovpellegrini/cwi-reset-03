package br.com.cwi.reset.caiopellegrini.models;

public enum StatusAtividade {
        EM_ATIVIDADE ("Em Atividade"),
        ENCERRADO ("Está encerrado");

        private String descricaoAtividade;



        StatusAtividade(String descricaoAtividade) {
                this.descricaoAtividade = descricaoAtividade;
        }

        public String getDescricaoAtividade() {
                return descricaoAtividade;
        }

}
