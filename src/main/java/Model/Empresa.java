package Model;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Empresa {
    private String nombre;
    private String direccion;
    private String nit;

    private LinkedList<Cliente> listaClientes = new LinkedList<>();
    private LinkedList<Producto> listaProductos = new LinkedList<>();
    private LinkedList<Factura> listaFacturas = new LinkedList<>();

    private int contadorFacturas = 1; // contador para numerar las facturas automáticamente

    public Empresa(String nombre, String direccion, String nit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;
    }

    // Métodos para clientes
    public void registrarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public Optional<Cliente> buscarCliente(String cedula) {
        return listaClientes.stream().filter(c -> c.getCedula().equals(cedula)).findFirst();
    }

    // Métodos para productos
    public void registrarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    // Método para registrar factura
    public void registrarFactura(Factura factura) {
        listaFacturas.add(factura);
    }


    public Factura crearFactura(LocalDate x, Cliente cliente, List<Producto> productos, List<Integer> cantidades) {
        Factura factura = new Factura(contadorFacturas, x, cliente);


        for (int i = 0; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            int cantidad = cantidades.get(i);
            DetalleFactura detalle = new DetalleFactura(producto, cantidad);
            factura.agregarDetalle(detalle);
        }

        contadorFacturas++;
        listaFacturas.add(factura);

        // Calcular el total y mostrar resumen
        double totalConDescuento = factura.calcularTotal();
        System.out.println("Factura #" + factura.getCodigo()+ " creada correctamente");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Total a pagar (con descuento): $" + totalConDescuento);
        System.out.println("-------------------------------------");

        return factura;
    }

    public LinkedList<Factura> getListaFacturas() {
        return listaFacturas;
    }
}

