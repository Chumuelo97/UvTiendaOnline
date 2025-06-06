package pago;

public class PagoCripto implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago realizado en criptomoneda equivalente a $" + monto);
    }

    @Override
    public String getNombre() {
        return "Criptomoneda";
    }
}
