package co.edu.uniquindio.poo;

import com.google.appengine.repackaged.org.joda.time.LocalDate;

public class App {
    public static void main(String[] args) {


        //Crear la biblioteca
        Biblioteca biblioteca = new Biblioteca("Los andes");

        //Crear bibliotecarios
        Bibliotecario bibliotecario1 = new Bibliotecario("Jose", "997531", "19482742", "jose@gmail.com", 100000);
        Bibliotecario bibliotecario2 = new Bibliotecario("Daniel", "942719", "10124613", "daniel@gmail.com",80000);
        Bibliotecario bibliotecario3 = new Bibliotecario("Miguel", "917287", "15267381", "miguel@gmail.com",120000);
        Bibliotecario bibliotecario4 = new Bibliotecario("Andres", "96138537", "11980421", "andre@gmail.com",150000);
        Bibliotecario bibliotecario5 = new Bibliotecario("Sergio", "97030291", "10938217", "Sergio@gmail.com",90000);
        //Crear estudiantes
        Estudiante estudiante1 = new Estudiante("Juan", "10123432", "919923", "juan@gmail.com");
        Estudiante estudiante2 = new Estudiante("Julian", "10328478", "952982", "julian@gmail.com");
        Estudiante estudiante3 = new Estudiante("Mateo", "10918171", "927416", "mateo@gmail.com");
        Estudiante estudiante4 = new Estudiante("Carlos", "10545526", "951399", "carlos@gmail.com");
        Estudiante estudiante5 = new Estudiante("Camilo", "10006217", "979878", "carlos@gmail.com");

        //Crear libros
        Libro libro1 = new Libro("", "", "", "","","", 353);
        Libro libro2 = new Libro("", "", "", "","","", 353);
        Libro libro3 = new Libro("", "", "", "","","", 353);
        Libro libro4 = new Libro("", "", "", "","","", 353);
        Libro libro5 = new Libro("", "", "", "","","", 353);

        //se crean los prestamos
        Prestamo prestamo=new Prestamo("pepe", 2.000);


        DetallePrestamo detallePrestamo1=new DetallePrestamo("mateo", "Metamorfosis", LocalDate.for(2002-01-12) , LocalDate.of(2024-12-11) , 1);



        //Agregar a sus respectivas listas
        biblioteca.agregarEstudiante(estudiante1);
        biblioteca.agregarEstudiante(estudiante2);
        biblioteca.agregarEstudiante(estudiante3);
        biblioteca.agregarEstudiante(estudiante4);
        biblioteca.agregarEstudiante(estudiante5);

        biblioteca.agregarBibliotecario(bibliotecario1);
        biblioteca.agregarBibliotecario(bibliotecario2);
        biblioteca.agregarBibliotecario(bibliotecario3);
        biblioteca.agregarBibliotecario(bibliotecario4);
        biblioteca.agregarBibliotecario(bibliotecario5);

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);
        biblioteca.agregarLibro(libro5);

        biblioteca.agregarPrestamo(prestamo);

        prestamo.agregarDetallePrestamo(detallePrestamo1);
    }
}