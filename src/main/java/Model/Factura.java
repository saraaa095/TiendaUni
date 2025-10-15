package Model;

import java.time.LocalDate;
import java.util.LinkedList;

public class Factura {
    private String codigo;
    private LocalDate fecha;
    private Cliente cliente;
    private LinkedList<DetalleFactura> listaDetallesFactura = new LinkedList<>();

    public Factura(String codigo, LocalDate fecha, Cliente cliente) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public void agregarDetalle(DetalleFactura detalle) {
        listaDetallesFactura.add(detalle);
    }

    public double calcularTotal() {
        double subtotal = listaDetallesFactura.stream()
                .mapToDouble(DetalleFactura::getSubTotal)
                .sum();

        double descuento = subtotal * cliente.calcularDescuento();
        return subtotal - descuento;
    }

    public void mostrarFactura() {
        System.out.println("\nFactura N°: " + codigo + " | Fecha: " + fecha);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Detalles:");
        listaDetallesFactura.forEach(d ->
                System.out.println(" - " + d.getProducto().getNombre() + " x" + d.getProducto().cantidad + ": $" + d.getSubTotal())
        );
        System.out.println("Total a pagar: $" + calcularTotal());
    }
}
