public class PagamentoView {

  public static void opçoesPagamento(Ingresso ingresso) {
    System.out.println("Escolha uma opção:");
    System.out.println("1 - Comprar ingressos presencialmente");
    System.out.println("2 - Comprar ingressos online");
    String opcao = MenuCompraIngressoView.console.nextLine();

    if (opcao.matches("[1-2]")) {
      switch (opcao) {
        case "1":
          descontoQuantidade(ingresso);
          break;
        case "2":
          Pagamento.acrescentarTaxaCompraOnline(ingresso.getEvento());
          descontoQuantidade(ingresso);
          break;
      }
    } else {
      System.out.println("Opção inválida.");
      opçoesPagamento(ingresso);
    } 
  }

  public static void descontoQuantidade(Ingresso ingresso) {
    if (ingresso.getQuantidadeAssentos() >= 3) {
      Pagamento.descontarPrecoQuantidade(ingresso.getEvento());
    }

    descontoIdade(ingresso);
  }

  private static void descontoIdade(Ingresso ingresso) {
    System.out.println("Você possui carteirinha de estudante, idoso ou gestante?");
    System.out.println("1 - Sim");
    System.out.println("2 - Não");
    String opcao = MenuCompraIngressoView.console.nextLine();

    if (opcao.matches("[1-2]")) {
      switch (opcao) {
        case "1":
          Pagamento.descontarMeiaEntrada(ingresso.getEvento());
          System.out.println("Valor total: " + ingresso.getEvento().getPreco());
          break;
        case "2":
          System.out.println("Valor total: " + ingresso.getEvento().getPreco());
          break;
      }
    } else {
      System.out.println("Opção inválida.");
      descontoIdade(ingresso);
    }

    finalizarPagamento(ingresso);
  }

  private static void finalizarPagamento(Ingresso ingresso) {
    System.out.println("Como deseja pagar? ");
    System.out.println("1 - Cartão de crédito");
    System.out.println("2 - Cartão de débito");
    System.out.println("3 - Dinheiro");
    System.out.println("4 - Pix");
    String opcao = MenuCompraIngressoView.console.nextLine();

    if (opcao.matches("[1-4]")) {
      System.out.println("Pagamento efetuado com sucesso!");
      Pagamento.geradorComprovante(ingresso);
    } else {
      System.out.println("Opção inválida.");
      finalizarPagamento(ingresso);
    }

    MenuPrincipal.apresentacao();
  }
}
