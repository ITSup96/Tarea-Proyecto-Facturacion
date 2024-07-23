package tarea.proyecto.facturacion;

public class Cliente 
{
    private String nombre;
    private String rtn;
    private String direccion;
    private String telefono;
    
    Cliente(String nombre, String rtn, String direccion, String telefono)
    {
        this.nombre = nombre;
        this.rtn = rtn;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public String getRtn()
    {
        return rtn;
    }
    
    public String getDireccion()
    {
        return direccion;
    }
    
    public String getTelefono()
    {
        return telefono;
    }
    
}
