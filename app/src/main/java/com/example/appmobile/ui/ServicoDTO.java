package com.example.appmobile.ui;

public class ServicoDTO {
    private String nomeServico;
    private String descServico;

    public ServicoDTO(){

    }

    public ServicoDTO(String nomeServico, String descServico) {
        this.nomeServico = nomeServico;
        this.descServico = descServico;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public String getDescServico() {
        return descServico;
    }

    public void setDescServico(String descServico) {
        this.descServico = descServico;
    }

    @Override
    public String toString() {
        return "ServicoDTO{" +
                "nomeServico='" + nomeServico + '\'' +
                ", descServico='" + descServico + '\'' +
                '}';
    }
}
