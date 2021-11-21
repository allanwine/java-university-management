import java.util.Scanner;

import models.Aluno;
import models.Professor;
import models.Fornecedor;
import utils.CadastroUtil;

public class Main {
  private static final Scanner scan = new Scanner (System.in);;

  public static void main(String[] args) {
    System.out.println("Seja bem-vindo! \n");
    String option = "";

    while (option != "0") {
      System.out.println("Selecione a opção desejada: \n");
      System.out.println("(1) Para adicionar um aluno");
      System.out.println("(2) Para adicionar um professor");
      System.out.println("(3) Para adicionar um fornecedor");
      System.out.println("(4) Para listar todos os alunos");
      System.out.println("(5) Para listar todos os professores");
      System.out.println("(6) Para listar todos os fornecedores");
      System.out.println("(0) Para sair \n");

      option = scan.nextLine();

      switch (option) {
        case "1":
          cadastrarAluno();
          break;

        case "2":
          cadastrarProfessor();
          break;

        case "3":
          cadastrarFornecedor();
          break;

        case "4":
          CadastroUtil.listar("aluno");
          break;

        case "5":
          CadastroUtil.listar("professor");
          break;

        case "6":
          CadastroUtil.listar("fornecedor");
          break;

        case "0":
          System.out.println("Fechando aplicação");
          return;

        default:
          System.out.println("Opção inválida");
          break;
      }
    };
    scan.close();
  }

  private static void cadastrarAluno() {
    System.out.println("Insira as informações necessárias: \n");

    System.out.println("Insira o endereço:");
    String endereco = scan.nextLine();
    System.out.println("Insira o cep:");
    String cep = scan.nextLine();
    System.out.println("Insira o email:");
    String email = scan.nextLine();
    System.out.println("Insira o cpf:");
    String cpf = scan.nextLine();
    System.out.println("Insira o nome:");
    String nome = scan.nextLine();
    System.out.println("Insira a data de nascimento no formato aaaa-mm-dd:");
    String dataNascimento = scan.nextLine();
    System.out.println("Insira o telefone:");
    String telefone = scan.nextLine();
    System.out.println("Insira o curso:");
    String curso = scan.nextLine();
    System.out.println("Insira a modalide:");
    String modalidade = scan.nextLine();
    System.out.println("Insira o período: \n");
    String periodo = scan.nextLine();

    Aluno aluno = new Aluno(endereco, cep, email, cpf, nome, dataNascimento, curso, modalidade, periodo, telefone);
    aluno.cadastrar();
  }

  private static void cadastrarProfessor() {
    System.out.println("Insira as informações necessárias:");

    System.out.println("Insira o endereço:");
    String endereco = scan.nextLine();
    System.out.println("Insira o cep:");
    String cep = scan.nextLine();
    System.out.println("Insira o email:");
    String email = scan.nextLine();
    System.out.println("Insira o cpf:");
    String cpf = scan.nextLine();
    System.out.println("Insira o nome:");
    String nome = scan.nextLine();
    System.out.println("Insira a data de nascimento no formato aaaa-mm-dd:");
    String dataNascimento = scan.nextLine();
    System.out.println("Insira o telefone:");
    String telefone = scan.nextLine();
    System.out.println("Insira a formação acadêmica:");
    String formacaoAcademica = scan.nextLine();

    Professor professor = new Professor(endereco, cep, email, cpf, nome, dataNascimento, formacaoAcademica, telefone);
    professor.cadastrar();
  }

  private static void cadastrarFornecedor() {
    System.out.println("Insira as informações necessárias:");

    System.out.println("Insira o endereço:");
    String endereco = scan.nextLine();
    System.out.println("Insira o cep:");
    String cep = scan.nextLine();
    System.out.println("Insira o email:");
    String email = scan.nextLine();
    System.out.println("Insira o cnpj:");
    String cnpj = scan.nextLine();
    System.out.println("Insira o Razão Social:");
    String razaoSocial = scan.nextLine();
    System.out.println("Insira o telefone:");
    String telefone = scan.nextLine();
    System.out.println("Insira o tipo:");
    String tipo = scan.nextLine();

    Fornecedor fornecedor = new Fornecedor(endereco, cep, email, cnpj, razaoSocial, telefone, tipo);
    fornecedor.cadastrar();
  }
}
