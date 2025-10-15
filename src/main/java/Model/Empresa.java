package Model;

import java.util.LinkedList;
import java.util.Optional;

public class Empresa {
    private String nombre;
    private String direccion;
    private String nit;

    private LinkedList<Cliente> listaClientes = new LinkedList<>();
    private LinkedList<Producto> listaProductos = new LinkedList<>();
    private LinkedList<Factura> listaFacturas = new LinkedList<>();

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
}
