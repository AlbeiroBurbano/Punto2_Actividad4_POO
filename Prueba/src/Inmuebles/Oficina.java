
package Inmuebles;

public class Oficina extends Local  {
    protected static double valorArea = 3500000;
    protected boolean esGobierno;
    
  public Oficina(int identificadorInmobiliario, int area, String direccion, boolean esGobierno) {
    super(identificadorInmobiliario, area, direccion);
    this.esGobierno = esGobierno;
    }
  public void imprimir() {
    super.imprimir(); 
    System.out.println("Es oficina gubernamental = " + esGobierno);
    System.out.println();
  }
}
