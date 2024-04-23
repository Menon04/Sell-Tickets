public class CadastradorIngressos {
  
  public static Ingresso criarIngresso(Cliente cliente) {
    Ingresso ingresso = new Ingresso();
    ingresso.setComprador(cliente);
    return ingresso;
  }

  public static Ingresso adicionarEvento(Evento evento, Ingresso ingresso) {
    ingresso.setEvento(evento);
    return ingresso;
  }

  public static Ingresso adicionarQuantidadeAssentos(Ingresso ingresso, int quantidadeAssentos) {
    ingresso.setQuantidadeAseentos(quantidadeAssentos);
    return ingresso;
  }
}
