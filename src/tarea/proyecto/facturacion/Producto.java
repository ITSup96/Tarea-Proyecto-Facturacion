package tarea.proyecto.facturacion;

public class Producto 
{
    private String nombre;
    private double precio;
    private CategoriaProducto categoria;
    private int cantidad;
    
    Producto(String nombre, double precio, CategoriaProducto categoria, int cantidad) throws Exception
    {
        if(precio < 0)
        {
            throw new Exception("El precio de " + nombre + " no puede ser menor a 0.");
        }
        
          if(cantidad <= 0)
        {
            throw new Exception("La cantidad de "+ nombre + " debe ser mayor a 0.");
        }
          
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.cantidad = cantidad;
        
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public double getPrecio()
    {
        return precio;
    }
    
    public CategoriaProducto getCategoria()
    {
        return categoria;
    }
    
    public int getCantidad()
    {
        return cantidad;
    }
    

}
