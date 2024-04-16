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
    System.out.println("1 - Listar Eventos Semanais");
    System.out.println("2 - Comprar Ingresso");
    System.out.println("3 - Informações de Assentos");
    System.out.println("4 - Cadastrar Evento");
    System.out.println("5 - Sair");
    String opcao = console.next();

    if (opcao.matches("[1-5]")) {
      switch (opcao) {
        case "1":
          ControladorEventos.listarEventos();
          System.out.println("Não há eventos disponíveis no momento.");
          apresentacao();
          break;
        case "2":
          comprarIngresso();
          break;
        case "3":
          informacoesAssentos();
          break;
        case "4":
          ControladorEventos.cadastrarEventos();
          break;
        case "5":
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

  public static void opcaoInvalida() {
    System.out.println("Opção inválida!");
    apresentacao();
  }

  public static Evento pegarDadosEvento() {
    String nome = pegarNome();
    String descricao = pegarDescricao();
    System.out.println("Informacoes da data do evento");
    
    
    System.out.println("Digite o ano: ");
    int ano = console.nextInt();
    System.out.println("Digite o mês: ");
    int mes = console.nextInt();
    System.out.println("Digite o dia: ");
    int dia = console.nextInt();
    System.out.println("=================================");

    System.out.println("Digite o horário do evento: ");
    String horario = console.next();
    System.out.println("=================================");

    System.out.println("Digite o preço do evento: ");
    double preco = console.nextDouble();
    System.out.println("=================================");

    System.out.println("Digite a capacidade do evento: ");
    int capacidade = console.nextInt();
    System.out.println("=================================");
    
    return new Evento(nome, horario, ano, mes, dia, descricao, preco, capacidade);
  }

  private static String pegarDescricao() {
    System.out.println("Digite a descrição do evento: ");
    String descricao = console.next();
    return validarDescricao(descricao);
  }

  private static String validarDescricao(String descricao) {
    if (descricao.matches("[a-zA-Z]{10,}")) {
      return descricao;
    } else {
      System.out.println("Descrição deve ter no minimo 10 caracteres! Digite novamente.");
      return pegarDescricao();
    }
  }

  private static String pegarNome() {
    System.out.println("Digite o nome do evento: ");
    String nome = console.next();
    return validarNome(nome);
  }

  private static String validarNome(String nome) {
    if (nome.matches("[a-zA-Z]{3,}")) {
      return nome;
    } else {
      System.out.println("Nome inválido! Digite novamente.");
      return pegarNome();
    }
  }

  // private static int pegarAno(int ano){

  // }
}