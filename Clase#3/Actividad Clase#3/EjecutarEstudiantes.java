public class EjecutarEstudiantes {
    public static void main(String[] args) {

        Estudiantes[] e = new Estudiantes[5];

        e[0] = new Estudiantes("Juan", 1, "Matematicas", 30);
        e[1] = new Estudiantes("Maria", 2, "Fisica", 25);
        e[2] = new Estudiantes("Pedro", 3, "Quimica", 20);
        e[3] = new Estudiantes("Ana", 4, "Biologia", 15);
        e[4] = new Estudiantes("Luis", 5, "Historia", 10);

        //operaciones en el arreglo
        int suma = 0;
        for (int i = 0; i < e.length; i++) {
            suma += e[i].getCantidadEstudianes();
        }
        System.out.println("El promedio de estudiantes por curso es: " + (suma / e.length));

        //Cursos con mas de 20 estudiantes
        String cad = "\n";
        for (int i = 0; i < e.length; i++) {
            if (e[i].getCantidadEstudianes() > 20) {
                cad += e[i].getCurso() + " con " + e[i].getCantidadEstudianes() + " estudiantes\n";
            }
        }
        System.out.println("Los cursos con mas de 20 estudiantes son: " + cad);

        
   

        
    }
    
}
