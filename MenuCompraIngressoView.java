import java.util.ArrayList;
import java.util.Scanner;

public class MenuCompraIngressoView {
  public final static Scanner console = new Scanner(System.in);
  private static ArrayList<String> opcoesCompra = new ArrayList<String>(); 
  
  public static void subMenuCompras() {
    System.out.println("Escolha uma opção:");
    System.out.println("1 - Comprar ingressos presencialmente");
    System.out.println("2 - Comprar ingressos online");
    String opcao = MenuCompraIngressoView.console.nextLine();

    if (opcao.matches("[1-2]")) {
      switch (opcao) {
        case "1":
          opcoesCompra.add("presencialmente");

          break;
        case "2":
          opcoesCompra.add("online");
          break;
      }
    } else {
      System.out.println("Opção inválida.");
      subMenuCompras();
    } 
  }

  public static void validarCliente() {
    ArrayList<Cliente> clientes = CadastradorClientes.clientes;

    if (clientes.isEmpty()) {
      System.out.println("Não há clientes cadastrados.");
      MenuPrincipal.apresentacao();
    }

    String cpfCliente = MenuPrincipalView.lerCpf();    

    for (Cliente cliente : clientes) {
      if (cliente.getCpf().equals(cpfCliente)) {
        escolherEvento();
      } else {
        System.out.println("Cliente não cadastrado.");
        MenuCompraIngresso.apresentacao();
      }
    }
  }

  private static void escolherEvento() {
    ArrayList<Evento> eventos = CadastradorEventos.eventos;

    if (eventos.isEmpty()) {
      System.out.println("Não há eventos disponiveis no momento.");
      MenuPrincipal.apresentacao();
    }

    String nomeDoEvento = MenuPrincipalView.lerNomeEvento();

    for (Evento evento : eventos) {
      if(nomeDoEvento.equals(evento.getNome())){
        escolherAssento(evento);
      } else {
        System.out.println("Evento não encontrado.");
        MenuCompraIngresso.apresentacao();
      }
    }
  }

  private static void escolherQuantidadeAssentos(){
    //proximo implement
  }

  public static void escolherAssento(Evento evento) {
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
