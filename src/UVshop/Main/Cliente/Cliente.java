package cliente;

public class Cliente {
    private String nombre;
    private String email;
    private String direccion;
    private TipoCliente tipo;

    public Cliente(String nombre, String email, String direccion, TipoCliente tipo) {
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return nombre + " (" + tipo + ")";
    }
}

