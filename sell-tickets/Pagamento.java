public class Pagamento {

  public static void descontarPrecoQuantidade(Ingresso ingresso) {
    ingresso.alterarValor(ingresso.getValor() * 0.95); 
  }

  public static void descontarMeiaEntrada(Ingresso ingresso) {
    ingresso.alterarValor(ingresso.getValor() * 0.5);
  }

  public static void compraOnline(Ingresso ingresso) {
    ingresso.alterarValor(ingresso.getValor() * 1.01);
  }

  public static void calcularDescontoQuantidade(Ingresso ingresso) {
    if (ingresso.getQuantidadeAssentos() >= 3) {
      Pagamento.descontarPrecoQuantidade(ingresso);
    }
  }
}
