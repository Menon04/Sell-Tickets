import java.util.ArrayList;

public class PagamentoView {

  public static void subMenuCompras(double valor, int quantidade) {
    System.out.println("Escolha uma opção:");
    System.out.println("1 - Comprar ingressos presencialmente");
    System.out.println("2 - Comprar ingressos online");
    String opcao = MenuCompraIngressoView.console.nextLine();

    if (opcao.matches("[1-2]")) {
      switch (opcao) {
        case "1":
          descontoQuantidade(valor, quantidade);
          break;
        case "2":
          valor += 0.01 * valor;
          descontoQuantidade(valor, quantidade);
          break;
      }
    } else {
      System.out.println("Opção inválida.");
      subMenuCompras(valor, quantidade);
    } 
  }

  public static void descontoQuantidade(double valor, int quantidade) {
    
  }
}
