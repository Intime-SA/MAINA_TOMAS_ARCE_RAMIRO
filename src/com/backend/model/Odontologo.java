package model;

public class Odontologo {

    private int id;
    private String Matricula;
    private String Nombre;
    private String Apellido;


    public Odontologo(String matricula, String nombre, String apellido) {
        Matricula = matricula;
        Nombre = nombre;
        Apellido = apellido;
    }

    public Odontologo(int id, String matricula, String nombre, String apellido) {
        this.id = id;
        Matricula = matricula;
        Nombre = nombre;
        Apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    @Override
    public String toString() {
        return "Odontologo{" +
                "id=" + id +
                ", Matricula='" + Matricula + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                '}';
    }
}
