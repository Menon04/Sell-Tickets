import java.util.ArrayList;

public class Agendador {
  private static ArrayList<Evento> eventos = ControladorEventos.eventos;
  private static ArrayList<Cliente> clientes = ControladorClientes.clientes;
  
  public static void comprarIngresso() {
    if (clientes.isEmpty()) {
      System.out.println("Não há clientes cadastrados.");
      Main.apresentacao();
    }
    String cpfCliente = Main.lerCpf();    

    for (Cliente cliente : clientes) {
      if (cliente.getCpf().equals(cpfCliente)) {
        opcoesDeCompra();
      } else {
        System.out.println("Cliente não cadastrado.");
        Main.apresentacao();
      }
    }
    
  }

  private static void opcoesDeCompra() {
    String nomeEvento = "";

    // uma bosta isso aqui
    /* System.out.println("Para qual evento deseja comprar ingresso(s): ");
    if (ControladorEventos.listarEventos()) {
      return nomeEvento = Main.console.nextLine();
    } else {
      System.out.println("Não há eventos disponíveis no momento.");
      Main.apresentacao();
    }
    */
  }
}