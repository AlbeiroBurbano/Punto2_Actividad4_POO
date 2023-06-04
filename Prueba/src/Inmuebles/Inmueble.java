
package Inmuebles;

public class Inmueble {
    
        protected int identificadorInmobiliario;
        protected int área; 
        protected String dirección; 
        protected double precioVenta;  
     public Inmueble(int identificadorInmobiliario, int área, String dirección) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.área = área;
        this.dirección = dirección;
  
  }
     
    public double calcularPrecioVenta(double valorArea) {
            precioVenta = área * valorArea;
            return precioVenta;
}
    public  void imprimir() {
        System.out.println("Identificador inmobiliario = " +identificadorInmobiliario);
        System.out.println("Area = " + área);
        System.out.println("Direccion = " + dirección);
        System.out.println("Precio de venta = $”"+ precioVenta);
        }
}
