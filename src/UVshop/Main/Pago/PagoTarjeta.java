package pago;


// Esta clase representa un método de pago específico: Pago con Tarjeta.
// Implementa la interfaz MetodoPago, proporcionando la lógica para procesar
// un pago con tarjeta de crédito. Esta implementación es parte del patrón
// Strategy, permitiendo que diferentes métodos de pago sean intercambiables
// sin necesidad de modificar el código que los utiliza.


public class PagoTarjeta implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta por $" + monto);
    }

    @Override
    public String getNombre() {
        return "Tarjeta";
    }
}
