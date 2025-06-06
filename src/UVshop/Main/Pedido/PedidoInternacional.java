package pedido;

import cliente.Cliente;
import descuento.DescuentoCliente;
import descuento.DescuentoClienteFactory;
import producto.ItemPedido;

public class PedidoInternacional extends Pedido {

    public PedidoInternacional(Cliente cliente) {
        super(cliente);
    }

    @Override
    public double calcularTotal() {
        double subtotal = items.stream()
                .mapToDouble(ItemPedido::getSubtotal)
                .sum();
        subtotal *= 1.15; // impuestos aduaneros
        DescuentoCliente estrategia = DescuentoClienteFactory.obtenerEstrategiaDescuento(cliente.getTipo());
        return estrategia.aplicarDescuento(subtotal);
    }
}
