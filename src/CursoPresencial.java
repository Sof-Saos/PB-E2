public class CursoPresencial extends Curso {
    private String horario;
    public CursoPresencial(String nombreCurso, Profesor profesor,  String horario) {
        super(nombreCurso, profesor);
        this.horario = horario;
    }
    public double calcularAsistenciaPromedio() {
        return 0.0;
    }
}
