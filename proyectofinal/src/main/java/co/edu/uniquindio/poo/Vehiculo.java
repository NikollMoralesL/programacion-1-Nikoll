package co.edu.uniquindio.poo;

public class Vehiculo {
    public String marca;
    public String modelo;
    public boolean esNuevo;
    public String combustible;
    public String transmision;

    public Vehiculo(String marca, String modelo, boolean esNuevo, String combustible, String transmision) {
        this.marca = marca;
        this.modelo = modelo;
        this.esNuevo = esNuevo;
        this.combustible = combustible;
        this.transmision = transmision;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isEsNuevo() {
        return esNuevo;
    }

    public void setEsNuevo(boolean esNuevo) {
        this.esNuevo = esNuevo;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Nuevo: " + esNuevo + ", Combustible: " + combustible + ", Transmisión: " + transmision;
    }
    
}
