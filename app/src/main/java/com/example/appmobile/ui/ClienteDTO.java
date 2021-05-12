package com.example.appmobile.ui;

public class ClienteDTO {

    private String cpfCliente;
    private String nomeCliente;
    private String telefoneCliente;
    private String emailCliente;
    private String endereco;
    private String complemento;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;

    public ClienteDTO() {

    }


    public ClienteDTO(String cpfCliente, String nomeCliente, String telefoneCliente, String emailCliente, String cep, String endereco, String bairro, String cidade, String complemento, String estado) {
        this.cpfCliente = cpfCliente;
        this.nomeCliente = nomeCliente;
        this.telefoneCliente = telefoneCliente;
        this.emailCliente = emailCliente;
        this.cep = cep;
        this.endereco = endereco;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "nomeCliente: " + nomeCliente + '\'' +
                "cpfCliente: " + cpfCliente + '\'' +
                "telefoneCliente: " + telefoneCliente + '\'' +
                "emailClente: " + emailCliente + '\'' +
                "endereco: " + endereco + '\'' +
                "complemento: " + complemento + '\'' +
                "bairro: " + bairro + '\'' +
                "cidade: " + cidade + '\'' +
                "cep'" + cep + '\'' +
                "estado: " + estado + '\''
                ;
    }
}
