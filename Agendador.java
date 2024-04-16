import java.util.ArrayList;

public class Agendador {
  ArrayList<Evento> eventos = new ArrayList<Evento>();
  ArrayList<Cliente> clientes = new ArrayList<Cliente>();

  public void cadastrarEvento(Evento evento){
    eventos.add(evento);
  }

}