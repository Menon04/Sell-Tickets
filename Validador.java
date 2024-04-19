import java.util.Arrays;
import java.util.Calendar;

public class Validador {

  public static String validarNomeEvento(String nome) {
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
    return Main.lerMes();
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
    return Main.lerDia(mes);
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

  public static int validarAno(String ano) {
    if (ano.matches("\\d+")) {
      int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
      int anoInt = Integer.parseInt(ano);
      if (anoInt >= 1900 && anoInt <= anoAtual) {
        return anoInt;
      }
    }
    System.out.println("Ano inválido! Digite novamente.");
    return Main.lerAno();
  }

  public static String validarCpf(String cpf) {
    if (cpf.matches("\\d{11}")) {
      return cpf;
    } else {
      System.out.println("CPF inválido! Digite novamente.");
      return Main.lerCpf();
    }
  }

  public static String validarNomeCliente(String nome) {
    if (nome.matches(".*[a-zA-Z].*")) {
      return nome;
    } else {
      System.out.println("Nome inválido! Digite novamente.");
      return Main.lerNomeCliente();
    }
  }
}
