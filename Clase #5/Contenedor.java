public class Contenedor {
    
    private String codigo;
    private double peso;
    private String origen;


    public Contenedor(String codigo, double peso, String origen) {
        this.codigo = codigo;
        this.peso = peso;
        this.origen = origen;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

     
    @Override
    public String toString() {
        return "Contenedor{ " + "codigo=" + codigo + ", peso=" + peso + ", origen=" + origen + '}';
    }   

    
}
