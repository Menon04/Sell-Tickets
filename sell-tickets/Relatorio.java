import java.util.ArrayList;

public class Relatorio {
  private static ArrayList<Evento> eventos = CadastradorEventos.eventos;

  public static String relatorioEventos(){
    StringBuilder relatorio = new StringBuilder();
    if (eventos.isEmpty()) {
      return "Não há eventos cadastrados!";
    }

    for (Evento evento : eventos) {
      relatorio.append(evento.getNome()).append("\n");
      relatorio.append("Arrecadou um total de: R$")
               .append(String.format("%.2f", evento.getTotalArrecadado())).append("\n");
      relatorio.append("Teve um total de: ").append(1751 - evento.getCapacidade())
               .append(" assentos ocupados\n");
    }
    return relatorio.toString();
  }
}
