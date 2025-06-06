package pedido;

import cliente.Cliente;
import producto.ItemPedido;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Pedido {
    protected String id;
    protected Cliente cliente;
    protected List<ItemPedido> items;
    protected EstadoPedido estado;

    public Pedido(Cliente cliente) {
        this.id = UUID.randomUUID().toString();
        this.cliente = cliente;
        this.items = new ArrayList<>();
        this.estado = EstadoPedido.PENDIENTE;
    }

    public void agregarItem(ItemPedido item) {
        items.add(item);
    }

    public String getId() {
        return id;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void cambiarEstado(EstadoPedido nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public List<ItemPedido> getItems() {
        return items;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public abstract double calcularTotal();

    @Override
    public String toString() {
        return "Pedido #" + id + " - Cliente: " + cliente + " - Estado: " + estado;
    }
}
