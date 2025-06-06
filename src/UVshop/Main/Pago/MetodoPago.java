package pago;


//// Esta interfaz define el contrato para los métodos de pago en la aplicación.
// // Permite que diferentes implementaciones de métodos de pago (como tarjeta de crédito,
// // PayPal, etc.) se integren fácilmente en el sistema. Cada implementación debe
// // proporcionar su propia lógica para procesar el pago y devolver el nombre del método de pago.


public interface MetodoPago {
    void procesarPago(double monto);
    String getNombre();
}
