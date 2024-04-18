public class Ingresso {
  private Evento evento;
  private int cadeira;
  private String nomeUsuario; //nao consigo pensar em um nome melhor

  public Ingresso(Evento evento, int cadeira, String nomeUsuario){
    setCadeira(cadeira);
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

  public int getCadeira(){
    return this.cadeira;
  }

  public void setCadeira(int cadeira){
    this.cadeira = cadeira;
  }
  public String getNomeUsuario(){
    return this.nomeUsuario;
  }

  public void setNomeUsuario(String nomeUsuario){
    this.nomeUsuario = nomeUsuario;
  }

}
