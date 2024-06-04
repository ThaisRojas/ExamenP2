import java.util.ArrayList;
import java.util.List;

public class Tienda implements ITienda {
    private List<IProducto> productos;

    public Tienda() {
        this.productos = new ArrayList<>();
    }

    @Override
    public void agregarProducto(IProducto producto) {
        productos.add(producto);
    }

    @Override
    public void listarProductos() {
        for (IProducto producto : productos) {
            producto.imprimeDetallesProducto();
        }
    }

    @Override
    public double obtenerPromedioPrecioProductos() {
        if (productos.isEmpty()) {
            return 0;
        }

        double TotalPrecio = 0;
        for (IProducto producto : productos) {
            TotalPrecio += producto.getPrecio();
        }

        return TotalPrecio / productos.size();
    }

    @Override
    public IProducto obtenerProductoMasCostoso() {
        if (productos.isEmpty()) {
            return null;
        }

        IProducto productoMasCostoso = productos.get(0);
        for (IProducto producto : productos) {

        }
        return productoMasCostoso;
    }
}
