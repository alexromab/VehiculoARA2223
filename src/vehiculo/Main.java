
package vehiculo;

/**
 *
 * @author Alejandro Romero Abadía
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoRomeroAbadiaAlejandro2223 miVehiculoRomeroAbadiaAlejandro2223;  // Creación del objeto.
        int stockActual;    // Variable de tipo entero para almacenar el stock de vehículos actual.
        
        miVehiculoRomeroAbadiaAlejandro2223 = new VehiculoRomeroAbadiaAlejandro2223("Seat",18000,100);      // Instanciación del objeto.
        operativaVehiculosRomeroAbadiaAlejandro2223(miVehiculoRomeroAbadiaAlejandro2223, 50);               // 
    }

      /**
       * Método con el que se va a operar el objeto.
       * Procesa las ventas y compras de los vehículos además de comprobar el stock actual.
       * 
       * @param miVehiculoRomeroAbadiaAlejandro2223 Parámetro de tipo VehiculoRomeroAbadiaAlejandro2223.
       * @param cantidad Cantidad de vehículos con el que se va a operar.
       */
    private static void operativaVehiculosRomeroAbadiaAlejandro2223(VehiculoRomeroAbadiaAlejandro2223 miVehiculoRomeroAbadiaAlejandro2223, java.lang.Integer cantidad) {
        int stockActual;    // Variable de tipo entero para almacenar el stock de vehículos actual.
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoRomeroAbadiaAlejandro2223.vender(20);     // Se venden 20 vehículos.
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoRomeroAbadiaAlejandro2223.comprar(100);   // Se compran 100 vehículos.
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoRomeroAbadiaAlejandro2223.obtenerStock();   // Se obtiene el stock actual de vehículos.
        System.out.println("El stock actual es"+ stockActual );
    }

}
    
