public class AgendadorView {

  public static void validarAssentoA(Evento evento, int quantidade) {
    if (evento.getAssento().getPlateiaA() < 1) {
      System.out.println("Não há assentos disponiveis na Plateia A");
      MenuCompraIngressoView.escolherPosicaoAssento(evento, quantidade);
    } else {
      evento.diminuirCapacidade(quantidade);
      evento.getAssento().baixaAssentoA(quantidade);
      System.out.println("Assento reservado com sucesso!");
    }
  }

  public static void validarAssentoB(Evento evento, int quantidade) {
    if (evento.getAssento().getPlateiaB() < 1) {
      System.out.println("Não há assentos disponiveis na Plateia B");
      MenuCompraIngressoView.escolherPosicaoAssento(evento, quantidade);
    } else {
      evento.diminuirCapacidade(quantidade);
      evento.getAssento().baixaAssentoB(quantidade);
      System.out.println("Assento reservado com sucesso!");
    }
  }

  public static void validarBalcaoNobre(Evento evento, int quantidade) {
    if (evento.getAssento().getBalcaoNobre() < 1) {
      System.out.println("Não há assentos disponiveis no Balcão Nobre");
      MenuCompraIngressoView.escolherPosicaoAssento(evento, quantidade);
    } else {
      evento.diminuirCapacidade(quantidade);
      evento.getAssento().baixaBalcaoNobre(quantidade);
      System.out.println("Assento reservado com sucesso!");
    }
  }

  public static void validarCamarotes(Evento evento, int quantidade) {
    if (evento.getAssento().getCamarotes() < 1) {
      System.out.println("Não há assentos disponiveis no Camarote");
      MenuCompraIngressoView.escolherPosicaoAssento(evento, quantidade);
    } else {
      evento.diminuirCapacidade(quantidade);
      evento.getAssento().baixaCamarotes(quantidade);
      System.out.println("Assento reservado com sucesso!");
    }
  }

  public static void validarGaleria(Evento evento, int quantidade) {
    if (evento.getAssento().getGaleria() < 1) {
      System.out.println("Não há assentos disponiveis na Galeria");
      MenuCompraIngressoView.escolherPosicaoAssento(evento, quantidade);
    } else {
      evento.diminuirCapacidade(quantidade);
      evento.getAssento().baixaGaleria(quantidade);
      System.out.println("Assento reservado com sucesso!");
    }
  }

}