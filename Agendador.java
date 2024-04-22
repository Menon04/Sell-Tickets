public class Agendador {
  
  public static void reservarAssento(String tipoAssento, Evento evento) {
		if (evento.getCapacidade() < 1) {
      System.out.println("Não é possivel comprar mais ingressos para esse evento");
      MenuCompraIngresso.apresentacao();
    }

    switch (tipoAssento) {
      case "1":
        if (evento.getAssento().getPlateiaA() < 1) {
          System.out.println("Não há assentos disponiveis na Plateia A");
          MenuCompraIngressoView.escolherAssento(evento);
        } else {
          
        }
        break;
      case "2":
        if (evento.getAssento().getPlateiaB() < 1) {
          System.out.println("Não há assentos disponiveis na Plateia B");
          MenuCompraIngressoView.escolherAssento(evento);
        }
        break;
      case "3":
        if (evento.getAssento().getBalcaoNobre() < 1) {
          System.out.println("Não há assentos disponiveis no Balcão Nobre");
          MenuCompraIngressoView.escolherAssento(evento);
        }
        break;
      case "4":
        if (evento.getAssento().getCamarotes() < 1) {
          System.out.println("Não há assentos disponiveis no Camarote");
          MenuCompraIngressoView.escolherAssento(evento);
        }
        break;
      case "5":
        if (evento.getAssento().getGaleria() < 1) {
          System.out.println("Não há assentos disponiveis na Galeria");
          MenuCompraIngressoView.escolherAssento(evento);
        }
        break;
    }
	}
}
