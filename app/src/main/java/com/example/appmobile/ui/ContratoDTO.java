package com.example.appmobile.ui;

public class ContratoDTO {
    private int codContrato;
    private String descContrato;
    private String cfpCliente;
    private String usuarioSocio;
    private String nomeServico;

    public ContratoDTO(){

    }

    public ContratoDTO(String descContrato, String cfpCliente, String usuarioSocio, String nomeServico) {
        this.descContrato = descContrato;
        this.cfpCliente = cfpCliente;
        this.usuarioSocio = usuarioSocio;
        this.nomeServico = nomeServico;
    }

    public int getCodContrato() {
        return codContrato;
    }

    public void setCodContrato(int codContrato) {
        this.codContrato = codContrato;
    }

    public String getDescContrato() {
        return descContrato;
    }

    public void setDescContrato(String descContrato) {
        this.descContrato = descContrato;
    }

    public String getCfpCliente() {
        return cfpCliente;
    }

    public void setCfpCliente(String cfpCliente) {
        this.cfpCliente = cfpCliente;
    }

    public String getUsuarioSocio() {
        return usuarioSocio;
    }

    public void setUsuarioSocio(String usuarioSocio) {
        this.usuarioSocio = usuarioSocio;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    @Override
    public String toString() {
        return "ContratoDTO{" +
                "codContrato=" + codContrato +
                ", descContrato='" + descContrato + '\'' +
                ", cfpCliente='" + cfpCliente + '\'' +
                ", usuarioSocio='" + usuarioSocio + '\'' +
                ", nomeServico='" + nomeServico + '\'' +
                '}';
    }
}
