public class AgendadorView {

  public static void validarAssentoA(Ingresso ingresso) {
    if (ingresso.getEvento().getAssento().getPlateiaA() < 1) {
      System.out.println("Não há assentos disponiveis na Plateia A");
      MenuCompraIngressoView.escolherPosicaoAssento(ingresso);
    } else {
      ingresso.getEvento().diminuirCapacidade(ingresso.getQuantidadeAssentos());
      ingresso.getEvento().getAssento().baixaAssentoA(ingresso.getQuantidadeAssentos());
      System.out.println("Assento reservado com sucesso!");
    }
  }

  public static void validarAssentoB(Ingresso ingresso) {
    if (ingresso.getEvento().getAssento().getPlateiaB() < 1) {
      System.out.println("Não há assentos disponiveis na Plateia B");
      MenuCompraIngressoView.escolherPosicaoAssento(ingresso);
    } else {
      ingresso.getEvento().diminuirCapacidade(ingresso.getQuantidadeAssentos());
      ingresso.getEvento().getAssento().baixaAssentoB(ingresso.getQuantidadeAssentos());
      System.out.println("Assento reservado com sucesso!");
    }
  }

  public static void validarBalcaoNobre(Ingresso ingresso) {
    if (ingresso.getEvento().getAssento().getBalcaoNobre() < 1) {
      System.out.println("Não há assentos disponiveis no Balcão Nobre");
      MenuCompraIngressoView.escolherPosicaoAssento(ingresso);
    } else {
      ingresso.getEvento().diminuirCapacidade(ingresso.getQuantidadeAssentos());
      ingresso.getEvento().getAssento().baixaBalcaoNobre(ingresso.getQuantidadeAssentos());
      System.out.println("Assento reservado com sucesso!");
    }
  }

  public static void validarCamarotes(Ingresso ingresso) {
    if (ingresso.getEvento().getAssento().getCamarotes() < 1) {
      System.out.println("Não há assentos disponiveis no Camarote");
      MenuCompraIngressoView.escolherPosicaoAssento(ingresso);
    } else {
      ingresso.getEvento().diminuirCapacidade(ingresso.getQuantidadeAssentos());
      ingresso.getEvento().getAssento().baixaCamarotes(ingresso.getQuantidadeAssentos());
      System.out.println("Assento reservado com sucesso!");
    }
  }

  public static void validarGaleria(Ingresso ingresso) {
    if (ingresso.getEvento().getAssento().getGaleria() < 1) {
      System.out.println("Não há assentos disponiveis na Galeria");
      MenuCompraIngressoView.escolherPosicaoAssento(ingresso);
    } else {
      ingresso.getEvento().diminuirCapacidade(ingresso.getQuantidadeAssentos());
      ingresso.getEvento().getAssento().baixaGaleria(ingresso.getQuantidadeAssentos());
      System.out.println("Assento reservado com sucesso!");
    }
  }
}
