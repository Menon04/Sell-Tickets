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

  public static Evento lerDadosEvento() {
    String nome = lerNomeEvento();
    String descricao = lerDescricaoEvento();
    System.out.println("Informacoes da data do evento");
    int mes = lerMesEvento();
    int dia = lerDiaEvento(mes);
    String horario = lerHorarioEvento();
    double preco = lerPrecoEvento();
    int capacidade = lerCapacidadeEvento();

    System.out.println("Evento cadastrado com sucesso!");
    return new Evento(nome, horario, mes, dia, descricao, preco, capacidade);
  }
  
  public static int lerCapacidadeEvento() {
    System.out.println("Digite a capacidade do evento: ");
    String capacidade = console.next();
    return Validador.validarCapacidade(capacidade);
  }

  public static double lerPrecoEvento() {
    System.out.println("Digite o preço do evento: ");
    String preco = console.next();
    return Validador.validarPreco(preco);
  }

  public static String lerHorarioEvento() {
    System.out.println("Digite o horário do evento: ");
    String horario = console.next();
    return Validador.validarHorario(horario);
  }

  public static int lerDiaEvento(int mes) {
    System.out.println("Digite o dia: ");
    String dia = console.next();
    return Validador.validarDia(dia, mes);
  }

  public static int lerMesEvento() {
    System.out.println("Digite o mês: ");
    String mes = console.next();
    return Validador.validarMes(mes);
  }

  public static String lerDescricaoEvento() {
    System.out.println("Digite a descrição do evento: ");
    String descricao = console.next();
    return Validador.validarDescricao(descricao);
  }

  public static String lerNomeEvento() {
    System.out.println("Digite o nome do evento: ");
    String nome = console.next();
    return Validador.validarNome(nome);
  }

}