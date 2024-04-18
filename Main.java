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
          
          apresentacao();
          break;
        case "3":
          informacoesAssentos();
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
    }
    opcaoInvalida();
  }

  private static void informacoesAssentos() {
    System.out.println("Informe qual seção de assentos você gostaria de saber mais: ");
    System.out.println("1 - Plateia");
    System.out.println("2 - Balcão Nobre");
    System.out.println("3 - Camarote");
    System.out.println("4 - Galeria");
    System.out.println("5 - Voltar ao menu principal");
    String opcao = console.next();

    if (opcao.matches("[1-5]")) {
      switch (opcao) {
        case "1":
          System.out.println("Temos a plateia sendo dividida entre Plateia A e Plateia B: ");
          System.out.println(
            "A Plateia A contém 572 cadeiras totais, sendo 200 cadeiras localizadas ao centro, 186 ao lado direito e 186 ao esquerdo");
          System.out.println(
            "Na Plateia B, temos mais cadeiras: 660, sendo distribuídas entre 200 ao centro, 230 ao lado direito e 230 ao lado esquerdo.\n");
          informacoesAssentos();
          break;
        case "2":
          System.out.println(
            "O Balcão Nobre contém 269 cadeiras ao todo, sendo 123 cadeiras ao centro, 73 ao lado direito e 73 ao lado esquerdo.\n");
          informacoesAssentos();
          break;
        case "3":
          System.out.println(
            "O Camarote possui poucas cadeiras, sendo 120 ao total, trazendo mais conforto e exclusividade. São 10 camarotes ímpares (contendo 6 cadeiras cada uma), tanto do lado direito quanto do lado esquerdo.\n");
          informacoesAssentos();
          break;
        case "4":
          System.out.println("Na Galeria, possuímos 130 cadeiras.\n");
          informacoesAssentos();
          break;
        case "5":
          apresentacao();
          break;
      }
    }
    informacoesAssentos();
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
    String descricao = console.nextLine();
    return Validador.validarDescricao(descricao);
  }

  public static String lerNomeEvento() {
    System.out.println("Digite o nome do evento: ");
    String nome = console.next();
    console.nextLine();
    return Validador.validarNome(nome);
  }
}