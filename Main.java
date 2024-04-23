public class Main {
  public static void main(String[] args) {
    try {
      MenuPrincipal.apresentacao();
    } catch (Exception e) {
      System.out.println("Tomou uma exeção de: " + e.getMessage());
    }
  }
}
