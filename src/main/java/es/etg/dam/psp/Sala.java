package es.etg.dam.psp;

public class Sala {
    public static final int SUMA_RESTA_PERSONAS = 1;

    int aforo = 100;

    public synchronized void incrementar(){
        aforo = aforo +SUMA_RESTA_PERSONAS;
    }

    public synchronized void decrementar(){
        aforo = aforo -SUMA_RESTA_PERSONAS;
    }
}
