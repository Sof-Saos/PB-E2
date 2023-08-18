package src;

public class Estudiante extends Persona implements Estaditicas{
    private String carnet;
    private double[] notas;
    private int contadorNotas;

    public Estudiante(String nombre, int edad, String genero, String carnet,  double[] notas) {
        super(nombre, edad, genero);
        this.carnet = carnet;
        this.notas = notas;
        this.contadorNotas = 0;

    }

    @Override
    public double calcularPromedio() {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    @Override
    public double calcularMaximo() {
        double max = notas[0];
        for (double nota : notas) {
            if (nota > max) {
                max = nota;
            }
        }
        return max;
    }

    @Override
    public double calcularMinimo() {
        double min = notas[0];
        for (double nota : notas) {
            if (nota < min) {
                min = nota;
            }
        }
        return min;
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
