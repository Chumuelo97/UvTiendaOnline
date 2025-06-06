package pedido;

import cliente.Cliente;
import descuento.DescuentoCliente;
import descuento.DescuentoClienteFactory;
import producto.ItemPedido;

public class PedidoExpres extends Pedido {

    public PedidoExpres(Cliente cliente) {
        super(cliente);
    }

    @Override
    public double calcularTotal() {
        double subtotal = items.stream()
                .mapToDouble(ItemPedido::getSubtotal)
                .sum();
        subtotal += 5000; // cargo adicional exprés
        DescuentoCliente estrategia = DescuentoClienteFactory.obtenerEstrategiaDescuento(cliente.getTipo());
        return estrategia.aplicarDescuento(subtotal);
    }
}
