package co.edu.uniquindio.poo;

public class Sedan extends Vehiculo {
    private int numeroPasajeros;
    private int numeroPuertas;
    private boolean tieneAireAcondicionado;
    private boolean tieneCamaraReversa;
    private boolean tieneVelocidadCrucero;
    private int numeroBolsasAire;
    private boolean tieneABS;
    private boolean tieneSensoresColision;
    private boolean tieneSensorTráfico;
    private boolean tieneAsistenteCarril;

    public Sedan(String marca, String modelo, boolean esNuevo, String combustible, String transmision, int numeroPasajeros, int numeroPuertas,
            boolean tieneAireAcondicionado, boolean tieneCamaraReversa, boolean tieneVelocidadCrucero, int numeroBolsasAire, boolean tieneABS, 
            boolean tieneSensoresColision, boolean tieneSensorTráfico, boolean tieneAsistenteCarril) {
        super(marca, modelo, esNuevo, combustible, transmision);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneCamaraReversa = tieneCamaraReversa;
        this.tieneVelocidadCrucero = tieneVelocidadCrucero;
        this.numeroBolsasAire = numeroBolsasAire;
        this.tieneABS = tieneABS;
        this.tieneSensoresColision = tieneSensoresColision;
        this.tieneSensorTráfico = tieneSensorTráfico;
        this.tieneAsistenteCarril = tieneAsistenteCarril;
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



    public boolean isTieneVelocidadCrucero() {
        return tieneVelocidadCrucero;
    }



    public void setTieneVelocidadCrucero(boolean tieneVelocidadCrucero) {
        this.tieneVelocidadCrucero = tieneVelocidadCrucero;
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



    public boolean isTieneSensoresColision() {
        return tieneSensoresColision;
    }



    public void setTieneSensoresColision(boolean tieneSensoresColision) {
        this.tieneSensoresColision = tieneSensoresColision;
    }



    public boolean isTieneSensorTráfico() {
        return tieneSensorTráfico;
    }



    public void setTieneSensorTráfico(boolean tieneSensorTráfico) {
        this.tieneSensorTráfico = tieneSensorTráfico;
    }



    public boolean isTieneAsistenteCarril() {
        return tieneAsistenteCarril;
    }



    public void setTieneAsistenteCarril(boolean tieneAsistenteCarril) {
        this.tieneAsistenteCarril = tieneAsistenteCarril;
    }



    @Override
    public String toString() {
        return super.toString() + ", Número de Pasajeros: " + numeroPasajeros + ", Número de Puertas: ";
    }
}