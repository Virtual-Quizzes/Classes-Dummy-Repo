package Persona;

public class Pregunta {
    private String listaAlternativas;
    private String pregunta;
    private char alternativaCorrecta;
    private String razonamiento;
    
    public Pregunta(String listaAlternativas, String pregunta, char alternativaCorrecta, String razonamiento){
        this.alternativaCorrecta = alternativaCorrecta;
        this.listaAlternativas = listaAlternativas;
        this.pregunta = pregunta;
        this.razonamiento  = razonamiento;
    }
}
