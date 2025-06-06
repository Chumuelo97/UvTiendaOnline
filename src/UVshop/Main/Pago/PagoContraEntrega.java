package pago;

public class PagoContraEntrega implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago contra entrega por $" + monto + ". Se pagará al recibir.");
    }

    @Override
    public String getNombre() {
        return "Pago contra entrega";
    }
}
