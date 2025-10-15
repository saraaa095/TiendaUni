package Model;

public class DetalleFactura {
    private Producto producto;
    private int cantidad;
    private double subTotal;

    public DetalleFactura(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.subTotal = producto.getPrecioUnitario() * cantidad;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public Producto getProducto() {
        return producto;
    }
    public int getCantidad() {
        return cantidad;
    }

}
