package Model;

public class Producto {
    protected String codigo;
    protected String nombre;
    protected double precioUnitario;
    protected int cantidad;

    public Producto(String codigo, String nombre, double precioUnitario, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public String getNombre() {
        return nombre;
    }
}
