package Persona;

public class Ejercicio {
    private int ID;
    private String texto;
    private Pregunta listaPreguntas;
    
    public Ejercicio(int ID, String texto, Pregunta listapreguntas){
        this.ID = ID;
        this.texto = texto;
        this.listaPreguntas = listaPreguntas;
    }
}


