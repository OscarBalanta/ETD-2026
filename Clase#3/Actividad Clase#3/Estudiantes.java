public class Estudiantes {

    private String Profesor;
    private int  id;
    private String Curso;
    private int cantidadEstudianes;

    public Estudiantes(String Profesor, int id, String Curso, int cantidadEstudianes) {
        this.Profesor = Profesor;
        this.id = id;
        this.Curso = Curso;
        this.cantidadEstudianes = cantidadEstudianes;
    }       

    public String getProfesor() {
        return Profesor;
    }

    public void setProfesor(String Profesor) {
        this.Profesor = Profesor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public int getCantidadEstudianes() {
        return cantidadEstudianes;
    }

    public void setCantidadEstudianes(int cantidadEstudianes) {
        this.cantidadEstudianes = cantidadEstudianes;
    }

    @Override
    public String toString() {
        return "Estudiantes{" + "Profesor=" + Profesor + ", id=" + id + ", Curso=" + Curso + ", cantidadEstudianes=" + cantidadEstudianes + '}';
    }


    
}