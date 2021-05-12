package com.example.appmobile.ui;

import java.util.Date;

public class AtividadeDTO {
    private int codAtividade;
    private String dataInicio;
    private String dataFim;
    private String nomeServico;
    private String cpfCliente;
    private String usuarioSocio;
    private String nomeCargo;
    private int codContrato;

    public AtividadeDTO(){

    }

    public AtividadeDTO(String dataInicio, String dataFim, String nomeServico, String cpfCliente, String usuarioSocio, String nomeCargo, int codContrato) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.nomeServico = nomeServico;
        this.cpfCliente = cpfCliente;
        this.usuarioSocio = usuarioSocio;
        this.nomeCargo = nomeCargo;
        this.codContrato = codContrato;
    }

    public int getCodAtividade() {
        return codAtividade;
    }

    public void setCodAtividade(int codAtividade) {
        this.codAtividade = codAtividade;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getUsuarioSocio() {
        return usuarioSocio;
    }

    public void setUsuarioSocio(String usuarioSocio) {
        this.usuarioSocio = usuarioSocio;
    }

    public String getNomeCargo() {
        return nomeCargo;
    }

    public void setNomeCargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
    }

    public int getCodContrato() {
        return codContrato;
    }

    public void setCodContrato(int codContrato) {
        this.codContrato = codContrato;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return  "codAtividade=" + codAtividade +
                ", dataInicio='" + dataInicio + '\'' +
                ", dataFim='" + dataFim + '\'' +
                ", nomeServico='" + nomeServico + '\'' +
                ", cpfCliente='" + cpfCliente + '\'' +
                ", usuarioSocio='" + usuarioSocio + '\'' +
                ", nomeCargo='" + nomeCargo + '\'' +
                ", codContrato=" + codContrato;
    }
}
