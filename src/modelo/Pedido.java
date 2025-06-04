package src.modelo;

import src.modelo.enums.EstadoPedido;
import src.modelo.interfaces.ICalculadoraDescuento;

import java.util.List;

public class Pedido {
    private int id;
    private EstadoPedido estado;
    private Cliente cliente;
    private List<Producto> productos;
    private ICalculadoraDescuento calculadoraDescuento; //interfaz de la clase Cliente

    public Pedido(int id, Cliente cliente, List<Producto> productos) {
        this.id = id;
        this.estado = EstadoPedido.PENDIENTE; // Inicialización del estado
        this.cliente = cliente;
        this.productos = productos;
        this.calculadoraDescuento = cliente.getCalculadoraDescuento(); // Obtención del calculador desde el cliente
    }

    

}
