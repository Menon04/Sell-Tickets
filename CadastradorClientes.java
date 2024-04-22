import java.util.ArrayList;

public class CadastradorClientes {
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
    } else {
      clientes.add(cliente);
      System.out.println("Cliente cadastrado com sucesso!");
    }
  }

  public static Cliente lerDadosCliente() {
    String nome = MenuPrincipalView.lerNomeCliente();
    String cpf = MenuPrincipalView.lerCpf();
    int ano = MenuPrincipalView.lerAno();
    int mes = MenuPrincipalView.lerMes();
    int dia = MenuPrincipalView.lerDia(mes);

    return new Cliente(nome, cpf, ano, mes, dia);
  }
}
