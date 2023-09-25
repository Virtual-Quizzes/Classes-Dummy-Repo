package Persona;

import javax.swing.GroupLayout.Group;
import java.security.Timestamp;

public class Profesor extends Usuario {
    private Group grupo;
    private String carrera;

    // Constructor
    public Profesor(int id, String contrasena, String nombres, String apellidos, Timestamp nacimiento, Group grupo, String carrera) {
        super(id, contrasena, nombres, apellidos, nacimiento);
        this.grupo = grupo;
        this.carrera = carrera;
    }

    // Getter y setter específico para Profesor
    public Group getGrupo() {
        return grupo;
    }

    public void setGrupo(Group grupo) {
        this.grupo = grupo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    //==========================================================================//


    // Método para crear un grupo
    public void crearGrupo(String nombreGrupo) {
        // Lógica para crear un grupo
    }

    // Método para crear un ejercicio
    public void crearEjercicio(String nombreEjercicio) {
        // Lógica para crear un ejercicio
    }

    // Método para ver estadísticas grupales
    public void verEstadisticasGrupales() {
        // Lógica para ver estadísticas grupales
    }

    // Método para ingresar texto nuevo
    public void ingresarTextoNuevo(String texto) {
        // Lógica para ingresar texto nuevo
    }
}
