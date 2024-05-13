public class Agendador {
  
  public static void reservarAssento(TipoAssento fileira, Ingresso ingresso) {
    switch (fileira) {
      case PLATEIA_A:
        AgendadorView.validarAssentoA(ingresso);
        MenuPrincipalView.deplay();
        break;
      case PLATEIA_B:
        AgendadorView.validarAssentoB(ingresso);
        MenuPrincipalView.deplay();
        break;
      case BALCAO_NOBRE:
        AgendadorView.validarBalcaoNobre(ingresso);
        MenuPrincipalView.deplay();
        break;
      case CAMAROTE:
        AgendadorView.validarCamarotes(ingresso);
        MenuPrincipalView.deplay();
        break;
      case GALERIA:
        AgendadorView.validarGaleria(ingresso);
        MenuPrincipalView.deplay();
        break;
    }

    PagamentoView.opçoesPagamento(ingresso);
	}
}
