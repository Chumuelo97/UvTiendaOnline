package pago;

public class PagoTransferencia implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando transferencia bancaria por $" + monto);
    }

    @Override
    public String getNombre() {
        return "Transferencia";
    }
}
