package pedido;

// Esta clase es responsable de crear instancias de pedidos según el tipo
// especificado. Utiliza el patrón Factory Method para encapsular la lógica de
// creación de objetos y permitir la extensión futura sin modificar el código  
// existente. Cada tipo de pedido tiene su propia implementación, lo que permite
// crear diferentes tipos de pedidos sin necesidad de cambiar el código de la
// aplicación principal.



import cliente.Cliente;

import java.time.LocalDate;

public class PedidoFactory {
    public static Pedido crearPedido(String tipo, Cliente cliente) {
        return switch (tipo.toUpperCase()) {
            case "ESTANDAR" -> new PedidoEstandar(cliente);
            case "EXPRES" -> new PedidoExpres(cliente);
            case "INTERNACIONAL" -> new PedidoInternacional(cliente);
            default -> throw new IllegalArgumentException("Tipo de pedido desconocido");
        };
    }

    public static Pedido crearPedidoProgramado(Cliente cliente, LocalDate fechaEntrega) {
        return new PedidoProgramado(cliente, fechaEntrega);
    }
}
