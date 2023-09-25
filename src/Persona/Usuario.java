package Persona;

import java.security.Timestamp;

public class Usuario {
    private int id;
    private String contrasena;
    private String nombres;
    private String apellidos;
    private Timestamp nacimiento;

    // Constructor
    public Usuario(int id, String contrasena, String nombres, String apellidos, Timestamp nacimiento) {
        this.id = id;
        this.contrasena = contrasena;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nacimiento = nacimiento;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Timestamp getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Timestamp nacimiento) {
        this.nacimiento = nacimiento;
    }
}


