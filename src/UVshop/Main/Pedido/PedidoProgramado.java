package pedido;

import cliente.Cliente;
import descuento.DescuentoCliente;
import descuento.DescuentoClienteFactory;
import producto.ItemPedido;

import java.time.LocalDate;

public class PedidoProgramado extends Pedido {
    private LocalDate fechaEntrega;

    public PedidoProgramado(Cliente cliente, LocalDate fechaEntrega) {
        super(cliente);
        this.fechaEntrega = fechaEntrega;
    }

    @Override
    public double calcularTotal() {
        double subtotal = items.stream()
                .mapToDouble(ItemPedido::getSubtotal)
                .sum();
        DescuentoCliente estrategia = DescuentoClienteFactory.obtenerEstrategiaDescuento(cliente.getTipo());
        return estrategia.aplicarDescuento(subtotal);
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }
}
