public class Buque {

    private String nombre;
    private String codigo;
    private String origen;


    public Buque(String nombre, String codigo, String origen) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.origen = origen;
    }


    public String getNombre() {
        return nombre;
    }       

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return "Buque{" + "nombre=" + nombre + ", codigo=" + codigo + ", origen=" + origen + '}';
    }




}