package producto;

public class Producto {
    private String nombre;
    private String codigo;
    private double precioUnitario;
    private int stock;

    public Producto(String nombre, String codigo, double precioUnitario, int stock) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getStock() {
        return stock;
    }

    public void descontarStock(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
        } else {
            throw new IllegalArgumentException("Stock insuficiente para " + nombre);
        }
    }

    public void reponerStock(int cantidad) {
        stock += cantidad;
    }

    @Override
    public String toString() {
        return nombre + " (código: " + codigo + ", precio: $" + precioUnitario + ", stock: " + stock + ")";
    }
}
