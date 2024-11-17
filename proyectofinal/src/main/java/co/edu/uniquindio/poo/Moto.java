package co.edu.uniquindio.poo;

public class Moto extends Vehiculo {
    private int cilindraje;
    private int velocidadMaxima;
    private int cambios;

    public Moto(String marca, String modelo, boolean esNuevo, String combustible, String transmision, int cilindraje, int velocidadMaxima, int cambios) {
        super(marca, modelo, esNuevo, combustible, transmision);
        this.cilindraje = cilindraje;
        this.velocidadMaxima = velocidadMaxima;
        this.cambios = cambios;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getCambios() {
        return cambios;
    }

    public void setCambios(int cambios) {
        this.cambios = cambios;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Cilindraje: " + cilindraje + ", Velocidad Maxima: " + velocidadMaxima + " km/h";
    }
}
    
