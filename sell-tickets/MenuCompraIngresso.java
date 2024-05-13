public class MenuCompraIngresso {

  public static void apresentacao()
  {
    System.out.println("Bem-vindo a compra de ingressos!");
    System.out.println("Escolha uma opção:");
    System.out.println("1 - Comprar ingresso");
    System.out.println("2 - Verificar eventos disponíveis");
    System.out.println("3 - Voltar ao menu principal");
    String opcao = MenuCompraIngressoView.console.nextLine();

    if (opcao.matches("[1-3]")) {
      switch (opcao) {
        case "1":
          MenuCompraIngressoView.validarCliente();
          MenuPrincipalView.deplay();
          break;
        case "2":
          MenuPrincipalView.listarEventos();
          MenuPrincipalView.deplay();
          apresentacao();
          break;
        case "3":
          MenuPrincipal.apresentacao();
          MenuPrincipalView.deplay();
          break;
      }
    } else {
      System.out.println("Opção inválida.");
      apresentacao();
    } 
  }
}
