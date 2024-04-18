import java.util.Arrays;

public class Validador {

  public static String validarNome(String nome) {
    if (nome.matches(".*[a-zA-Z].*")) {
      return nome;
    } else {
      System.out.println("Nome inválido! Digite novamente.");
      return Main.lerNomeEvento();
    }
  }

  public static String validarDescricao(String descricao) {
    if (descricao.matches(".*[a-zA-Z].*") && descricao.length() >= 10) {
      return descricao;
    } else {
      System.out.println("Descrição deve ter no minimo 10 caracteres! Digite novamente.");
      return Main.lerDescricaoEvento();
    }
  }

  public static int validarMes(String mesStr) {
    if (mesStr.matches("\\d+")) {
      int mes = Integer.parseInt(mesStr);
      if (mes >= 1 && mes <= 12) {
        return mes;
      }
    }
    System.out.println("Mês inválido! Digite novamente.");
    return Main.lerMesEvento();
  }

  public static boolean validarDiaNoMes(int dia, int mes) {
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

  public static int validarDia(String diaStr, int mes) {
    if (diaStr.matches("\\d+")) {
      int dia = Integer.parseInt(diaStr);
      if (validarDiaNoMes(dia, mes)) {
        return dia;
      }
    }
    System.out.println("Dia inválido! Digite novamente.");
    return Main.lerDiaEvento(mes);
  }

  public static String validarHorario(String horario) {
    if (horario.matches("([01]?[0-9]|2[0-3]):[0-5][0-9]")) {
      return horario;
    } else {
      System.out.println("Horário inválido! Digite novamente.");
      return Main.lerHorarioEvento();
    }
  }

  public static double validarPreco(String precoStr) {
    if (precoStr.matches("\\d+")) {
      double preco = Integer.parseInt(precoStr);
      if (preco >= 1) {
        return preco;
      }
    }
    System.out.println("Preço inválido! Digite novamente.");
    return Main.lerPrecoEvento();
  }

  public static int validarCapacidade(String capacidadeStr) {
    if (capacidadeStr.matches("\\d+")) {
      int capacidade = Integer.parseInt(capacidadeStr);
      if (capacidade > 0 && capacidade <= 1751) {
        return capacidade;
      }
    }
    System.out.println("Capacidade inválida! Digite novamente.");
    return Main.lerCapacidadeEvento();
  }
}
