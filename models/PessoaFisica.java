package models;

import java.time.LocalDate;

public class PessoaFisica extends Pessoa {
  private String cpf;
  private String nome;
  private LocalDate dataNascimento;
  private String genero;


  public PessoaFisica(
    String endereco,
    String cep,
    String email,
    String cpf,
    String nome,
    LocalDate dataNascimento,
    String telefone
    ) {
    super(endereco, cep, email, telefone);

    this.cpf = cpf;
    this.nome = nome;
    this.dataNascimento = dataNascimento;
  }

  public String getCpf() {
    return this.cpf;
  }

  public String getNome() {
    return this.nome;
  }

  public LocalDate getDataNascimento() {
    return this.dataNascimento;
  }

  public String getGenero() {
    return this.genero;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setDataNascimento(LocalDate dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }
}