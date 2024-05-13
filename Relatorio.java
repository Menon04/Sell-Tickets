import java.util.ArrayList;

public class Relatorio {
  private ArrayList<Evento> eventos = CadastradorEventos.eventos;
  private int CAPACIDADE_TOTAL = 1751;

  public String relatorioEventos(){
    String relatorio = "";
    for (Evento evento : eventos) {
      relatorio += evento.getNome() + "\n" 
      + "Arrecadou um total de: " + valorArrecadado(evento) + "$" + "\n" 
      + "Teve um total de: " + assentosOcupados(evento) + "asssentos ocupados" + "\n";
    }
    return relatorio;
  }

  public String valorArrecadado(Evento evento){
    double vendas = CAPACIDADE_TOTAL - evento.getCapacidade();
    return Double.toString((vendas * evento.getPreco()));
  }

  public String assentosOcupados(Evento evento){
    int assentosOcupados = (evento.getCapacidade() - CAPACIDADE_TOTAL) * -1;
    return Integer.toString(assentosOcupados);
  }
}
