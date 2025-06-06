package producto;

import java.util.HashMap;
import java.util.Map;

public class ProductoRepository {
    private Map<String, Producto> productos;

    public ProductoRepository() {
        productos = new HashMap<>();
        cargarProductosIniciales();
    }

    private void cargarProductosIniciales() {
        agregarProducto(new Producto("Laptop", "L001", 800000, 10));
        agregarProducto(new Producto("Mouse", "M001", 15000, 50));
        agregarProducto(new Producto("Teclado", "T001", 30000, 30));
    }

    public void agregarProducto(Producto producto) {
        productos.put(producto.getCodigo(), producto);
    }

    public Producto buscarPorCodigo(String codigo) {
        if (!productos.containsKey(codigo)) {
            throw new IllegalArgumentException("Producto no encontrado: " + codigo);
        }
        return productos.get(codigo);
    }

    public Map<String, Producto> obtenerTodos() {
        return productos;
    }
}
