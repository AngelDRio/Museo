package es.etg.dam.psp;

public class App {

    public static final int PERSONAS_ENTRAN = 10;
    public static final int PERSONAS_SALEN = 15;
    public static final int TIEMPO_ESPERA = 500;
    public static void main(String[] args) throws InterruptedException {
        Sala sala = new Sala();

        for(int i = 0; i <= PERSONAS_ENTRAN; i++){
            Thread entrada = new Thread(new Entrada(sala));
            entrada.start();
        }
        for(int i = 0; i <= PERSONAS_SALEN; i++){
            Thread salida = new Thread(new Salida(sala));
            salida.start();
        }

        Thread.sleep(TIEMPO_ESPERA);

        System.out.println(sala.aforo);
    }
}