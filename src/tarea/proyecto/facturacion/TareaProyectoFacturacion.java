package tarea.proyecto.facturacion;

import java.util.ArrayList;

public class TareaProyectoFacturacion 
{
    
    public static void main(String[] args) 
    {
        Cliente cliente1 = new Cliente("Hunty", "0501-1997-08401", "Col. Jardines", "9573-0768");
        
        Factura factura1 = new Factura(123456789, "12-17-2024", cliente1);
        
        try
        {
            CategoriaProducto refrescos = new CategoriaProducto("Refrescos", 15);
            CategoriaProducto frutas = new CategoriaProducto("Frutas", 3);
            
            Producto producto1 = new Producto("CocaCol", 18, refrescos, 1);
            Producto producto2 = new Producto("Manzana.", 5, frutas, 8);
            Producto producto3 = new Producto("TeLipto", 20, refrescos, 3);
            
            factura1.agregarProducto(producto1);
            factura1.agregarProducto(producto2);
            factura1.agregarProducto(producto3);
            
            pagarFactura(factura1);
        }
        catch(Exception Error)
        {
            System.out.println("Error. " + Error.getMessage());
        }

    }
            
    static double pagarFactura(Factura factura)
    {
        ArrayList<Producto> producto = factura.getProducto();
        
        System.out.println("=========== F A C T U R A ===========");
        System.out.println("PRODUCTO   PRECIO   CANTIDAD   TOTAL");
        
        double total = 0;
        
        for (int i = 0; i < producto.size(); i++)
        {
           total += producto.get(i).getPrecio() * producto.get(i).getCantidad();
           System.out.println(producto.get(i).getNombre() + "....." + producto.get(i).getPrecio() + "......." + producto.get(i).getCantidad() + "........" + producto.get(i).getPrecio() * producto.get(i).getCantidad());
        }
        
        System.out.println("");
        System.out.println("Total a pagar es: " + total);
        
        return total;
        
    } 
    
    
}
