package Model;

public class ClienteCoorporativo extends Cliente {
    private String nit;
    private double descuentoEspecial;

    public ClienteCoorporativo(String nombre, String cedula, String direccion, String nit, double descuentoEspecial) {
        super(nombre, cedula, direccion);
        this.nit = nit;
        this.descuentoEspecial = descuentoEspecial;
    }

    @Override
    public double calcularDescuento() {
        return descuentoEspecial;
    }
}
