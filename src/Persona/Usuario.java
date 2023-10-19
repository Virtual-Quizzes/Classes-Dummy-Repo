package Persona;

import java.security.Timestamp;
public class Usuario {
    private int id;
    private String contrasena;
    private String FirstName;
    private String LastName;
    private Timestamp dob;

    // Constructor
    public Usuario(int id, String contrasena, String nombres, String apellidos, Timestamp nacimiento) {
        this.id = id;
        this.contrasena = contrasena;
        this.FirstName = nombres;
        this.LastName = apellidos;
        this.dob = nacimiento;
    }

    // Getter y setter específico para Usuario
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getDob() {
        return dob;
    }

    public void setDob(Timestamp nacimiento) {
        this.dob = nacimiento;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) { 
        this.contrasena = contrasena;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String nombres) {
        this.FirstName = nombres;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String apellidos) {
        this.LastName = apellidos;
    }

}