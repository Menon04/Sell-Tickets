import java.time.LocalDate;
import java.time.Period;

public class Cliente {
  private String nome;
  private String cpf;
  private String email;
  private LocalDate dataNasc;

  public Cliente(){
    this("","","",0,0,0);
  }
  public Cliente(String nome, String cpf,String email ,int ano, int mes, int dia){
    setNome(nome);
    setCpf(cpf);
    setDataNasc(LocalDate.of(ano, mes, dia));
    setEmail(email);
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

  public String getEmail(){
    return this.nome;
  }

  public void setEmail(String email){
    this.email = email;
  }

  public LocalDate getDataNasc(){
    return this.dataNasc;
  }
  
  public void setDataNasc(LocalDate dataNasc){
    this.dataNasc = dataNasc;
  }
}