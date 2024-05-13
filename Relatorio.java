import java.util.ArrayList;

public class Relatorio {
  private static ArrayList<Evento> eventos = CadastradorEventos.eventos;

  public static String relatorioEventos(){
    String relatorio = "";
    if (eventos.isEmpty()) {
      return "Não há eventos cadastrados!";
    }

    for (Evento evento : eventos) {
      relatorio += evento.getNome() + "\n" 
      + "Arrecadou um total de: R$" + evento.getTotalArrecadado() + "\n" 
      + "Teve um total de: " + evento.getCapacidade() + " asssentos ocupados" + "\n";
    }
    return relatorio;
  }
}
