import java.time.LocalDate;
import java.util.Calendar;

public class Evento {
  private String nome;
  private String horario;
  private LocalDate data;
  private Assento assento;
  private String descricao;
  private double preco;
  private int capacidade = 1751;
  
  
  public Evento(String nome, String horario, int mes, int dia, String descricao, double preco) {
    setNome(nome);
    setHorario(horario);
    setData(LocalDate.of(anoAtual(), mes, dia));
    setDescricao(descricao);
    setPreco(preco);
    this.assento = new Assento();
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

  public int anoAtual(){
    Calendar calendario = Calendar.getInstance();
    return calendario.get(Calendar.YEAR);
  }

  @Override
  public String toString() {
    return "Nome do evento: " + getNome() + "\n" +
           "Horário: " + getHorario() + "\n" +
           "Data da realização: " + formataData() + "\n" + 
           "Descrição: " + getDescricao() + "\n" + 
           "Preço: R$" + getPreco() + "\n" + 
           "Capacidade: " + getCapacidade();
  }

  public String formataData() {
    return this.data.getDayOfMonth() + "/" + this.data.getMonthValue() + "/" + this.data.getYear();
  }

  public Assento getAssento() {
    return this.assento;
  }

  public void diminuirCapacidade(int quantidade) {
    this.capacidade -= quantidade;
  }
}
