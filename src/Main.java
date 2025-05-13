import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Participante 1: Usa constructor con todos los datos (aceptado)
        Participante p1 = new Participante("Laura", "Sánchez", 25, "099888777",
                "laura@gmail.com", "ecuatoriana", true, true);
        p1.mostrarDatos();

        // Participante 2: Usa constructor parcial, luego usa setters (no aceptado)
        Participante p2 = new Participante("Mario", "López");
        p2.setEdad(17); // Menor de edad
        p2.setTelefono("0981234567");
        p2.setCorreo("mario@email.com");
        p2.setNacionalidad("ecuatoriana");
        p2.setCertificadoMedico(true);
        p2.setAceptoTerminos(true);
        p2.mostrarDatos();

        // Participante 3: Usa constructor nombre, edad, teléfono, luego setters (aceptado)
        Participante p3 = new Participante("Pedro", 32, "0987654321");
        p3.setApellido("Mena");
        p3.setCorreo("pedro@gmail.com");
        p3.setNacionalidad("ecuatoriana");
        p3.setCertificadoMedico(true);
        p3.setAceptoTerminos(true);

        System.out.println("\n----- Participante Actualizado -----");
        if (p3.cumpleRequisitos()) {
            System.out.println("Nombre: " + p3.getNombre() + " " + p3.getApellido());
            System.out.println("Edad: " + p3.getEdad());
            System.out.println("Teléfono: " + p3.getTelefono());
            System.out.println("Nacionalidad: " + p3.getNacionalidad());
        } else {
            System.out.println("No cumple con los requisitos.");
        }

        // Participante 4: usando Scanner
        // Crear objeto Scanner
        Scanner sc = new Scanner(System.in);
        // Pedir al usuario que ingrese los datos por teclado
        System.out.println("\n----- Registro de Participante -----");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Apellido: ");
        String apellido = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer

        System.out.print("Teléfono: ");
        String telefono = sc.nextLine();

        System.out.print("Correo electrónico: ");
        String correo = sc.nextLine();

        System.out.print("Nacionalidad: ");
        String nacionalidad = sc.nextLine();

        System.out.print("¿Tiene certificado médico? (true/false): ");
        boolean certificado = sc.nextBoolean();

        System.out.print("¿Aceptó los términos? (true/false): ");
        boolean acepto = sc.nextBoolean();

        // Crear objeto con todos los datos
        Participante p4 = new Participante(nombre, apellido, edad, telefono, correo, nacionalidad, certificado, acepto);

        // Validar resultados
        p4.mostrarDatos();
    }
}
