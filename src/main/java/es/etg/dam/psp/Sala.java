package es.etg.dam.psp;

public class Sala {
    public static final int SUMA_RESTA_PERSONAS = 1;

    int aforo = 100;

    public void incrementar(){
        aforo = aforo +SUMA_RESTA_PERSONAS;
    }

    public void decrementar(){
        aforo = aforo -SUMA_RESTA_PERSONAS;
    }
}
