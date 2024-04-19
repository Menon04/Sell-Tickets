import java.util.Scanner;
@SuppressWarnings("unused")
public class Main {
  public final static Scanner console = new Scanner(System.in);

  public static void main(String[] args) {
    try {
      MenuPrincipal menuInicial = new MenuPrincipal();
      MenuPrincipal.apresentacao();
    } catch (Exception e) {
      System.out.println("Tomou uma exeção: " + e.getMessage());
    }
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