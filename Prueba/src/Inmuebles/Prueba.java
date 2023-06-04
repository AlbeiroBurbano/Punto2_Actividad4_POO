
package Inmuebles;
import java.util.Scanner;
public class Prueba {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese identificador inmobiliario: ");
        int id = input.nextInt();
        System.out.println("Ingrese el area: ");
        int areaa = input.nextInt();
        System.out.println("Ingrese la dirección ");
        String direct = input.next();
        
        System.out.println("Presione el numero correspondiente al inmueble a modelar");
        System.out.println("Casa rural ----------------> 1");
        System.out.println("Casa en conjunto cerrado --> 2");
        System.out.println("Casa independiente---------> 3");
        System.out.println("Apartaestudio--------------> 4");
        System.out.println("Apartamento familiar ------> 5");
        System.out.println("Local comerciar -----------> 6");
        System.out.println("Oficina -------------------> 7");
        
        boolean desi;
        boolean desi2;
        int opcion = input.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingresa el numero de habitaciones: ");
                int numeroHabitaciones0 = input.nextInt();
                System.out.println("Ingresa el numero de banos: ");
                int numeroBanos0 = input.nextInt();
                System.out.println("Ingresa el numero de pisos: ");
                int numeroPisos0 = input.nextInt();
                System.out.println("Ingresa la distancia: ");
                int distanciaCabera = input.nextInt();
                System.out.println("Ingresa la altitud: ");
                int altitud = input.nextInt();
                System.out.println("Datos de casa");

                CasaRural casaR = new  CasaRural(id,areaa, direct,  numeroHabitaciones0, numeroBanos0,numeroPisos0,distanciaCabera, altitud);
                casaR.calcularPrecioVenta(casaR.valorArea);
                casaR.imprimir();

                break;
            case 2:
                System.out.println("Ingresa el numero de habitaciones: ");
                int numeroHabitaciones1 = input.nextInt();
                System.out.println("Ingresa el numero de banos: ");
                int numeroBanos1 = input.nextInt();
                System.out.println("Ingresa el numero de pisos: ");
                int numeroPisos1 = input.nextInt();
                System.out.println("Ingresa el valor de la administracion : ");
                int valorAdministracion5 = input.nextInt();

                System.out.println("¿Tiene piscina? ");
                System.out.println("Si--> 1");
                System.out.println("No--> 0");
                int pis = input.nextInt();
                if (pis==1){
                    desi = true;
                }else{
                    desi = false;
                }
                System.out.println("¿Tiene campos deportivos? ");
                System.out.println("Si--> 1");
                System.out.println("No--> 0");
                int deport = input.nextInt();
                if (deport==1){
                    desi2 = true;
                }else{
                    desi2 = false;
                }

                System.out.println("Datos de casa");
                CasaConjuntoCerrado CasaCon =  new  CasaConjuntoCerrado(id, areaa,direct, numeroHabitaciones1,numeroBanos1,numeroPisos1,valorAdministracion5,desi, desi2);
                CasaCon.calcularPrecioVenta(CasaCon.valorArea);
                CasaCon.imprimir();
                break;
            case 3:

                System.out.println("Ingresa el numero de habitaciones: ");
                int numeroHabitaciones = input.nextInt();
                System.out.println("Ingresa el numero de banos: ");
                int numeroBanos = input.nextInt();
                System.out.println("Ingresa el numero de pisos: ");
                int numeroPisos = input.nextInt();

                System.out.println("Datos de la casa");
                CasaIndependiente casaIn = new  CasaIndependiente(id, areaa, direct,  numeroHabitaciones, numeroBanos, numeroPisos);
                casaIn.calcularPrecioVenta(casaIn.valorArea);
                casaIn.imprimir();
                break;
            case 4:
         
                        System.out.println("Datos apartaestudioo");
                        Apartaestudio aptestudio1 = new Apartaestudio(id,areaa,direct,1,1);
                        aptestudio1.calcularPrecioVenta(aptestudio1.valorArea);
                        aptestudio1.imprimir();
                break;
            case 5:
                    System.out.println("Ingresa el numero de habitaciones: ");
                    int habitaciones = input.nextInt();
                    System.out.println("Ingresa el numero de banos: ");
                    int banos = input.nextInt();
                    System.out.println("Ingresa el valor de la administracion: ");
                    int valorad = input.nextInt();
                    ApartamentoFamiliar apto1 = new ApartamentoFamiliar(id,areaa,direct,habitaciones,banos,valorad);
                    System.out.println("Datos apartamento");
                    apto1.calcularPrecioVenta(apto1.valorArea);
                    apto1.imprimir();
                break;

            case 6:

                System.out.println("Ingresa el centro comercial: ");
                String centroC = input.next();
                LocalComercial localC = new LocalComercial(id, areaa, direct, centroC);
                System.out.println("Datos del local");
                localC.calcularPrecioVenta(localC.valorArea);
                localC.imprimir();

                break;
            case 7:

                System.out.println("Es de gobierno? ");
                System.out.println("Si--> 1");
                System.out.println("No--> 0");
                int gobierno = input.nextInt();
                if (gobierno==1){
                    desi = true;
                }else{
                    desi = false;
                }
                Oficina office = new Oficina(id,areaa, direct,desi);
                System.out.println("Datos de local");
                office.calcularPrecioVenta(office.valorArea);
                office.imprimir();
                break;
            default:
                System.out.println("Opcion no válida");
                break;
        }
    
}

    }
    

