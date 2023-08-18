package src;
public class CursoPresencial extends Curso implements Gestionable {
    private String horario;
    public CursoPresencial(String nombreCurso, Profesor profesor,  String horario) {
        super(nombreCurso, profesor);
        this.horario = horario;
    }

    @Override
    public boolean inscripcion(Estudiante estudiante) {
        if (estudiantes.size() < 20) {
            estudiantes.add(estudiante);
            return true;
        }
        return false;
    }

    public double calcularAsistenciaPromedio(int asistieron) {
        if (asistieron <= estudiantes.size()) {
            double resultado = ((double) asistieron / estudiantes.size()) * 100;
            return resultado;
        } else {
            System.out.println("Número inválido. No pueden haber asistido más estudiantes de los inscritos.");
            return 0.0;
        }
    }
    @Override
    public boolean retiro(Estudiante estudiante) {
        if (estudiantes.contains(estudiante)) {
            estudiantes.remove(estudiante);
            return true;
        }
        return false;
    }
}

