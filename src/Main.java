import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Universidad universidad = new Universidad();
        Estudiante estudiantePedro = new Estudiante("Pedro", 18, "masculino", "123456");
        Estudiante estudianteMaria = new Estudiante("Maria", 20, "femenino", "789654");
        Estudiante estudianteLuisa = new Estudiante("Luisa", 16, "Femenino", "23693039");
        Estudiante estudianteAntonio = new Estudiante("Antonio", 23, "Masculino", "9561139");

        Profesor profesorJuan = new Profesor("Juan", 40, "masculino", "Licenciado en programacion");
        Profesor profesorJose = new Profesor("Jose", 60, "masculino", "Licenciado en Historia");

        CursoPresencial cursoProgramacionPresencial = new CursoPresencial("Programacion", profesorJuan, "mañana");
        CursoVirtual cursoHistoria = new CursoVirtual("Historia", profesorJose, "Zoom");

        cursoProgramacionPresencial.inscripcion(estudiantePedro);
        cursoProgramacionPresencial.agregarEstudiante(estudianteMaria);
        cursoHistoria.agregarEstudiante(estudianteLuisa);
        cursoHistoria.agregarEstudiante(estudianteAntonio);

        System.out.println(cursoHistoria.calcularParticipacionPromedio());

        universidad.agregarEstudiante(estudiantePedro);
        universidad.agregarEstudiante(estudianteMaria);
        universidad.agregarEstudiante(estudianteLuisa);
        universidad.agregarEstudiante(estudianteAntonio);
        universidad.agregarProfesor(profesorJose);
        universidad.agregarCurso(cursoProgramacionPresencial);
        universidad.agregarCurso(cursoHistoria);

        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Ver la info de toda la universidad");
            System.out.println("2. Ver cursos");
            System.out.println("3. Ver profesores");
            System.out.println("4. Ver estudiantes");
            System.out.println("5. Agregar curso");
            System.out.println("6. Agregar nota");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    universidad.mostrarTodo();
                    break;
                case 2:
                    universidad.mostrarCursos();
                    break;
                case 3:
                    universidad.mostrarProfesores();
                    break;
                case 4:
                    universidad.mostrarEstudiantes();
                    break;
                case 5:
                        System.out.println("¿Qué curso desea ingresar? Curso presencial (1) | Curso Virtual (2) | Curso Laboratorio (3) | Curso Taller (4)");
                        int seleccioncurso = scanner.nextInt();
                        scanner.nextLine();
                        switch (seleccioncurso) {
                            case 1:
                                System.out.print("Ingrese el nombre del curso: ");
                                String cursoPresencialName = scanner.nextLine();
                                System.out.print("Ingrese el nombre del profesor: ");
                                String profesorPresencialName = scanner.nextLine();
                                System.out.print("Ingrese la jornada (mañana o tarde): ");
                                String jornadaConsola = scanner.nextLine();

                                if (profesorPresencialName.equals(profesorJose.getNombre())) {
                                    CursoPresencial cursoPresencial = new CursoPresencial(cursoPresencialName, profesorJose, jornadaConsola);
                                    universidad.agregarCurso(cursoPresencial);
                                } else if (profesorPresencialName.equals(profesorJuan.getNombre())) {
                                    CursoPresencial cursoPresencial = new CursoPresencial(cursoPresencialName, profesorJuan, jornadaConsola);
                                    universidad.agregarCurso(cursoPresencial);
                                } else {
                                    System.out.println("No hay profesor con dicho nombre");
                                }
                                break;
                            case 2:
                                System.out.print("Ingrese el nombre del curso: ");
                                String cursoVirtualName = scanner.nextLine();
                                System.out.print("Ingrese el nombre del profesor: ");
                                String profesorVirtualName = scanner.nextLine();
                                System.out.print("Ingrese la plataforma: ");
                                String plataformaConsola = scanner.nextLine();

                                if (profesorVirtualName.equals(profesorJose.getNombre())) {
                                    CursoVirtual cursoVirtual = new CursoVirtual(cursoVirtualName, profesorJose, plataformaConsola);
                                    universidad.agregarCurso(cursoVirtual);
                                    System.out.println("Curso agregado con exito");
                                } else if (profesorVirtualName.equals(profesorJuan.getNombre())) {
                                    CursoVirtual cursoVirtual = new CursoVirtual(cursoVirtualName, profesorJuan, plataformaConsola);
                                    universidad.agregarCurso(cursoVirtual);
                                    System.out.println("Curso agregado con exito");
                                } else {
                                    System.out.println("No hay profesor con dicho nombre");
                                }
                                break;
                        }
                case 6:
                    System.out.println(" ");
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
