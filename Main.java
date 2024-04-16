import java.util.Scanner;

@SuppressWarnings("unused")
public class Main {
  private final static Scanner console = new Scanner(System.in);

  public static void main(String[] args) {
    try {
      apresentacao();

    } catch (Exception e) {
      System.out.println("Tomou uma exeção: " + e.getMessage());
    }
  }
  
  private static void apresentacao() {
    System.out.println("Bem vindo ao Teatro Municipal de Juiz de Fora!");
    System.out.println("Escolha uma opção: ");
    System.out.println("1 - Listar Apresentações Semanais");
    System.out.println("2 - Comprar Ingresso");
    System.out.println("3 - Informações de Assentos");
    System.out.println("4 - Sair");
    String opcao = console.next();

    if (opcao.matches("[1-4]")) {
      switch (opcao) {
        case "1":
          listarApresentacoes();
          break;
        case "2":
          comprarIngresso();
          break;
        case "3":
          informacoesAssentos();
          break;
        case "4":
          System.out.println("Obrigado por utilizar o sistema!");
          System.exit(0);
          break;
      }
    } 
    opcaoInvalida();
  }

  private static void informacoesAssentos() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'informacoesAssentos'");
  }

  private static void comprarIngresso() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'comprarIngresso'");
  }

  private static void listarApresentacoes() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listarApresentacoes'");
  }

  public static void opcaoInvalida() {
    System.out.println("Opção inválida!");
    apresentacao();
  }
}