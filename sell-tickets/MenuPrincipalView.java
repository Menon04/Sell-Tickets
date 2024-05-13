import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

@SuppressWarnings("unused")

public class MenuPrincipalView {
  public final static Scanner console = new Scanner(System.in);

  public static double lerPrecoEvento() {
    System.out.println("Digite o preço do evento: ");
    String precoStr = console.next();

    while(!(precoStr.matches("\\d+")) || Double.parseDouble(precoStr) < 1) {
      System.out.println("Preço inválido! Digite novamente.");
      precoStr = console.next();
    } 
    
    return Double.parseDouble(precoStr);
  }

  public static String lerHorarioEvento() {
    System.out.println("Digite o horário do evento: ");
    String horario = console.next();

    while(!(horario.matches("([01]?[0-9]|2[0-3]):[0-5][0-9]"))) {
      System.out.println("Horário inválido! Digite novamente.");
      horario = console.next();
    }

    return horario;
  }

  public static int lerDia(int mes) {
    System.out.println("Digite o dia: ");
    String diaStr = console.next();

    while(!(diaStr.matches("\\d+")) || !validarDiaNoMes(Integer.parseInt(diaStr), mes)) {
      System.out.println("Dia inválido! Digite novamente.");
      diaStr = console.next();
    }
    
    return Integer.parseInt(diaStr);
  }

  public static boolean validarDiaNoMes(int dia, int mes) {
    int[] mesesCom30Dias = {4, 6, 9, 11};

    if (dia < 1 || dia > 31) {
      return false;
    }

    if (mes == 2 && dia > 28) {
      return false;
    } 
    
    if (Arrays.binarySearch(mesesCom30Dias, mes) >= 0 && dia > 30) {
      return false;
    } 

    return true;
  }

  public static int lerMes() {
    System.out.println("Digite o mês: ");
    String mesStr = console.next();

    while(!(mesStr.matches("\\d+")) || Integer.parseInt(mesStr) < 1 || Integer.parseInt(mesStr) > 12){
      System.out.println("Mês inválido! Digite novamente.");
      mesStr = console.next();
    }
    
    return Integer.parseInt(mesStr);
  }

  public static String lerDescricaoEvento() {
    System.out.println("Digite a descrição do evento: ");
    String descricao = console.nextLine();

    while(!(descricao.matches(".*[a-zA-Z].*")) || descricao.length() < 10) {
      System.out.println("Descrição deve ter no minimo 10 caracteres! Digite novamente.");
      descricao = console.nextLine();
    }

    return descricao;
  }

  public static String lerNomeEvento() {
    System.out.println("Digite o nome do evento: ");
    String nome = console.next();
    console.nextLine();

    while(!(nome.matches(".*[a-zA-Z].*"))) {
      System.out.println("Nome inválido! Digite novamente.");
      nome = console.next();
      console.nextLine();
    }
    

    return nome;
  }

  public static String lerNomeCliente() {
    System.out.println("Digite o nome do cliente: ");
    String nome = console.next();
    console.nextLine();

    while(!(nome.matches(".*[a-zA-Z].*"))) {
      System.out.println("Nome inválido! Digite novamente.");
      nome = console.next();
    }

    return nome;
  }

  public static String lerCpf() {
    System.out.println("Digite o CPF do Cliente: ");
    String cpf = console.next();

    while(!(cpf.matches("\\d{11}"))) {
      System.out.println("CPF inválido! Digite novamente.");
      cpf = console.next();
    }

    return cpf;
  }

  public static int lerAno() {
    System.out.println("Digite o ano de nascimento: ");
    String ano = console.next();
    int anoAtual = Calendar.getInstance().get(Calendar.YEAR);

    while(!(ano.matches("\\d+")) || Integer.parseInt(ano) < 1900 || Integer.parseInt(ano) > anoAtual) {
      System.out.println("Ano inválido! Digite novamente.");
      ano = console.next();
    }
    
    return Integer.parseInt(ano);
  }

  public static void listarEventos() {
    if (CadastradorEventos.eventos.isEmpty()) {
      System.out.println("Não há eventos disponíveis no momento.");
    } else {
      System.out.println("Lista de eventos: \n");
      System.out.println("=======================================");
      for (Evento evento : CadastradorEventos.eventos) {
        System.out.println(evento.toString());
        System.out.println("=======================================");
      }
    }
  }

  public static void deplay() {
    try{
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.getMessage();
    }
  }
}
