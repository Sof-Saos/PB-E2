
public class Estudiante extends Persona implements Estaditicas{
    private String carnet;
    private double[] notas;
    private int contadorNotas;

    public Estudiante(String nombre, int edad, String genero, String carnet) {
        super(nombre, edad, genero);
        this.carnet = carnet;
        this.notas = new double[3];
        this.contadorNotas = 0;

    }

    public void agregarNota(double nota ){
        if (contadorNotas<3){
            this.notas[contadorNotas] = nota;
            contadorNotas++;
        }
    }

    @Override
    public double calcularPromedio() {
        double resultadoSuma = this.notas[0] + this.notas[1] + this.notas[2];
        double resultadoPromedio = resultadoSuma / 3;
        return resultadoPromedio;
    }

    @Override
    public double calcularMaximo() {
        double notaMayor = 0.0;
        for (int i = 0; i < contadorNotas; i++) {
            if(this.notas[i] > notaMayor){
                notaMayor = this.notas[i];
            }
        }
        return notaMayor;
    }

    @Override
    public double calcularMinimo() {
        double notaMayor = 5.0;
        double notaMenor = 0.0;
        for (int i = 0; i < contadorNotas; i++) {
            if(this.notas[i] < notaMayor) {
                notaMenor = this.notas[i];
            }
        }
        return notaMenor;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
