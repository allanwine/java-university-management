import java.time.LocalDate;

import models.Aluno;
import models.Fornecedor;
import models.Professor;

public class Main {
  public static void main(String[] args) {
    String endereco = "Rua Teste do teste, 404";
    String cep = "12345-678";
    String email = "teste@teste.com";
    String cpf = "785.415.924-37";
    String nome = "Senhor teste";
    LocalDate dataNascimento = LocalDate.parse("1991-01-01");
    String telefone = "11 91111-1111";
    String curso = "ADS";
    String modalidade = "EAD";
    String periodo = "4";
    String formacaoAcademica = "Doutorado";
    String cnpj = "521.864.852.145-11";
    String razaoSocial = "Empresa de teste";
    String tipo = "Prestador";

    Aluno aluno1 = new Aluno(endereco, cep, email, cpf, nome, dataNascimento, curso, modalidade, periodo, telefone);
    aluno1.cadastrar();
    aluno1.listar();

    Professor professor1 = new Professor(endereco, cep, email, cpf, nome, dataNascimento, formacaoAcademica, telefone);
    professor1.cadastrar();
    professor1.listar();

    Fornecedor fornecedor1 = new Fornecedor(endereco, cep, email, cnpj, razaoSocial, telefone, tipo);
    fornecedor1.cadastrar();
    fornecedor1.listar();
  }
}
