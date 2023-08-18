package src;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Universidad universidad = new Universidad();
        Estudiante estudiante1 = new Estudiante("Pedro", 18, "masculino", "123456",  new double[] { 90, 85, 78 });
        Estudiante estudiante2 = new Estudiante("Maria", 20, "Femenino", "789654",  new double[] { 12, 45, 67 });
        Estudiante estudiante3 = new Estudiante("Luisa", 16, "Femenino", "23693039",  new double[] { 0, 25, 100 });
        Estudiante estudiante4 = new Estudiante("Antonio", 23, "Masculino", "9561139",  new double[] { 20, 50, 100 });


        ArrayList<String> materiasJuan = new ArrayList<>();
        materiasJuan.add("Antropología");
        materiasJuan.add("Historia");
        Profesor profesorJuan = new Profesor("Juan", 40, "masculino", "PhD", materiasJuan);

        ArrayList<String> materiasJose = new ArrayList<>();
        materiasJose.add("Matemáticas");
        materiasJose.add("Programación");
        Profesor profesorJose = new Profesor("Jose", 34, "masculino", "Licenciado", materiasJose);

        CursoPresencial cursoProgramacion = new CursoPresencial("Programacion", profesorJuan, "Mañana");
        CursoVirtual cursoHistoria = new CursoVirtual("Historia", profesorJose, "Zoom");

        cursoHistoria.inscripcion(estudiante1);
        cursoHistoria.inscripcion(estudiante2);
        cursoHistoria.inscripcion(estudiante3);
        cursoHistoria.inscripcion(estudiante4);
        cursoProgramacion.inscripcion(estudiante1);
        cursoProgramacion.inscripcion(estudiante2);
        cursoProgramacion.inscripcion(estudiante3);
        cursoProgramacion.inscripcion(estudiante4);

        Universidad uni = new Universidad();
        uni.agregarCurso(cursoHistoria);
        uni.agregarCurso(cursoProgramacion);
        uni.agregarEstudiante(estudiante1);
        uni.agregarEstudiante(estudiante2);
        uni.agregarEstudiante(estudiante3);
        uni.agregarEstudiante(estudiante4);
        uni.agregarProfesor(profesorJose);
        uni.agregarProfesor(profesorJuan);

        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Ver la info de toda la universidad");
            System.out.println("2. Ver cursos");
            System.out.println("3. Ver profesores");
            System.out.println("4. Ver estudiantes");
            System.out.println("5. Ver promedio de notas de los estudiantes");
            System.out.println("6. Ver promedio de asistencia y participación");
            System.out.println("7. Retirar estudiantes");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    uni.mostrarTodo();
                    break;
                case 2:
                    uni.mostrarCursos();
                    System.out.println("---- Curso Presencial ----");
                    System.out.println("Profesor: " + cursoProgramacion.profesor.getNombre());
                    System.out.println("Estudiantes inscritos:");
                    for (Estudiante estudiante : cursoProgramacion.estudiantes) {
                        System.out.println(estudiante.getNombre());
                    }
                    System.out.println("---- Curso Virtual ----");
                    System.out.println("Profesor: " + cursoHistoria.profesor.getNombre());
                    System.out.println("Estudiantes inscritos:");
                    for (Estudiante estudiante : cursoHistoria.estudiantes) {
                        System.out.println(estudiante.getNombre());
                    }
                    break;
                case 3:
                    uni.mostrarProfesores();
                    break;
                case 4:
                    uni.mostrarEstudiantes();
                    break;
                case 5:
                    System.out.println("Promedio de notas de " + estudiante1.getNombre() + " " + estudiante1.calcularPromedio());
                    System.out.println("Promedio de notas de " + estudiante2.getNombre() + " " + estudiante2.calcularPromedio());
                    System.out.println("Promedio de notas de " + estudiante3.getNombre() + " " + estudiante3.calcularPromedio());
                    System.out.println("Promedio de notas de " + estudiante4.getNombre() + " " + estudiante4.calcularPromedio());
                    break;
                case 6:
                    System.out.println("Promedio de asistencia en el curso presencial de " + cursoProgramacion.nombreCurso + " fue: " + cursoProgramacion.calcularAsistenciaPromedio(2));
                    System.out.println("Promedio de participación en el curso virtual de " + cursoHistoria.nombreCurso + " fue: " + cursoHistoria.calcularParticipacionPromedio(4));
                    break;
                case 7:
                    boolean retiroExitoso = cursoHistoria.retiro(estudiante2);
                    if (retiroExitoso) {
                        System.out.println("El estudiante " + estudiante2.getNombre() + " se ha retirado del curso virtual de historia.");
                    } else {
                        System.out.println("El estudiante " + estudiante2.getNombre() + " no estaba inscrito en el curso virtual de historia.");
                    }

                    retiroExitoso = cursoProgramacion.retiro(estudiante1);
                    if (retiroExitoso) {
                        System.out.println("El estudiante " + estudiante1.getNombre() + " se ha retirado del curso presencial de programación.");
                    } else {
                        System.out.println("El estudiante " + estudiante1.getNombre() + " no estaba inscrito en el curso presencial de programación.");
                    }
                    break;
                case 0:
                       System.out.println("Saliendo del programa.");
                       break;
                default:
                      System.out.println("Opción no válida.");
                       break;
                    }
            }  while (opcion != 0) ;
    }
}
