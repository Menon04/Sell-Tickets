import java.util.ArrayList;

public class ControladorEventos {
  public static ArrayList<Evento> eventos = new ArrayList<Evento>();

  public static boolean listarEventos() {
    if (eventos.isEmpty()) {
      System.out.println("Não há eventos disponíveis no momento.");
      return false;
    } else {
      System.out.println("Lista de eventos: \n");
      System.out.println("=======================================");
      for (Evento evento : eventos) {
        System.out.println(evento.toString());
        System.out.println("=======================================");
      }
      return true;
    }
  }

  public static void cadastrarEventos() {
    Evento evento = lerDadosEvento();
    boolean eventoExistente = false;

    for (Evento e : eventos) {
      if (e.getDate().equals(evento.getDate()) && e.getHorario().equals(evento.getHorario())) {
        eventoExistente = true;
        break;
      }
    }

    if (eventoExistente) {
      System.out.println("Já existe um evento cadastrado para essa data.");
      MenuPrincipal.apresentacao();
    } else {
      eventos.add(evento);
      System.out.println("Evento cadastrado com sucesso!");
    }
  }

  public static Evento lerDadosEvento() {
    String nome = Main.lerNomeEvento();
    String descricao = Main.lerDescricaoEvento();
    System.out.println("Informacoes da data do evento");
    int mes = Main.lerMes();
    int dia = Main.lerDia(mes);
    String horario = Main.lerHorarioEvento();
    double preco = Main.lerPrecoEvento();

    return new Evento(nome, horario, mes, dia, descricao, preco);
  }
}
