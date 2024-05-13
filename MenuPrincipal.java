public class MenuPrincipal {

  public static void apresentacao() {
    System.out.println("Bem vindo ao Teatro Municipal de Juiz de Fora!");
    System.out.println("Escolha uma opção: ");
    System.out.println("1 - Listar Eventos Semanais");
    System.out.println("2 - Comprar Ingresso");
    System.out.println("3 - Disposição de Assentos");
    System.out.println("4 - Cadastrar Evento");
    System.out.println("5 - Cadastrar Cliente");
    System.out.println("6 - Ver relatorio dos eventos");
    System.out.println("7 - Sair");
    String opcao = MenuPrincipalView.console.next();

    if (opcao.matches("[1-7]")) {
      switch (opcao) {
        case "1":
          MenuPrincipalView.listarEventos();
          MenuPrincipalView.deplay();
          apresentacao();
          break;
        case "2":
          MenuCompraIngresso.apresentacao();
          MenuPrincipalView.deplay();
          break;
        case "3":
          AssentoView.informacoesGeraisAssentos();
          MenuPrincipalView.deplay();
          break;
        case "4":
          CadastradorEventos.cadastrarEventos();
          MenuPrincipalView.deplay();
          apresentacao();
          break;
        case "5":
          CadastradorClientes.cadastrarCliente();
          MenuPrincipalView.deplay();
          apresentacao();
          break;
        case "6":
          System.out.println(Relatorio.relatorioEventos());
          MenuPrincipalView.deplay();
          apresentacao();
        case "7":
          System.out.println("Obrigado por vizitar o Teatro Municipal!");
          System.exit(0);
          break;
      }
    } else {
      System.out.println("Opção inválida!");
      apresentacao();
    }
  }
}
