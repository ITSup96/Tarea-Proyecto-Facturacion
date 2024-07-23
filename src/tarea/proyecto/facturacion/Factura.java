package tarea.proyecto.facturacion;

import java.util.ArrayList;

public class Factura 
{
    private int numero;
    private String fecha;
    private Cliente cliente;
    private ArrayList<Producto> producto; 
    
    Factura(int numero, String fecha, Cliente cliente)
    {
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        this.producto = new ArrayList<Producto>(); 
    }
    
    public int getNumero()
    {
        return numero;
    }
    
    public String getFecha()
    {
        return fecha;
    }
    
    public ArrayList<Producto> getProducto()
    {
        return producto;
    }
    
    public void agregarProducto(Producto producto)
    {
        this.producto.add(producto);
    }
 
    
}
