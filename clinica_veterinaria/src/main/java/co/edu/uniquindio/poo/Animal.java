package co.edu.uniquindio.poo;

public class Animal {
    public String nombre;
    public int edad;
    public double peso;

    public Animal(String nombre, int edad, double peso){
        this.nombre=nombre;
        this.edad=edad;
        this.peso=peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    

    
}
