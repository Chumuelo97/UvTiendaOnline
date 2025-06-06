package descuento;

public class DescuentoVIP implements DescuentoCliente {
    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.85;
    }
}
