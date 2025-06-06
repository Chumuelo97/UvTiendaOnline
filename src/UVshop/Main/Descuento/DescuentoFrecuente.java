package descuento;

public class DescuentoFrecuente implements DescuentoCliente {
    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.90;
    }
}
