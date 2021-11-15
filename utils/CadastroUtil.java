package utils;
import java.nio.file.*;
import java.util.List;

public class CadastroUtil {

  public static <T> void cadastrar(T object, String option) {
    String filePath = "";
    switch (option) {
      case "aluno":
        filePath = "./db/aluno.txt";
        break;
      case "professor":
        filePath = "./db/professor.txt";
        break;
      case "fornecedor":
        filePath = "./db/fornecedor.txt";
        break;

      default:
      break;
    }
        try {
        Path path = Paths.get(filePath);
        if (!Files.exists(path)) Files.createFile(path);
        Files.write(path, object.toString().getBytes(), StandardOpenOption.APPEND);
        } catch (Exception ex) {
          ex.printStackTrace();
        }
  }

  public static void listar(String option) {
    String filePath = "";
    switch (option) {
      case "aluno":
        filePath = "./db/aluno.txt";
        break;
      case "professor":
        filePath = "./db/professor.txt";
        break;
      case "fornecedor":
        filePath = "./db/fornecedor.txt";
        break;

      default:
      break;
    }
      try {
        Path path = Paths.get(filePath);
        List<String> fileLines = Files.readAllLines(path);

        for (String line : fileLines) {
          System.out.println(line);
        }
      } catch (Exception ex) {
        ex.printStackTrace();
      }
  }
}
