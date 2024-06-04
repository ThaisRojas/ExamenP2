public class Laptop implements IProducto {
    private String nombre;
    private String marca;
    private double precio;
    private int garantia;

    public Laptop(String nombre, String marca, double precio, int garantia) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.garantia = garantia;
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

    public int getGarantia() {
        return garantia;
    }

    @Override
    public void imprimeDetallesProducto() {
        System.out.println("LAPTOP");
        System.out.println("Modelo: " + nombre);
        System.out.println("Marca: " + marca);
        System.out.println("Precio: " + precio);
        System.out.println("Garantía: " + garantia + " años");
    }
}
