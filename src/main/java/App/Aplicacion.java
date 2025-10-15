package App;

import Model.*;
import java.time.LocalDate;
import java.util.LinkedList;

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
        Producto p3 = new ProductoAlimenticio("A02", "Leche", 4500, 10, LocalDate.of(2026, 1, 5));

        empresa.registrarProducto(p1);
        empresa.registrarProducto(p2);
        empresa.registrarProducto(p3);

        // 🧾 Crear listas para los productos y cantidades
        LinkedList<Producto> productosFactura = new LinkedList<>();
        productosFactura.add(p1);
        productosFactura.add(p3);
        productosFactura.add(p2);

        LinkedList<Integer> cantidades = new LinkedList<>();
        cantidades.add(3); // Pan x3
        cantidades.add(2); // Leche x2
        cantidades.add(1); // Licuadora x1

        // ✅ Usar la función crearFactura() que ya está en Empresa
        Factura factura = empresa.crearFactura(LocalDate.now(), c1, productosFactura, cantidades);

        // Registrar la factura en la empresa
        empresa.registrarFactura(factura);

        // Mostrar la factura generada
        factura.mostrarFactura();
    }
}
