package producto;

public class ItemPedido {
    private Producto producto;
    private int cantidad;

    public ItemPedido(Producto producto, int cantidad) {
        if (cantidad <= 0) throw new IllegalArgumentException("Cantidad inválida");
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getSubtotal() {
        return producto.getPrecioUnitario() * cantidad;
    }

    public void aplicarDescuentoPorcentaje(double porcentaje) {
        double nuevoPrecio = producto.getPrecioUnitario() * (1 - porcentaje / 100);
        producto = new Producto(
            producto.getNombre(),
            producto.getCodigo(),
            nuevoPrecio,
            producto.getStock()
        );
    }

    @Override
    public String toString() {
        return cantidad + " x " + producto.getNombre() + " = $" + getSubtotal();
    }
}
