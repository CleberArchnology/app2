package com.example.appmobile.ui;

public class CargoDTO {
    public String nomeCargo;
    public String horasCargo;
    public String usuarioSocio;

    public CargoDTO(){

    }

    public CargoDTO(String nomeCargo, String horasCargo, String usuarioSocio) {
        this.nomeCargo = nomeCargo;
        this.horasCargo = horasCargo;
        this.usuarioSocio = usuarioSocio;
    }

    public String getNomeCargo() {
        return nomeCargo;
    }

    public void setNomeCargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
    }

    public String getHorasCargo() {
        return horasCargo;
    }

    public void setHorasCargo(String horasCargo) {
        this.horasCargo = horasCargo;
    }

    public String getUsuarioSocio() {
        return usuarioSocio;
    }

    public void setUsuarioSocio(String usuarioSocio) {
        this.usuarioSocio = usuarioSocio;
    }

    @Override
    public String toString() {
        return "CargoDTO{" +
                ", nomeCargo='" + nomeCargo + '\'' +
                ", horasCargo='" + horasCargo + '\'' +
                ", usuarioServico=" + usuarioSocio +
                '}';
    }
}
