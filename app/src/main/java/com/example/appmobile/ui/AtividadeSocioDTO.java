package com.example.appmobile.ui;

public class AtividadeSocioDTO {
    private int codAtividade;
    private int codServico;
    private String horaTotal;
    private String horasAtividade;
    private int codCargo;

    public AtividadeSocioDTO(){

    }

    public AtividadeSocioDTO(String horaTotal, String horasAtividade) {
        this.horaTotal = horaTotal;
        this.horasAtividade = horasAtividade;
    }

    public int getCodAtividade() {
        return codAtividade;
    }

    public void setCodAtividade(int codAtividade) {
        this.codAtividade = codAtividade;
    }

    public int getCodServico() {
        return codServico;
    }

    public void setCodServico(int codServico) {
        this.codServico = codServico;
    }

    public String getHoraTotal() {
        return horaTotal;
    }

    public void setHoraTotal(String horaTotal) {
        this.horaTotal = horaTotal;
    }

    public String getHorasAtividade() {
        return horasAtividade;
    }

    public void setHorasAtividade(String horasAtividade) {
        this.horasAtividade = horasAtividade;
    }

    public int getCodCargo() {
        return codCargo;
    }

    public void setCodCargo(int codCargo) {
        this.codCargo = codCargo;
    }

    @Override
    public String toString() {
        return "AtividadeSocioDTO{" +
                "codAtividade=" + codAtividade +
                ", codServico=" + codServico +
                ", horaTotal='" + horaTotal + '\'' +
                ", horasAtividade='" + horasAtividade + '\'' +
                ", codCargo=" + codCargo +
                '}';
    }
}
