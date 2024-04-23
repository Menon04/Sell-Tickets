import java.util.ArrayList;
import java.util.Scanner;

public class MenuCompraIngressoView {
  public final static Scanner console = new Scanner(System.in);

  public static void validarCliente() {
    ArrayList<Cliente> clientes = CadastradorClientes.clientes;

    if (clientes.isEmpty()) {
      System.out.println("Não há clientes cadastrados.");
      MenuPrincipal.apresentacao();
    }

    String cpfCliente = MenuPrincipalView.lerCpf();    

    for (Cliente cliente : clientes) {
      if (cliente.getCpf().equals(cpfCliente)) {
        escolherEvento(CadastradorIngressos.criarIngresso(cliente));
      } else {
        System.out.println("Cliente não cadastrado.");
        MenuCompraIngresso.apresentacao();
      }
    }
  }

  private static void escolherEvento(Ingresso ingresso) {
    ArrayList<Evento> eventos = CadastradorEventos.eventos;

    if (eventos.isEmpty()) {
      System.out.println("Não há eventos disponiveis no momento.");
      MenuPrincipal.apresentacao();
    }

    String nomeDoEvento = MenuPrincipalView.lerNomeEvento();

    for (Evento evento : eventos) {
      if(nomeDoEvento.equals(evento.getNome())){
        escolherQuantidadeAssentos(CadastradorIngressos.adicionarEvento(evento, ingresso));
      } else {
        System.out.println("Evento não encontrado.");
        MenuCompraIngresso.apresentacao();
      }
    }
  }

  private static void escolherQuantidadeAssentos(Ingresso ingresso){
    if (ingresso.getEvento().getCapacidade() < 1) {
      System.out.println("Não é possivel reservar mais assentos para esse evento");
      MenuCompraIngresso.apresentacao();
    }

    System.out.println("Quantos assentos deseja comprar: ");
    String quantidadeStr = console.nextLine();

    while(!(quantidadeStr.matches("\\d+")) || Integer.parseInt(quantidadeStr) < 1) {
      System.out.println("Quantidade inválida! Digite novamente.");
      quantidadeStr = console.next();
    } 

    escolherPosicaoAssento(CadastradorIngressos.adicionarQuantidadeAssentos(ingresso, Integer.parseInt(quantidadeStr)));
  }

  public static void escolherPosicaoAssento(Ingresso ingresso) {
    System.out.println("Onde deseja comprar o(s) ingresso(s)?");
    System.out.println("1 - Plateia A");
    System.out.println("2 - Plateia B");
    System.out.println("3 - Balcao Nobre");
    System.out.println("4 - Camarote");
    System.out.println("5 - Galeria");
    String opcao = MenuCompraIngressoView.console.nextLine();

    if (opcao.matches("[1-5]")) {
      switch (opcao) {
        case "1":
          Agendador.reservarAssento(TipoAssento.PLATEIA_A, ingresso);
          MenuPrincipalView.deplay();
          break;
        case "2":
          Agendador.reservarAssento(TipoAssento.PLATEIA_B, ingresso);
          MenuPrincipalView.deplay();
          break;
        case "3":
          Agendador.reservarAssento(TipoAssento.BALCAO_NOBRE, ingresso);
          MenuPrincipalView.deplay();
          break;
        case "4":
          Agendador.reservarAssento(TipoAssento.CAMAROTE, ingresso);
          MenuPrincipalView.deplay();
          break;
        case "5":
          Agendador.reservarAssento(TipoAssento.GALERIA, ingresso);
          MenuPrincipalView.deplay();
          break;
      }
    } else {
      System.out.println("Opção inválida.");
      escolherPosicaoAssento(ingresso);
    }
  }
}
