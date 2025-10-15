package Model;

import java.time.LocalDate;

public class ProductoAlimenticio extends Producto {
    private LocalDate fechaVencimiento;

    public ProductoAlimenticio(String codigo, String nombre, double precioUnitario, int cantidad, LocalDate fechaVencimiento) {
        super(codigo, nombre, precioUnitario, cantidad);
        this.fechaVencimiento = fechaVencimiento;
    }
}
