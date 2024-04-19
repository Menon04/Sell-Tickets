import java.util.Scanner;
@SuppressWarnings("unused")
public class Main {
  public final static Scanner console = new Scanner(System.in);

  public static void main(String[] args) {
    try {
      apresentacao();
    } catch (Exception e) {
      System.out.println("Tomou uma exeção: " + e.getMessage());
    }
  }

  public static void apresentacao() {
    System.out.println("Bem vindo ao Teatro Municipal de Juiz de Fora!");
    System.out.println("Escolha uma opção: ");
    System.out.println("1 - Listar Eventos Semanais");
    System.out.println("2 - Comprar Ingresso");
    System.out.println("3 - Informações de Assentos");
    System.out.println("4 - Cadastrar Evento");
    System.out.println("5 - Cadastrar Cliente");
    System.out.println("6 - Sair");
    String opcao = console.next();

    if (opcao.matches("[1-6]")) {
      switch (opcao) {
        case "1":
          ControladorEventos.listarEventos();
          apresentacao();
          break;
        case "2":
          Agendador.comprarIngresso();
          apresentacao();
          break;
        case "3":
          Assento.informacoesAssentos();
          break;
        case "4":
          ControladorEventos.cadastrarEventos();
          apresentacao();
          break;
        case "5":
          ControladorClientes.cadastrarCliente();
          apresentacao();
          break;
        case "6":
          System.out.println("Obrigado por utilizar o sistema!");
          System.exit(0);
          break;
      }
    } else {
      opcaoInvalida();
    }
  }

  public static void opcaoInvalida() {
    System.out.println("Opção inválida!");
    apresentacao();
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

  public static int lerDia(int mes) {
    System.out.println("Digite o dia: ");
    String dia = console.next();
    return Validador.validarDia(dia, mes);
  }

  public static int lerMes() {
    System.out.println("Digite o mês: ");
    String mes = console.next();
    return Validador.validarMes(mes);
  }

  public static String lerDescricaoEvento() {
    System.out.println("Digite a descrição do evento: ");
    String descricao = console.nextLine();
    return Validador.validarDescricao(descricao);
  }

  public static String lerNomeEvento() {
    System.out.println("Digite o nome do evento: ");
    String nome = console.next();
    console.nextLine();
    return Validador.validarNomeEvento(nome);
  }

  public static String lerNomeCliente() {
    System.out.println("Digite o nome do cliente: ");
    String nome = console.next();
    console.nextLine();
    return Validador.validarNomeCliente(nome);
  }

  public static String lerCpf() {
    System.out.println("Digite o CPF do Cliente: ");
    String cpf = console.next();
    return Validador.validarCpf(cpf);
  }

  public static int lerAno() {
    System.out.println("Digite o ano de nascimento: ");
    String ano = console.next();
    return Validador.validarAno(ano);
  }
}