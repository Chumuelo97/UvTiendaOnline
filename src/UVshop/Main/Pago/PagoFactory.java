package pago;
import java.util.HashMap;
import java.util.Map;


// Esta clase es responsable de gestionar los métodos de pago disponibles en la aplicación.
// Utiliza el patrón Factory Method para encapsular la lógica de creación y registro de métodos de pago,
// permitiendo que diferentes implementaciones de métodos de pago (como tarjeta de crédito, transferencia,
// criptomonedas, etc.) se integren fácilmente en el sistema. Cada método de pago tiene su propia implementación,
// lo que permite que sean intercambiables sin necesidad de modificar el código que los utiliza.


public class PagoFactory {
    private static final Map<String, MetodoPago> metodos = new HashMap<>();

    static {
        registrarMetodo(new PagoTarjeta());
        registrarMetodo(new PagoTransferencia());
        registrarMetodo(new PagoCripto());
        registrarMetodo(new PagoContraEntrega());
    }

    public static void registrarMetodo(MetodoPago metodo) {
        metodos.put(metodo.getNombre().toUpperCase(), metodo);
    }

    public static MetodoPago obtenerMetodo(String nombre) {
        MetodoPago metodo = metodos.get(nombre.toUpperCase());
        if (metodo == null) {
            throw new IllegalArgumentException("Método de pago no registrado: " + nombre);
        }
        return metodo;
    }

    public static Map<String, MetodoPago> listarMetodos() {
        return metodos;
    }
}
