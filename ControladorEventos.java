import java.util.ArrayList;

public class ControladorEventos {
  private static ArrayList<Evento> eventos = new ArrayList<Evento>();

  public static boolean listarEventos() {
    if (eventos.isEmpty()) {
      return false;
    } else {
      for (Evento evento : eventos) {
        System.out.println(evento.getNome());
        System.out.println(evento.getDescricao());
        System.out.println(evento.getDate());
        System.out.println(evento.getHorario());
        System.out.println(evento.getPreco());
        System.out.println(evento.getCapacidade());
      }
      return true;
    }
  }

	public static void cadastrarEventos() {
		Evento evento = Main.lerDadosEvento();
    eventos.add(evento);
  }
}
