public class Participante {
    //atributos de participante
    private String nombre;
    private String apellido;
    private int edad;
    private String telefono;
    private String correo;
    private String nacionalidad;
    private boolean certificadoMedico;
    private boolean aceptoTerminos;

    // Constructor 1: Solo nombre y apellido
    public Participante(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Constructor 2: Nombre, edad y teléfono
    public Participante(String nombre, int edad, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    // Constructor 3: Todos los datos
    public Participante(String nombre, String apellido, int edad, String telefono,
                        String correo, String nacionalidad, boolean certificadoMedico, boolean aceptoTerminos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.correo = correo;
        this.nacionalidad = nacionalidad;
        this.certificadoMedico = certificadoMedico;
        this.aceptoTerminos = aceptoTerminos;
    }

    // Métodos Get y Set
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getNacionalidad() { return nacionalidad; }
    public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad; }

    public boolean tieneCertificadoMedico() { return certificadoMedico; }
    public void setCertificadoMedico(boolean certificadoMedico) { this.certificadoMedico = certificadoMedico; }

    public boolean aceptoTerminos() { return aceptoTerminos; }
    public void setAceptoTerminos(boolean aceptoTerminos) { this.aceptoTerminos = aceptoTerminos; }

    // metodo que valida si cumple los requisitos
    public boolean cumpleRequisitos() {
        return (edad >= 18 && edad <= 50) && certificadoMedico && aceptoTerminos;
    }

    // metodo que muestra datos si cumple requisitos
    public void mostrarDatos() {
        if (cumpleRequisitos()) {
            System.out.println("\n----- Participante Aceptado -----");
            System.out.println("Nombre: " + nombre + " " + apellido);
            System.out.println("Edad: " + edad);
            System.out.println("Teléfono: " + telefono);
            System.out.println("Nacionalidad: " + nacionalidad);
        } else {
            System.out.println("\n----- Participante No Aceptado -----");
            System.out.println("El participante no cumple con los requisitos para la carrera.");
        }
    }
}

