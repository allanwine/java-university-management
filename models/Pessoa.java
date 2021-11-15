package models;

abstract class Pessoa {
  private String endereco;
  private String cep;
  private String email;
  private String status;
  private String telefone;

  public Pessoa(String endereco, String cep, String email, String telefone) {
    this.endereco = endereco;
    this.cep = cep;
    this.email = email;
    this.status = "ativo";
    this.telefone = telefone;
  }


  public String getEndereco() {
    return this.endereco;
  }

  public String getEmail() {
    return this.email;
  }

  public String getStatus() {
    return this.status;
  }

  public String getTelefone() {
    return this.telefone;
  }

  public String getCep() {
    return this.cep;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

}