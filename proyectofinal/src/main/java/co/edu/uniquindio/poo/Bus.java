package co.edu.uniquindio.poo;

public class Bus extends Vehiculo{
    private int numeroPasajeros;
    private int numeroPuertas;
    private boolean tieneAireAcondicionado;
    private boolean tieneCamaraReversa;
    private int numeroBolsasAire;
    private boolean tieneABS;
    private int numeroEjes;
    private int numeorSalidasEmergencia;
    public Bus(String marca, String modelo, boolean esNuevo, String combustible, String transmision,
            int numeroPasajeros, int numeroPuertas, boolean tieneAireAcondicionado, boolean tieneCamaraReversa,
            int numeroBolsasAire, boolean tieneABS, int numeroEjes, int numeorSalidasEmergencia) {
        super(marca, modelo, esNuevo, combustible, transmision);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneCamaraReversa = tieneCamaraReversa;
        this.numeroBolsasAire = numeroBolsasAire;
        this.tieneABS = tieneABS;
        this.numeroEjes = numeroEjes;
        this.numeorSalidasEmergencia = numeorSalidasEmergencia;

        assert !marca.isBlank();
        assert !modelo.isBlank();
        assert esNuevo == true || esNuevo == false;
        assert !combustible.isBlank();
        assert !transmision.isBlank();
        assert numeroPasajeros >= 0;
        assert numeroPuertas >= 0;
        assert tieneAireAcondicionado == true || tieneAireAcondicionado == false;
        assert tieneCamaraReversa == true || tieneCamaraReversa == false;
        assert numeroBolsasAire >= 0;
        assert tieneABS == true || tieneABS == false;
        assert numeroEjes >= 0;

            

    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bus other = (Bus) obj;
        if (numeroPasajeros != other.numeroPasajeros)
            return false;
        if (numeroPuertas != other.numeroPuertas)
            return false;
        if (tieneAireAcondicionado != other.tieneAireAcondicionado)
            return false;
        if (tieneCamaraReversa != other.tieneCamaraReversa)
            return false;
        if (numeroBolsasAire != other.numeroBolsasAire)
            return false;
        if (tieneABS != other.tieneABS)
            return false;
        if (numeroEjes != other.numeroEjes)
            return false;
        if (numeorSalidasEmergencia != other.numeorSalidasEmergencia)
            return false;
        return true;
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
    public int getNumeroEjes() {
        return numeroEjes;
    }
    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }
    public int getNumeorSalidasEmergencia() {
        return numeorSalidasEmergencia;
    }
    public void setNumeorSalidasEmergencia(int numeorSalidasEmergencia) {
        this.numeorSalidasEmergencia = numeorSalidasEmergencia;
    }
    
}
