public class Apresentacao {
  private String titulo;
  private int duracao;

  public Apresentacao(){
    this("", 0);
  }
  
  public Apresentacao(String titulo, int duracao) {
    setTitulo(titulo);
    setDuracao(duracao);
  }
  
  public int getDuracao()
  {
    return this.duracao;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public void setDuracao(int duracao) {
    this.duracao = duracao;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
}