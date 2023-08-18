package src;
import java.util.ArrayList;

public class Profesor extends Persona {
    private String titulo;
    private ArrayList<String> materias;


    public Profesor(String nombre, int edad, String genero, String titulo, ArrayList<String> materias) {
        super(nombre, edad, genero);
        this.titulo = titulo;
        this.materias = materias;
    }

    public void agregarMaterias(String materia) {
        this.materias.add(materia);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<String> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<String> materias) {
        this.materias = materias;
    }
}
