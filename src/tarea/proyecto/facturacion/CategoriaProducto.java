package tarea.proyecto.facturacion;

public class CategoriaProducto 
{
    private String nombre;
    private int pasillo;
    
       CategoriaProducto(String nombre, int pasillo)
    {
        this.nombre = nombre;
        this.pasillo = pasillo;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public int getPasillo()
    {
        return pasillo;
    }
    
}
