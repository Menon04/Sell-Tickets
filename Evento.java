import java.time.LocalDate;

public class Evento {
  private String nome;
  private String horario;
  private LocalDate data;
  private String descricao;
  private double preco;
  private int capacidade;

  
  public Evento(String nome, String horario, int ano, int mes, int dia, String descricao, double preco, int capacidade) {
    setNome(nome);
    setHorario(horario);
    setData(LocalDate.of(ano, mes, dia));
    setDescricao(descricao);
    setPreco(preco);
    setCapacidade(capacidade);
  }
  
  public String getHorario()
  {
    return this.horario;
  }

  public String getNome() {
    return this.nome;
  }

  public LocalDate getDate(){
    return this.data;
  }

  public String getDescricao(){
    return this.descricao;
  }

  public double getPreco(){
    return this.preco;
  }

  public int getCapacidade(){
    return this.capacidade;
  }

  public void setHorario(String duracao) {
    this.horario = duracao;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setData(LocalDate data){
    this.data = data;
  }

  public void setDescricao(String descricao){
    this.descricao = descricao;
  }

  public void setPreco(double preco){
    this.preco = preco;
  }

  public void setCapacidade(int capacidade){
    this.capacidade = capacidade;
  }
}