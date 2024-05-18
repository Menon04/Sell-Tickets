public class AgendadorView {

  public static void validarAssentoA(Ingresso ingresso) {
    if (ingresso.getEvento().getAssento().getPlateiaA() < 1 || ingresso.getQuantidadeAssentos() > ingresso.getEvento().getAssento().getPlateiaA()){
      System.out.println("Não há assentos disponiveis na Plateia A");
      MenuPrincipalView.deplay();
      MenuCompraIngressoView.escolherPosicaoAssento(ingresso);
    } else {
      ingresso.getEvento().diminuirCapacidade(ingresso.getQuantidadeAssentos());
      ingresso.getEvento().getAssento().baixaAssentoA(ingresso.getQuantidadeAssentos());
      System.out.println("Assento reservado com sucesso!");
    }
  }

  public static void validarAssentoB(Ingresso ingresso) {
    if (ingresso.getEvento().getAssento().getPlateiaB() < 1 || ingresso.getQuantidadeAssentos() > ingresso.getEvento().getAssento().getPlateiaB()) {
      System.out.println("Não há assentos disponiveis na Plateia B");
      MenuPrincipalView.deplay();
      MenuCompraIngressoView.escolherPosicaoAssento(ingresso);
    } else {
      ingresso.getEvento().diminuirCapacidade(ingresso.getQuantidadeAssentos());
      ingresso.getEvento().getAssento().baixaAssentoB(ingresso.getQuantidadeAssentos());
      System.out.println("Assento reservado com sucesso!");
    }
  }

  public static void validarBalcaoNobre(Ingresso ingresso) {
    if (ingresso.getEvento().getAssento().getBalcaoNobre() < 1 || ingresso.getQuantidadeAssentos() > ingresso.getEvento().getAssento().getBalcaoNobre()){
      System.out.println("Não há assentos disponiveis no Balcão Nobre");
      MenuPrincipalView.deplay();
      MenuCompraIngressoView.escolherPosicaoAssento(ingresso);
    } else {
      ingresso.getEvento().diminuirCapacidade(ingresso.getQuantidadeAssentos());
      ingresso.getEvento().getAssento().baixaBalcaoNobre(ingresso.getQuantidadeAssentos());
      System.out.println("Assento reservado com sucesso!");
    }
  }

  public static void validarCamarotes(Ingresso ingresso) {
    if (ingresso.getEvento().getAssento().getCamarotes() < 1 || ingresso.getQuantidadeAssentos() > ingresso.getEvento().getAssento().getCamarotes()){
      System.out.println("Não há assentos disponiveis no Camarote");
      MenuPrincipalView.deplay();
      MenuCompraIngressoView.escolherPosicaoAssento(ingresso);
    } else {
      ingresso.getEvento().diminuirCapacidade(ingresso.getQuantidadeAssentos());
      ingresso.getEvento().getAssento().baixaCamarotes(ingresso.getQuantidadeAssentos());
      System.out.println("Assento reservado com sucesso!");
    }
  }

  public static void validarGaleria(Ingresso ingresso) {
    if (ingresso.getEvento().getAssento().getGaleria() < 1 || ingresso.getQuantidadeAssentos() > ingresso.getEvento().getAssento().getGaleria()){
      System.out.println("Não há assentos disponiveis na Galeria");
      MenuPrincipalView.deplay();
      MenuCompraIngressoView.escolherPosicaoAssento(ingresso);
    } else {
      ingresso.getEvento().diminuirCapacidade(ingresso.getQuantidadeAssentos());
      ingresso.getEvento().getAssento().baixaGaleria(ingresso.getQuantidadeAssentos());
      System.out.println("Assento reservado com sucesso!");
    }
  }
}
