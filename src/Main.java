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
    }
}
