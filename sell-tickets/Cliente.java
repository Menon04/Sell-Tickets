import java.time.LocalDate;
import java.time.Period;

public class Cliente {
  private String nome;
  private String cpf;
  private LocalDate dataNasc;
  private Ingresso ingresso = null;

  public Cliente(String nome, String cpf, int ano, int mes, int dia){
    setNome(nome);
    setCpf(cpf);
    setDataNasc(LocalDate.of(ano, mes, dia));
    this.idadeUsuario();
  }

  public int idadeUsuario(){
    return Period.between(this.dataNasc, LocalDate.now()).getYears();
  }

  public String getNome(){
    return this.nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getCpf(){
    return this.cpf;
  }

  public void setCpf(String cpf){
    this.cpf = cpf;
  }

  public LocalDate getDataNasc(){
    return this.dataNasc;
  }
  
  public void setDataNasc(LocalDate dataNasc){
    this.dataNasc = dataNasc;
  }

  public void setIngresso(Ingresso ingresso){
    this.ingresso = ingresso;
  }

  public Ingresso getIngresso(){
    return this.ingresso;
  }
}
