package es.etg.dam.psp;

public class Entrada implements Runnable {
    private Sala sala;

    public Entrada(Sala sala){
        this.sala = sala;
    }
    
    @Override
    public void run() {
        sala.incrementar();
    }
}
