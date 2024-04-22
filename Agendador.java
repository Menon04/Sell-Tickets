public class Agendador {
  
  public static void reservarAssento(TipoAssento fileira, Evento evento, int quantidade) {

    switch (fileira) {
      case PLATEIA_A:
        AgendadorView.validarAssentoA(evento, quantidade);
        PagamentoView.subMenuCompras(evento.getPreco(), quantidade);
        break;
      case PLATEIA_B:
        AgendadorView.validarAssentoB(evento, quantidade);
        break;
      case BALCAO_NOBRE:
        AgendadorView.validarBalcaoNobre(evento, quantidade);
        break;
      case CAMAROTE:
        AgendadorView.validarCamarotes(evento, quantidade);
        break;
      case GALERIA:
        AgendadorView.validarGaleria(evento, quantidade);
        break;
    }
	}
}
