import java.util.ArrayList;

public class CadastradorEventos {
  public static ArrayList<Evento> eventos = new ArrayList<Evento>();

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
    } else {
      eventos.add(evento);
      System.out.println("Evento cadastrado com sucesso!");
    }
  }

  public static Evento lerDadosEvento() {
    String nome = MenuPrincipalView.lerNomeEvento();
    String descricao = MenuPrincipalView.lerDescricaoEvento();
    int mes = MenuPrincipalView.lerMes();
    int dia = MenuPrincipalView.lerDia(mes);
    String horario = MenuPrincipalView.lerHorarioEvento();
    double preco = MenuPrincipalView.lerPrecoEvento();

    return new Evento(nome, horario, mes, dia, descricao, preco);
  }
}
