public class MenuPrincipal {

  public static void apresentacao() {
    System.out.println("Bem vindo ao Teatro Municipal de Juiz de Fora!");
    System.out.println("Escolha uma opção: ");
    System.out.println("1 - Listar Eventos Semanais");
    System.out.println("2 - Comprar Ingresso");
    System.out.println("3 - Informações de Assentos");
    System.out.println("4 - Cadastrar Evento");
    System.out.println("5 - Cadastrar Cliente");
    System.out.println("6 - Sair");
    String opcao = Main.console.next();

    if (opcao.matches("[1-6]")) {
      switch (opcao) {
        case "1":
          ControladorEventos.listarEventos();
          apresentacao();
          break;
        case "2":
          MenuCompraIngresso.apresentacao();
          break;
        case "3":
          Assento.informacoesAssentos();
          break;
        case "4":
          ControladorEventos.cadastrarEventos();
          apresentacao();
          break;
        case "5":
          ControladorClientes.cadastrarCliente();
          apresentacao();
          break;
        case "6":
          System.out.println("Obrigado por utilizar o sistema!");
          System.exit(0);
          break;
      }
    } else {
      opcaoInvalida();
    }
  }

  public static void opcaoInvalida() {
    System.out.println("Opção inválida!");
    apresentacao();
  }
}