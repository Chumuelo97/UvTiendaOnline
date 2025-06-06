package factura;

import pedido.Pedido;
import producto.ItemPedido;


//// Esta clase representa una factura generada a partir de un pedido.
// // Contiene información sobre el pedido, el cliente y el total a pagar, incluyendo descuentos aplicados.
// // La clase también proporciona un método para imprimir la factura de manera formateada.
// // Utiliza el patrón de diseño Factory Method para crear instancias de Factura a partir de un Pedido.


public class Factura {
    private final String pedidoId;
    private final String clienteNombre;
    private final double totalConDescuento;
    private final String estadoPago;

    public Factura(Pedido pedido, double totalConDescuento) {
        this.pedidoId = pedido.getId();
        this.clienteNombre = pedido.getCliente().getNombre();
        this.totalConDescuento = totalConDescuento;
        this.estadoPago = pedido.getEstado().name();
    }

    public void imprimir(Pedido pedido) {
        System.out.println("\n📄 FACTURA");
        System.out.println("Pedido ID: " + pedidoId);
        System.out.println("Cliente: " + clienteNombre);
        System.out.println("Estado del pedido: " + estadoPago);
        System.out.println("\nDetalle de productos:");
        for (ItemPedido item : pedido.getItems()) {
            System.out.println(" - " + item);
        }
        System.out.printf("\nTotal a pagar: $%.2f%n", totalConDescuento);
    }
}
