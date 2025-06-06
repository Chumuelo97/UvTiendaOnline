package descuento;

public class DescuentoNuevo implements DescuentoCliente {
    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.95;
    }
}
