package models;

import java.io.Serializable;

import interfaces.Cadastravel;
import utils.CadastroUtil;

public class Aluno extends PessoaFisica implements Cadastravel, Serializable {
  private String registroAluno;
  private String curso;
  private String modalidade;
  private int semestre;
  private String periodo;


  public Aluno(
    String endereco,
    String cep,
    String email,
    String cpf,
    String nome,
    String dataNascimento,
    String curso,
    String modalidade,
    String periodo,
    String telefone
  ) {
    super(endereco, cep, email, cpf, nome, dataNascimento, telefone);

    this.registroAluno = Double.toString((Math.random() * 10000));
    this.curso = curso;
    this.modalidade = modalidade;
    this.semestre = 1;
    this.periodo = periodo;
  }

  public String getRegistroAluno() {
    return this.registroAluno;
  }

  public void setRegistroAluno(String registroAluno) {
    this.registroAluno = registroAluno;
  }

  public String getCurso() {
    return this.curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

  public String getModalidade() {
    return this.modalidade;
  }

  public void setModalidade(String modalidade) {
    this.modalidade = modalidade;
  }

  public int getSemestre() {
    return this.semestre;
  }

  public void setSemestre(int semestre) {
    this.semestre = semestre;
  }

  public String getPeriodo() {
    return this.periodo;
  }

  public void setPeriodo(String periodo) {
    this.periodo = periodo;
  }

  public void cadastrar() {
    CadastroUtil.cadastrar(this, "aluno");
  }

  public void listar() {
    CadastroUtil.listar("aluno");
  }

  @Override
    public String toString() {
      return new StringBuffer("Nome: ").append(this.getNome())
      .append("; Endereço: ").append(this.getEndereco())
      .append("; Data de Nascimento: ").append(this.getDataNascimento())
      .append("; CPF: ").append(this.getCpf())
      .append("; Email: ").append(this.getEmail())
      .append("; Curso: ").append(this.getCurso())
      .append("; Modalidade: ").append(this.getModalidade())
      .append("; Periodo: ").append(this.getPeriodo())
      .append(";\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n")
      .toString();
    }
}
