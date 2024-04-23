public class Pagamento {

  public static void geradorComprovante(Ingresso ingresso) {
    ingresso.validarIngresso();
  }

  public static void acrescentarTaxaCompraOnline(Evento evento) {
    evento.setPreco(evento.getPreco() * 1.01);
  }

  public static void descontarPrecoQuantidade(Evento evento) {
    evento.setPreco(evento.getPreco() * 0.95); 
  }

  public static void descontarMeiaEntrada(Evento evento) {
    evento.setPreco(evento.getPreco() * 0.5);
  }
}
