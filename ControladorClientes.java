import java.util.ArrayList;

public class ControladorClientes {
  public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();

  public static void cadastrarCliente() {
    Cliente cliente = lerDadosCliente();
    boolean clienteExistente = false;

    for (Cliente c : clientes) {
      if (c.getCpf().equals(cliente.getCpf())) {
        clienteExistente = true;
        break;
      }
    }

    if (clienteExistente) {
      System.out.println("Já existe um cliente cadastrado com esse CPF.");
      MenuPrincipal.apresentacao();
    } else {
      clientes.add(cliente);
      System.out.println("Cliente cadastrado com sucesso!");
      MenuPrincipal.apresentacao();
    }
  }

  public static Cliente lerDadosCliente() {
    String nome = Main.lerNomeCliente();
    String cpf = Main.lerCpf();
    int ano = Main.lerAno();
    int mes = Main.lerMes();
    int dia = Main.lerDia(mes);

    return new Cliente(nome, cpf, ano, mes, dia);
  }

}
