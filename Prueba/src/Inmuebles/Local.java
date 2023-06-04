
package Inmuebles;

public class Local extends Inmueble {
    enum tipo {INTERNO,CALLE};
protected tipo tipoLocal; 

    public Local(int identificadorInmobiliario, int area, String direccion) {

    super(identificadorInmobiliario, area, direccion);
    this.tipoLocal = tipoLocal;
    }

   public void imprimir() {
    super.imprimir();


}
}
