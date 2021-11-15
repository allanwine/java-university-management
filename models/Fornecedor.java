package models;

import java.io.Serializable;

import interfaces.Cadastravel;
import utils.CadastroUtil;

public class Fornecedor extends PessoaJuridica implements Cadastravel, Serializable {
  private Produto[] produtos;

  private class Produto {
  String nome;
  String preco;
}

  public Fornecedor(
    String endereco,
    String cep,
    String email,
    String cnpj,
    String razaoSocial,
    String telefone,
    String tipo
  ) {
    super(endereco, cep, email, cnpj, razaoSocial, telefone, tipo);
  }

  public Produto[] getProdutos() {
    return this.produtos;
  }

  public void setProdutos(Produto[] produtos) {
    this.produtos = produtos;
  }

  public void cadastrar() {
    CadastroUtil.cadastrar(this, "fornecedor");
  }

  public void listar() {
    CadastroUtil.listar("fornecedor");
  }

  @Override
    public String toString() {
      return new StringBuffer("Razào social: ").append(this.getRazaoSocial())
      .append("; Endereço: ").append(this.getEndereco())
      .append("; Cnpj: ").append(this.getCnpj())
      .append("; Email: ").append(this.getEmail())
      .append("; Tipo: ").append(this.getTipo())
      .append(";\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n")
      .toString();
    }
}