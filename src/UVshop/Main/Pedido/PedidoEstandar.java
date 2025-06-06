package pedido;

import cliente.Cliente;
import descuento.DescuentoCliente;
import descuento.DescuentoClienteFactory;
import producto.ItemPedido;

public class PedidoEstandar extends Pedido {

    public PedidoEstandar(Cliente cliente) {
        super(cliente);
    }

    @Override
    public double calcularTotal() {
        double subtotal = items.stream()
                .mapToDouble(ItemPedido::getSubtotal)
                .sum();
        DescuentoCliente estrategia = DescuentoClienteFactory.obtenerEstrategiaDescuento(cliente.getTipo());
        return estrategia.aplicarDescuento(subtotal);
    }
}
