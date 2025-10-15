package Model;

public class Cliente {
    protected String nombre;
    protected String cedula;
    protected String direccion;

    public Cliente(String nombre, String cedula, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
    }

    public double calcularDescuento() {
        return 0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }
}

