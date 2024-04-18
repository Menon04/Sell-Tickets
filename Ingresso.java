public class Ingresso {
  private Evento evento;
  private int assento;
  private String nomeUsuario;

  public Ingresso(Evento evento, int cadeira, String nomeUsuario){
    setAssento(assento);
    setEvento(evento);
    setNomeUsuario(nomeUsuario);
  }

  public double aplicaDesconto(){
    return 0;
  }
  
  public boolean aplicaMeiaEntrada(){
    return true;
  }

  public Evento getEvento(){
    return this.evento;
  }

  public void setEvento(Evento evento){
    this.evento = evento;
  }

  public int getAssento(){
    return this.assento;
  }

  public void setAssento(int assento){
    this.assento = assento;
  }
  
  public String getNomeUsuario(){
    return this.nomeUsuario;
  }

  public void setNomeUsuario(String nomeUsuario){
    this.nomeUsuario = nomeUsuario;
  }

}
