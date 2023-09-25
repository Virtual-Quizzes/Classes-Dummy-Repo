package Persona;

import javax.swing.GroupLayout.Group;
import java.security.Timestamp;


public class Estudiante extends Usuario {
    private Group grupo;
    private int cantidadDeTextoLeido;
    private float porcentajePreguntasCorrectas;
    private float porcentajePreguntasFallidas;
    private float porcentajeTextoFallotodo;
    private float porcentajeTextoAcertotodo;

    // Constructor
    public Estudiante(int id, String contrasena, String nombres, String apellidos, Timestamp nacimiento, Group grupo) {
        super(id, contrasena, nombres, apellidos, nacimiento);
        this.grupo = grupo;
    }

    // Getter y setter específico para Estudiante
    public Group getGrupo() {
        return grupo;
    }

    public void setGrupo(Group grupo) {
        this.grupo = grupo;
    }

    public int getCantidadDeTextoLeido() {
        return cantidadDeTextoLeido;
    }

    public void setCantidadDeTextoLeido(int cantidadDeTextoLeido) {
        this.cantidadDeTextoLeido = cantidadDeTextoLeido;
    }

    public float getPorcentajePreguntasCorrectas() {
        return porcentajePreguntasCorrectas;
    }

    public void setPorcentajePreguntasCorrectas(float porcentajePreguntasCorrectas) {
        this.porcentajePreguntasCorrectas = porcentajePreguntasCorrectas;
    }

    public float getPorcentajePreguntasFallidas() {
        return porcentajePreguntasFallidas;
    }

    public void setPorcentajePreguntasFallidas(float porcentajePreguntasFallidas) {
        this.porcentajePreguntasFallidas = porcentajePreguntasFallidas;
    }

    public float getPorcentajeTextoFallotodo() {
        return porcentajeTextoFallotodo;
    }

    public void setPorcentajeTextoFallotodo(float porcentajeTextoFallotodo) {
        this.porcentajeTextoFallotodo = porcentajeTextoFallotodo;
    }

    public float getPorcentajeTextoAcertotodo() {
        return porcentajeTextoAcertotodo;
    }

    public void setPorcentajeTextoAcertotodo(float porcentajeTextoAcertotodo) {
        this.porcentajeTextoAcertotodo = porcentajeTextoAcertotodo;
    }

    // Método para buscar un texto
    public void buscarTexto(String texto) {
        // Lógica para buscar un texto
    }

    // Método para seleccionar un texto
    public void seleccionarTexto(String texto) {
        // Lógica para seleccionar un texto
    }

    // Método para resolver preguntas
    public void resolverPreguntas() {
        // Lógica para resolver preguntas
    }

    // Método para ver estadísticas personales
    public void verEstadisticasPersonales() {
        // Lógica para ver estadísticas personales
    }

    // Método para solicitar unirse a un grupo
    public void solicitarGrupo(Group grupo) {
        // Lógica para solicitar unirse a un grupo
    }
}
