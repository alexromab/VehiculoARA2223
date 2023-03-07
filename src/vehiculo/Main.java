
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoRomeroAbadiaAlejandro2223 miVehiculoRomeroAbadiaAlejandro2223;
        int stockActual;
        
        miVehiculoRomeroAbadiaAlejandro2223 = new VehiculoRomeroAbadiaAlejandro2223("Seat",18000,100);
        operativaVehiculosRomeroAbadiaAlejandro2223(miVehiculoRomeroAbadiaAlejandro2223, 50); 
    }

    private static void operativaVehiculosRomeroAbadiaAlejandro2223(VehiculoRomeroAbadiaAlejandro2223 miVehiculoRomeroAbadiaAlejandro2223, java.lang.Integer cantidad) {
        int stockActual;
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoRomeroAbadiaAlejandro2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoRomeroAbadiaAlejandro2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoRomeroAbadiaAlejandro2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

}
    
