public class Assento {
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

} 
