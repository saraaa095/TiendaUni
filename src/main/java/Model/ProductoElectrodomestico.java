package Model;

public class ProductoElectrodomestico extends Producto {
    private int garantia;

    public ProductoElectrodomestico(String codigo, String nombre, double precioUnitario, int cantidad, int garantia) {
        super(codigo, nombre, precioUnitario, cantidad);
        this.garantia = garantia;
    }
}