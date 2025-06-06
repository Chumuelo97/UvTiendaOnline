package app;

import cliente.*;
import factura.Factura;
import pago.*;
import pedido.*;
import producto.*;
import descuento.DescuentoCliente;
import descuento.DescuentoClienteFactory;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // === 1. Crear cliente VIP ===
        Cliente cliente = new Cliente("Sebastián", "seba@email.com", "Valparaíso", TipoCliente.VIP);

        // === 2. Obtener productos del repositorio ===
        ProductoRepository repo = new ProductoRepository();
        Producto laptop = repo.buscarPorCodigo("L001");
        Producto mouse = repo.buscarPorCodigo("M001");

        // === 3. Crear pedido exprés y agregar ítems ===
        Pedido pedido = new PedidoExpres(cliente);
        pedido.agregarItem(new ItemPedido(laptop, 1));
        pedido.agregarItem(new ItemPedido(mouse, 2));

        // === 4. Calcular total y aplicar descuento ===
        double totalFinal = pedido.calcularTotal();

        // === 5. Procesar el pago ===
        MetodoPago metodo = PagoFactory.obtenerMetodo("tarjeta");
        metodo.procesarPago(totalFinal);
        pedido.cambiarEstado(EstadoPedido.PAGADO);

        // === 6. Emitir factura ===
        Factura factura = new Factura(pedido, totalFinal);
        factura.imprimir(pedido);
    }
}
