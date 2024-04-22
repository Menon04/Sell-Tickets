import java.util.ArrayList;

public class MenuCompraIngresso {

  public static void apresentacao()
  {
    System.out.println("Bem-vindo a compra de ingressos!");
    System.out.println("Escolha uma opção:");
    System.out.println("1 - Comprar ingresso");
    System.out.println("2 - Verificar assentos disponíveis");
    System.out.println("3 - Voltar ao menu principal");
    String opcao = MenuCompraIngressoView.console.nextLine();

    if (opcao.matches("[1-3]")) {
      switch (opcao) {
        case "1":
          validarCliente();
          break;
        case "2":
          CadastradorEventos.listarEventos();
          break;
        case "3":
          MenuPrincipal.apresentacao();
          break;
      }
    } else {
      System.out.println("Opção inválida.");
      apresentacao();
    } 
  }

  public static void validarCliente() {
    ArrayList<Cliente> clientes = CadastradorClientes.clientes;

    if (clientes.isEmpty()) {
      System.out.println("Não há clientes cadastrados.");
      MenuPrincipal.apresentacao();
    }

    String cpfCliente = Main.lerCpf();    

    for (Cliente cliente : clientes) {
      if (cliente.getCpf().equals(cpfCliente)) {
        escolherEvento();
      } else {
        System.out.println("Cliente não cadastrado.");
        MenuPrincipal.apresentacao();
      }
    }
  }

  private static void escolherEvento() {
    ArrayList<Evento> eventos = CadastradorEventos.eventos;

    if (eventos.isEmpty()) {
      System.out.println("Não há eventos disponiveis no momento.");
      MenuPrincipal.apresentacao();
    }

    String nomeDoEvento = Main.lerNomeEvento();

    for (Evento evento : eventos) {
      if(nomeDoEvento.equals(evento.getNome())){
        escolherAssento(evento);
      } else {
        System.out.println("Evento não encontrado.");
        apresentacao();
      }
    }
  }

  private static void escolherAssento(Evento evento) {
    System.out.println("Onde deseja comprar o(s) ingresso(s)?");
    System.out.println("1 - Plateia A");
    System.out.println("2 - Plateia B");
    System.out.println("3 - Calcao Nobre");
    System.out.println("4 - Camarote");
    System.out.println("5 - Galeria");
    String opcao = MenuCompraIngressoView.console.nextLine();

    if (opcao.matches("[1-5]")) {
      switch (opcao) {
        case "1":
          Agendador.reservarAssento("1", evento);
          break;
        case "2":
          Agendador.reservarAssento("2", evento);
          break;
        case "3":
          Agendador.reservarAssento("3", evento);
          break;
        case "4":
          Agendador.reservarAssento("4", evento);
          break;
        case "5":
          Agendador.reservarAssento("5", evento);
          break;
      }
    } else {
      System.out.println("Opção inválida.");
      escolherAssento(evento);
    }
  }
}
