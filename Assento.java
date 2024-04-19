public abstract class Assento {
  private int[] plateiaA = new int[572];
  private int[] plateiaB = new int[660];
  private int[] balcaoNobre = new int[269];
  private int[] camarotes = new int[120];
  private int[] galeria = new int[130];
  private int totalAssentos = plateiaA.length + plateiaB.length + balcaoNobre.length + camarotes.length + galeria.length;
  
  public int[] getPlateiaA() {
    return this.plateiaA;
  }

  public int[] getPlateiaB() {
    return this.plateiaB;
  }

  public int[] getBalcaoNobre() {
    return this.balcaoNobre;
  }

  public int[] getCamarotes() {
    return this.camarotes;
  }

  public int[] getGaleria() {
    return this.galeria;
  }

  public int getTotalAssentos() {
    return this.totalAssentos;
  }

  public static void informacoesAssentos() {
    System.out.println("Informe qual seção de assentos você gostaria de saber mais: ");
    System.out.println("1 - Plateia");
    System.out.println("2 - Balcão Nobre");
    System.out.println("3 - Camarote");
    System.out.println("4 - Galeria");
    System.out.println("5 - Voltar ao menu principal");
    String opcao = Main.console.next();

    if (opcao.matches("[1-5]")) {
      switch (opcao) {
        case "1":
          System.out.println("Temos a plateia sendo dividida entre Plateia A e Plateia B: ");
          System.out.println("A Plateia A contém 572 cadeiras totais, sendo 200 cadeiras localizadas ao centro, 186 ao lado direito e 186 ao esquerdo");
          System.out.println("Na Plateia B, temos mais cadeiras: 660, sendo distribuídas entre 200 ao centro, 230 ao lado direito e 230 ao lado esquerdo.\n");
          informacoesAssentos();
          break;
        case "2":
          System.out.println("O Balcão Nobre contém 269 cadeiras ao todo, sendo 123 cadeiras ao centro, 73 ao lado direito e 73 ao lado esquerdo.\n");
          informacoesAssentos();
          break;
        case "3":
          System.out.println("O Camarote possui poucas cadeiras, sendo 120 ao total, trazendo mais conforto e exclusividade. São 10 camarotes ímpares (contendo 6 cadeiras cada uma), tanto do lado direito quanto do lado esquerdo.\n");
          informacoesAssentos();
          break;
        case "4":
          System.out.println("Na Galeria, possuímos 130 cadeiras.\n");
          informacoesAssentos();
          break;
        case "5":
          Main.apresentacao();
          break;
      }
    } else {
      informacoesAssentos();
    }
  }

} 
