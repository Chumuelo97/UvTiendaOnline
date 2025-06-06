
package descuento;

// Esta clase es responsable de crear instancias de las estrategias de descuento
// según el tipo de cliente. Utiliza el patrón Factory Method para encapsular
// la lógica de creación de objetos y permitir la extensión futura sin modificar
// el código existente.
// Cada tipo de cliente tiene su propia estrategia de descuento, lo que permite
// aplicar diferentes lógicas de descuento sin necesidad de cambiar el código
// de la aplicación principal.



import cliente.TipoCliente;

public class DescuentoClienteFactory {
    public static DescuentoCliente obtenerEstrategiaDescuento(TipoCliente tipo) {
        return switch (tipo) {
            case NUEVO -> new DescuentoNuevo();
            case FRECUENTE -> new DescuentoFrecuente();
            case VIP -> new DescuentoVIP();
        };
    }
}
