public class CursoVirtual extends Curso {
    private String plataforma;
    private int contadorNotas;
    private double[] notasParticipacion;

    public CursoVirtual(String nombreCurso, Profesor profesor, String plataforma) {
        super(nombreCurso, profesor);
        this.plataforma = plataforma;
        this.contadorNotas = 0;
        this.notasParticipacion = new double[3];
    }


    public double calcularParticipacionPromedio() {
        double resultado = (this.notasParticipacion[0] + this.notasParticipacion[1] + this.notasParticipacion[2])/3;
        return resultado;
    }

}
