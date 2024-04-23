public class Ingresso {
  private Evento evento;
  private Cliente comprador;
  private int quantidadeAssentos;
  private boolean valido = false;

  public Evento getEvento(){
    return this.evento;
  }

  public void setEvento(Evento evento){
    this.evento = evento;
  }

  public int getAssento(){
    return this.quantidadeAssentos;
  }

  public void setQuantidadeAseentos(int quantidadeAssentos){
    this.quantidadeAssentos = quantidadeAssentos;
  }

  public int getQuantidadeAssentos() {
    return quantidadeAssentos;
  }
  
  public Cliente getComprador(){
    return this.comprador;
  }

  public void setComprador(Cliente comprador){
    this.comprador = comprador;
  }

  public void validarIngresso() {
    this.valido = true;
  }

  public boolean checarIngresso() {
    return this.valido;
  }
}
