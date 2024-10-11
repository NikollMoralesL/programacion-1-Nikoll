package co.edu.uniquindio.poo;

public class Gato extends Animal {
    private String colorPelaje;
    public Gato(String nombre, int edad, double peso, String colorPelaje){
        super(nombre,edad,peso);
        this.colorPelaje=colorPelaje;
    }
    public String getColorPelaje() {
        return colorPelaje;
    }
    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }
        
    
    
    
}