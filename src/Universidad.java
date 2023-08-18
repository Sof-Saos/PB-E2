package src;
import java.util.ArrayList;
public class Universidad {
    private ArrayList<Profesor> profesores;
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Curso> cursos;

    public Universidad() {
        profesores = new ArrayList<>();
        estudiantes = new ArrayList<>();
        cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void mostrarCursos() {
        System.out.println("Cursos:");
        for (Curso curso : cursos) {
            System.out.println("Nombre del curso: " + curso.getNombreCurso());
            System.out.println("Profesor a cargo: " + curso.getProfesor().getNombre());
        }
        System.out.println(" ");
    }

    public void mostrarProfesores() {
        System.out.println("Profesores:");
        for (Profesor profesor : profesores) {
            System.out.println("Nombre del profesor: " + profesor.getNombre());
            System.out.println("Título: " + profesor.getTitulo());
        }
        System.out.println(" ");
    }

    public void mostrarEstudiantes() {
        System.out.println("Estudiantes:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println("Nombre del estudiante: " + estudiante.getNombre());
            System.out.println("Carnet: " + estudiante.getCarnet());
        }
        System.out.println(" ");
    }

    public void mostrarTodo() {
        System.out.println("Información de toda la universidad");
        System.out.println("La universidad cuenta con " + estudiantes.size() + " estudiantes" + ", con " + profesores.size() + " profesores y " + cursos.size() + " cursos.");
        mostrarCursos();

        mostrarEstudiantes();
        mostrarProfesores();
    }
}
