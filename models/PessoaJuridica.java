package models;

public abstract class PessoaJuridica extends Pessoa {
  private String cnpj;
  private String razaoSocial;
  private String tipo;


  public PessoaJuridica(
    String endereco,
    String cep,
    String email,
    String cnpj,
    String razaoSocial,
    String telefone,
    String tipo
  ) {
    super(endereco, cep, email, telefone);

    this.cnpj = cnpj;
    this.razaoSocial = razaoSocial;
    this.tipo = tipo;
  }

  public String getCnpj() {
    return this.cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public String getRazaoSocial() {
    return this.razaoSocial;
  }

  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  public String getTipo() {
    return this.tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
}