package co.edu.uniquindio.poo;

public class PickUp extends Vehiculo {
    private int numeroPasajeros;
    private int numeroPuertas;
    private boolean tieneAireAcondicionado;
    private boolean tieneCamaraReversa;
    private int numeroBolsasAire;
    private boolean tieneABS;
    private boolean es4x4;
    private double capacidadMaletero;
    public PickUp(String marca, String modelo, boolean esNuevo, String combustible, String transmision,
            int numeroPasajeros, int numeroPuertas, boolean tieneAireAcondicionado, boolean tieneCamaraReversa,
            int numeroBolsasAire, boolean tieneABS, boolean es4x4, double capacidadMaletero) {
        super(marca, modelo, esNuevo, combustible, transmision);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneCamaraReversa = tieneCamaraReversa;
        this.numeroBolsasAire = numeroBolsasAire;
        this.tieneABS = tieneABS;
        this.es4x4 = es4x4;
        this.capacidadMaletero = capacidadMaletero;
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
    public boolean isTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }
    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }
    public boolean isTieneCamaraReversa() {
        return tieneCamaraReversa;
    }
    public void setTieneCamaraReversa(boolean tieneCamaraReversa) {
        this.tieneCamaraReversa = tieneCamaraReversa;
    }
    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }
    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }
    public boolean isTieneABS() {
        return tieneABS;
    }
    public void setTieneABS(boolean tieneABS) {
        this.tieneABS = tieneABS;
    }
    public boolean isEs4x4() {
        return es4x4;
    }
    public void setEs4x4(boolean es4x4) {
        this.es4x4 = es4x4;
    }
    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }
    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    
}
