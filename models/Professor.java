package models;

import java.io.Serializable;
import java.time.LocalDate;

import interfaces.Cadastravel;
import utils.CadastroUtil;

public class Professor extends PessoaFisica implements Cadastravel, Serializable {
  private String matricula;
  private String formacaoAcademica;
  private String[] disciplinas;


  public Professor(
    String endereco,
    String cep,
    String email,
    String cpf,
    String nome,
    LocalDate dataNascimento,
    String formacaoAcademica,
    String telefone
  ) {
    super(endereco, cep, email, cpf, nome, dataNascimento, telefone);
    this.matricula = Double.toString((Math.random() * 10000));
    this.formacaoAcademica = formacaoAcademica;
  }

  public String getMatricula() {
    return this.matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public String getFormacaoAcademica() {
    return this.formacaoAcademica;
  }

  public void setFormacaoAcademica(String formacaoAcademica) {
    this.formacaoAcademica = formacaoAcademica;
  }

  public String[] getDisciplinas() {
    return this.disciplinas;
  }

  public void setDisciplinas(String[] disciplinas) {
    this.disciplinas = disciplinas;
  }

  public void cadastrar() {
    CadastroUtil.cadastrar(this, "professor");
  }

  public void listar() {
    CadastroUtil.listar("professor");
  }

  @Override
    public String toString() {
      return new StringBuffer("Nome: ").append(this.getNome())
      .append("; Endereço: ").append(this.getEndereco())
      .append("; Data de Nascimento: ").append(this.getDataNascimento())
      .append("; CPF: ").append(this.getCpf())
      .append("; Email: ").append(this.getEmail())
      .append("; Formação acadêmica: ").append(this.getFormacaoAcademica())
      .append(";\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n")
      .toString();
    }
}