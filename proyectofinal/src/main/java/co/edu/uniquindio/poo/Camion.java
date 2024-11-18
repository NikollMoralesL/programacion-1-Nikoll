package co.edu.uniquindio.poo;

public class Camion {
    private double capacidadCarga;
    private boolean tieneAireAcondicionado;
    private boolean tieneFrenosAire;
    private boolean tieneABS;
    private int numeroEjes;
    private String tipoCamion;
    public Camion(double capacidadCarga, boolean tieneAireAcondicionado, boolean tieneFrenosAire, boolean tieneABS,
            int numeroEjes, String tipoCamion) {
        this.capacidadCarga = capacidadCarga;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneFrenosAire = tieneFrenosAire;
        this.tieneABS = tieneABS;
        this.numeroEjes = numeroEjes;
        this.tipoCamion = tipoCamion;

        assert capacidadCarga >= 0;
        assert tieneAireAcondicionado == true || tieneAireAcondicionado == false;
        assert tieneFrenosAire == true || tieneFrenosAire == false;
        assert tieneABS == true || tieneABS == false;
        assert numeroEjes >= 0;
        assert !tipoCamion.isBlank();
        

    }
    public double getCapacidadCarga() {
        return capacidadCarga;
    }
    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
    public boolean isTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }
    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }
    public boolean isTieneFrenosAire() {
        return tieneFrenosAire;
    }
    public void setTieneFrenosAire(boolean tieneFrenosAire) {
        this.tieneFrenosAire = tieneFrenosAire;
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
    public String getTipoCamion() {
        return tipoCamion;
    }
    public void setTipoCamion(String tipoCamion) {
        this.tipoCamion = tipoCamion;
    }

    
}
