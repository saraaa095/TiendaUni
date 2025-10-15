package App;

import Model.*;
import java.time.LocalDate;

public class Aplicacion {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Comercializadora UQ", "Armenia", "900123-5");

        // Registrar clientes
        Cliente c1 = new ClienteFrecuente("Sara López", "123", "Armenia", 200);
        Cliente c2 = new ClienteCoorporativo("Comercial Andina", "456", "Calarcá", "90012-7", 0.10);
        empresa.registrarCliente(c1);
        empresa.registrarCliente(c2);

        // Registrar productos
        Producto p1 = new ProductoAlimenticio("A01", "Pan", 2000, 5, LocalDate.of(2025, 12, 15));
        Producto p2 = new ProductoElectrodomestico("E01", "Licuadora", 150000, 1, 12);
        empresa.registrarProducto(p1);
        empresa.registrarProducto(p2);

        // Crear factura
        Factura factura = new Factura("F001", LocalDate.now(), c1);
        factura.agregarDetalle(new DetalleFactura(p1, 2));
        factura.agregarDetalle(new DetalleFactura(p2, 1));

        empresa.registrarFactura(factura);

        // Mostrar factura
        factura.mostrarFactura();
    }
}
