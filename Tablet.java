public class Tablet implements IProducto {
    private String nombre;
    private String marca;
    private double precio;

    public Tablet(String nombre, String marca, double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }

    @Override
    public String getModelo() {
        return nombre;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void imprimeDetallesProducto() {
        System.out.println("TABLET");
        System.out.println("Modelo: " + nombre);
        System.out.println("Marca: " + marca);
        System.out.println("Precio: " + precio);
    }
}