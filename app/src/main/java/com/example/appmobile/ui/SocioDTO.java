package com.example.appmobile.ui;

public class SocioDTO {
    private String LoginSocio;
    private String nomeSocio;
    private String cargoSocio;
    private String emailSocio;
    private String telefoneSocio;
    private String senhaLogin;

    public SocioDTO(){

    }

    public SocioDTO(String LoginSocio, String nomeSocio, String cargoSocio, String emailSocio, String telefoneSocio, String senhaLogin) {
        this.LoginSocio = LoginSocio;
        this.nomeSocio = nomeSocio;
        this.cargoSocio = cargoSocio;
        this.emailSocio = emailSocio;
        this.telefoneSocio = telefoneSocio;
        this.senhaLogin = senhaLogin;
    }

    public String getLoginSocio() {
        return LoginSocio;
    }

    public void setLoginSocio(String loginSocio) {
        this.LoginSocio = loginSocio;
    }

    public String getNomeSocio() {
        return nomeSocio;
    }

    public void setNomeSocio(String nomeSocio) {
        this.nomeSocio = nomeSocio;
    }

    public String getCargoSocio() {
        return cargoSocio;
    }

    public void setCargoSocio(String cargoSocio) {
        this.cargoSocio = cargoSocio;
    }

    public String getEmailSocio() {
        return emailSocio;
    }

    public void setEmailSocio(String emailSocio) {
        this.emailSocio = emailSocio;
    }

    public String getTelefoneSocio() {
        return telefoneSocio;
    }

    public void setTelefoneSocio(String telefoneSocio) {
        this.telefoneSocio = telefoneSocio;
    }

    public String getSenhaLogin() {
        return senhaLogin;
    }

    public void setSenhaLogin(String senhaLogin) {
        this.senhaLogin = senhaLogin;
    }

    @Override
    public String toString() {
        return "SocioDTO{" +
                "usuarioSocio='" + LoginSocio + '\'' +
                ", nomeSocio='" + nomeSocio + '\'' +
                ", cargoSocio='" + cargoSocio + '\'' +
                ", emailSocio='" + emailSocio + '\'' +
                ", telefoneSocio='" + telefoneSocio + '\'' +
                ", senhaLogin='" + senhaLogin + '\'' +
                '}';
    }
}
