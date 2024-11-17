package co.edu.uniquindio.poo;

public class Deportivo extends Vehiculo{
    private int numeroPasajeros;
    private int numeroPuertas;
    private int numeroBolsasAire;
    private int caballosFuerza;
    private int tiempoCienKm;
    public Deportivo(String marca, String modelo, boolean esNuevo, String combustible, String transmision,
            int numeroPasajeros, int numeroPuertas, int numeroBolsasAire, int caballosFuerza, int tiempoCienKm) {
        super(marca, modelo, esNuevo, combustible, transmision);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.numeroBolsasAire = numeroBolsasAire;
        this.caballosFuerza = caballosFuerza;
        this.tiempoCienKm = tiempoCienKm;
    }
    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }
    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }
    public int getNumeroPuertas() {
        return numeroPuertas;
    }
    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }
    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }
    public int getCaballosFuerza() {
        return caballosFuerza;
    }
    public void setCaballosFuerza(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }
    public int getTiempoCienKm() {
        return tiempoCienKm;
    }
    public void setTiempoCienKm(int tiempoCienKm) {
        this.tiempoCienKm = tiempoCienKm;
    }

    
    
}
