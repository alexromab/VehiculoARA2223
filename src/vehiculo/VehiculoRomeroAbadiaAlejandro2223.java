
package vehiculo;

/**
 * Clase <strong>Vehículo</strong> para la Tarea 4 de Entornos de Desarrollo.
 * 
 * 
 * @author Alejandro Romero Abadía
 */
public class VehiculoRomeroAbadiaAlejandro2223 {

    /**
     * Obtiene el nombre del vehículo.
     * 
     * @return Nombre del vehículo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nombre para el vehículo.
     * 
     * @param nombre Nombre del vehículo que se va a asignar.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el precio del vehículo.
     * 
     * @return Precio del vehículo.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio.
     * 
     * @param precio Precio que se va a asignar al vehículo.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el precio con IVA.
     * 
     * @return Precio con IVA.
     */
    public double getPrecioIVA() {
        return precioIVA;
    }

    /**
     * Establece el precio con IVA.
     * 
     * @param precioIVA Precio con IVA que se va a asignar al vehículo.
     */
    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }

    /**
     * Obtiene la cantidad de vehículos disponible.
     * 
     * @return Stock de vehículos.
     */
    public int getStock() {
        return stock;
    }

    /**
     * Establece la cantidad de vehículo a almacenar.
     * 
     * @param stock Cantidad de vehículos.
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    private String nombre;          // Nombre del vehículo.
    private double precio;          // Precio del vehículo.
    private double precioIVA;       // Precio con IVA del vehículo.
    private int stock;              // Cantidad almacenada de vehículos.

    /* Constructor sin argumentos */
    /**
     * Constructor sin argumentos.
     * Crea un nuevo objeto Vehículo con los valores por defecto.
     * 
     */
    public VehiculoRomeroAbadiaAlejandro2223 ()
    {
    }
    // Constructor con parámetro para iniciar todas las propiedades de la clase
    
    /**
     * Constructor con argumentos.
     * Inicializa un objeto de tipo Vehículo con los parámetros indicados.
     * 
     * @param nom Nombre del vehículo.
     * @param precio Precio del vehículo.
     * @param stock Cantidad de vehículos a almacenar.
     */
    public VehiculoRomeroAbadiaAlejandro2223 (String nom, double precio, int stock)
    {
        this.nombre =nom;
        this.precio=precio;
        this.stock=stock;
    }
   // Método para asignar el nombre del vehiculo
    /**
     * Método que asigna el nombre del vehículo.
     * 
     * @param nom Nombre del vehículo.
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    // Método que me devuelve el nombre del vehiculo
    /**
     * Método para obtener el nombre del vehículo.
     * 
     * @return Nombre del vehículo.
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    // Método que me devuelve el stock de vehiculos disponible en cada momento
    /**
     * Método para obtener el stock del vehículo almacenado.
     * 
     * @return Cantidad de vehículos almacenados.
     */
     public int obtenerStock ()
    {
        return getStock();
    }

    /* Método para comprar vehiculos. Modifica el stock.
     * Este método va a ser probado con Junit
     */
     /**
      * Método para comprar vehículos según una cantidad.
      * Modifica la cantidad de vehículos disponibles.
      * 
      * @param cantidad Cantidad de vehículo a comprar.
      * @throws Exception No es posible comprar un número negativo de vehículos.
      */
    public void comprar(int cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de vehiculos");
        setStock(getStock() + cantidad);
    }

    /**
     * Método para vender vehículos según una cantidad.
     * 
     * @param cantidad Vehículos a vender.
     * @throws Exception No es posible vender una cantidad negativa de vehículos. Tampoco permite vender si la cantidad es mayor que el stock.
     */
    public void vender (int cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede vender una cantidad negativa de vehiculos");
        if (obtenerStock()< cantidad)
            throw new Exception ("No se hay suficientes vehiculos para vender");
        setStock(getStock() - cantidad);
    }
    
}  
   
    

