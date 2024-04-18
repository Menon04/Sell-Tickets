import java.util.Arrays;
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
    String nome = lerNome();
    String descricao = lerDescricao();
    System.out.println("Informacoes da data do evento");
    int mes = lerMes();
    int dia = lerDia(mes);
    String horario = lerHorario();
    double preco = lerPreco();
    int capacidade = lerCapacidade();

    return new Evento(nome, horario, mes, dia, descricao, preco, capacidade);
  }

  private static int lerCapacidade() {
    System.out.println("Digite a capacidade do evento: ");
    String capacidade = console.next();
    return validarCapacidade(capacidade);
  }

  private static int validarCapacidade(String capacidadeStr) {
    if (capacidadeStr.matches("\\d+")) {
      int capacidade = Integer.parseInt(capacidadeStr);
      if (capacidade > 0 && capacidade <= 1751) {
        return capacidade;
      }
    }
    System.out.println("Capacidade inválida! Digite novamente.");
    return lerCapacidade();
  }

  private static double lerPreco() {
    System.out.println("Digite o preço do evento: ");
    String preco = console.next();
    return validarPreco(preco);
  }

  private static double validarPreco(String precoStr) {
    if (precoStr.matches("\\d+")) {
      double preco = Integer.parseInt(precoStr);
      if (preco >= 1) {
        return preco;
      }
    }
    System.out.println("Preço inválido! Digite novamente.");
    return lerPreco();
  }

  private static String lerHorario() {
    System.out.println("Digite o horário do evento: ");
    String horario = console.next();
    return validarHorario(horario);
  }

  private static String validarHorario(String horario) {
    if (horario.matches("([01]?[0-9]|2[0-3]):[0-5][0-9]")) {
      return horario;
    } else {
      System.out.println("Horário inválido! Digite novamente.");
      return lerHorario();
    }
  }

  private static int lerDia(int mes) {
    System.out.println("Digite o dia: ");
    String dia = console.next();
    return validarDia(dia, mes);
  }

  private static int validarDia(String diaStr, int mes) {
    if (diaStr.matches("\\d+")) {
      int dia = Integer.parseInt(diaStr);
      if (validarDiaNoMes(dia, mes)) {
        return dia;
      }
    }
    System.out.println("Dia inválido! Digite novamente.");
    return lerDia(mes);
  }

  private static boolean validarDiaNoMes(int dia, int mes) {
    int[] mesesCom30Dias = {4, 6, 9, 11};

    if (dia < 1 || dia > 31) {
      return false;
    }

    if (mes == 2 && dia > 28) {
      System.out.println("Data inválida! Digite novamente.");
      return false;
    } 
    
    if (Arrays.binarySearch(mesesCom30Dias, mes) >= 0 && dia > 30) {
      System.out.println("Data inválida! Digite novamente.");
      return false;
    } 

    return true;
  }

  private static int lerMes() {
    System.out.println("Digite o mês: ");
    String mes = console.next();
    return validarMes(mes);
  }

  private static int validarMes(String mesStr) {
    if (mesStr.matches("\\d+")) {
      int mes = Integer.parseInt(mesStr);
      if (mes >= 1 && mes <= 12) {
        return mes;
      }
    }
    System.out.println("Mês inválido! Digite novamente.");
    return lerMes();
  }

  private static String lerDescricao() {
    System.out.println("Digite a descrição do evento: ");
    String descricao = console.next();
    return validarDescricao(descricao);
  }

  private static String validarDescricao(String descricao) {
    if (descricao.matches(".*[a-zA-Z].*") && descricao.length() >= 10) {
      return descricao;
    } else {
      System.out.println("Descrição deve ter no minimo 10 caracteres! Digite novamente.");
      return lerDescricao();
    }
  }

  private static String lerNome() {
    System.out.println("Digite o nome do evento: ");
    String nome = console.next();
    return validarNome(nome);
  }

  private static String validarNome(String nome) {
    if (nome.matches(".*[a-zA-Z].*")) {
      return nome;
    } else {
      System.out.println("Nome inválido! Digite novamente.");
      return lerNome();
    }
  }

}