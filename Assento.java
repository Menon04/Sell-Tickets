public class Assento {
  private int plateiaA = 572;
  private int plateiaB = 660;
  private int balcaoNobre = 269;
  private int camarotes = 120;
  private int galeria = 130;
  
  public int getPlateiaA() {
    return this.plateiaA;
  }

  public int getPlateiaB() {
    return this.plateiaB;
  }

  public int getBalcaoNobre() {
    return this.balcaoNobre;
  }

  public int getCamarotes() {
    return this.camarotes;
  }

  public int getGaleria() {
    return this.galeria;
  }

  public void baixaAssentoA(int quantidade) {
    this.plateiaA -= quantidade;
  }

  public void baixaAssentoB(int quantidade) {
    this.plateiaB -= quantidade;
  }

  public void baixaBalcaoNobre(int quantidade) {
    this.balcaoNobre -= quantidade;
  }

  public void baixaCamarotes(int quantidade) {
    this.camarotes -= quantidade;
  }

  public void baixaGaleria(int quantidade) {
    this.galeria -= quantidade;
  }

} 
