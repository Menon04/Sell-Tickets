public class Agendador {
  
  public static void reservarAssento(TipoAssento fileira, Ingresso ingresso) {
    switch (fileira) {
      case PLATEIA_A:
        AgendadorView.validarAssentoA(ingresso);
        break;
      case PLATEIA_B:
        AgendadorView.validarAssentoB(ingresso);
        break;
      case BALCAO_NOBRE:
        AgendadorView.validarBalcaoNobre(ingresso);
        break;
      case CAMAROTE:
        AgendadorView.validarCamarotes(ingresso);
        break;
      case GALERIA:
        AgendadorView.validarGaleria(ingresso);
        break;
    }

    PagamentoView.opçoesPagamento(ingresso);
	}
}
