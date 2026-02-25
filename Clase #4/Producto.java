public class Producto {
    
    private int id;
    private String nombre;
    private double precio;
    private int cantiddadStock;

    public Producto(int id, String nombre, double precio, int cantiddadStock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantiddadStock = cantiddadStock;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantiddadStock() {
        return cantiddadStock;
    }   
    
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantiddadStock(int cantiddadStock) {
        this.cantiddadStock = cantiddadStock;
    }


    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", cantiddadStock=" + cantiddadStock + '}';
    }


    
}
