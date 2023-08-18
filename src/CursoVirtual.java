package src;

public class CursoVirtual extends Curso implements Gestionable{
    private String plataforma;
    private int contadorNotas;

    public CursoVirtual(String nombreCurso, Profesor profesor, String plataforma) {
        super(nombreCurso, profesor);
        this.plataforma = plataforma;
        this.contadorNotas = 0;
    }

    @Override
    public boolean inscripcion(Estudiante estudiante) {
        estudiantes.add(estudiante);
        return true;
    }

    public double calcularParticipacionPromedio(int participaron) {
        if (participaron <= estudiantes.size()) {
            double resultado = ((double) participaron / estudiantes.size()) * 100;
            return resultado;
        } else {
            System.out.println("Número inválido. No pueden haber participado más estudiantes de los inscritos.");
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
