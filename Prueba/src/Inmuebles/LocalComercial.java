
package Inmuebles;

public class LocalComercial extends Local  {
    protected static double valorArea = 3000000;
    protected String centroComercial;
    
 public LocalComercial(int identificadorInmobiliario, int area, String direccion, String centroComercial) {
    super(identificadorInmobiliario, area, direccion);
    this.centroComercial = centroComercial;
    }
 public void imprimir() {
    super.imprimir();
    System.out.println("Centro comercial = " + centroComercial);
    System.out.println();
    }
}
