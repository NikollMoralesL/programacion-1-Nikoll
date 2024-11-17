package co.edu.uniquindio.poo;

import java.util.LinkedList;

import java.util.Scanner;

/**
 * Hello world!
 *
 */

public class Main {

    // Listas para almacenar empleados, clientes y vehículos
    private static LinkedList<Empleado> empleados = new LinkedList<>();
    private static LinkedList<Cliente> clientes = new LinkedList<>();
    private static LinkedList<Vehiculo> vehiculosDisponibles = new LinkedList<>();

    public static void main(String[] args) {
        // Crear un Administrador inicial por defecto "Joseph" con datos dummy
        Administrador admin = new Administrador("Joseph", "Root", "123456789", "joseph@ucarrouq.com", "admin123", "joseph", "admin123");
        empleados.add(admin);
        
        // Crear algunos empleados y vehículos de ejemplo para interactuar
        Empleado empleado1 = new Empleado("Juan", "Perez", "12345678", "juan.perez@ucarrouq.com", "123456", "juan123", "123");
        empleados.add(empleado1);

        // Crear vehículos de ejemplo
        Vehiculo moto = new Moto("Yamaha", "YZF-R3", true, "Gasolina", "Manual", 321, 180, 6);
        Vehiculo sedan = new Sedan("Toyota", "Corolla", true, "Gasolina", "Automático", 5, 4, true, true, false, 6, true, true, true, true);
        vehiculosDisponibles.add(moto);
        vehiculosDisponibles.add(sedan);

        // Crear scanner para leer entradas de consola
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        
        for (;;) {  // Bucle for que se ejecuta indefinidamente
            if (salir) {
                break;  // Salir del bucle si la variable salir es true
            }
        
            System.out.println("\nBienvenido al sistema 'Tu Carro UQ'!");
            System.out.println("1. Iniciar sesión como Administrador");
            System.out.println("2. Iniciar sesión como Empleado");
            System.out.println("3. Iniciar sesión como Cliente");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer
        
            if (opcion == 1) {
                iniciarSesionAdministrador(scanner);
            } else if (opcion == 2) {
                iniciarSesionEmpleado(scanner);
            } else if (opcion == 3) {
                iniciarSesionCliente(scanner);
            } else if (opcion == 4) {
                System.out.println("¡Gracias por usar el sistema! Hasta luego.");
                salir = true;
            } else {
                System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
        
        scanner.close();
    }

    // Método para iniciar sesión como Administrador
    private static void iniciarSesionAdministrador(Scanner scanner) {
        System.out.print("Ingrese el nombre de usuario del administrador: ");
        String usuario = scanner.nextLine();
        System.out.print("Ingrese la contraseña: ");
        String contrasena = scanner.nextLine();
    
        // Verificar si las credenciales son correctas
        for (Empleado emp : empleados) {
            if (emp instanceof Administrador && emp.getUsuario().equals(usuario) && emp.getContrasena().equals(contrasena)) {
                mostrarMenuAdministrador(scanner, (Administrador) emp);
                return;
            }
        }
        System.out.println("Credenciales incorrectas. No se pudo iniciar sesión.");
    }

    // Método para iniciar sesión como Empleado
    private static void iniciarSesionEmpleado(Scanner scanner) {
        System.out.print("Ingrese el nombre de usuario del empleado: ");
        String usuario = scanner.nextLine();
        System.out.print("Ingrese la contraseña: ");
        String contrasena = scanner.nextLine();

        // Verificar si las credenciales son correctas
        for (Empleado emp : empleados) {
            if (emp instanceof Empleado && emp.getUsuario().equals(usuario) && emp.getContrasena().equals(contrasena)) {
                mostrarMenuEmpleado(scanner, (Empleado) emp);
                return;
            }
        }
        System.out.println("Credenciales incorrectas. No se pudo iniciar sesión.");
    }

    // Método para iniciar sesión como Cliente
    private static void iniciarSesionCliente(Scanner scanner) {
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        // Verificar si el cliente existe
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equals(nombre)) {
                mostrarMenuCliente(scanner, cliente);
                return;
            }
        }
        System.out.println("Cliente no encontrado. ¿Desea registrarse?");
        System.out.print("1. Sí  2. No: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        if (opcion == 1) {
            System.out.print("Ingrese su dirección: ");
            String direccion = scanner.nextLine();
            Cliente nuevoCliente = new Cliente(nombre, direccion);
            clientes.add(nuevoCliente);
            mostrarMenuCliente(scanner, nuevoCliente);
        } else {
            System.out.println("Saliendo...");
        }
    }

    // Menú del Administrador
    private static void mostrarMenuAdministrador(Scanner scanner, Administrador admin) {
        boolean salir = false;
    
        for (;;) {  // Bucle for que se ejecuta indefinidamente
            if (salir) {
                break;  // Salir del bucle si la variable salir es true
            }
    
            System.out.println("\n--- Menú Administrador ---");
            System.out.println("1. Registrar nuevo empleado");
            System.out.println("2. Generar reporte de negocios");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
    
            if (opcion == 1) {
                registrarEmpleado(scanner);
            } else if (opcion == 2) {
                admin.generarReporte();
            } else if (opcion == 3) {
                salir = true;
            } else {
                System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }
    

    // Menú del Empleado
    private static void mostrarMenuEmpleado(Scanner scanner, Empleado empleado) {
        boolean salir = false;
    
        for (;;) {  // Bucle for que se ejecuta indefinidamente
            if (salir) {
                break;  // Salir del bucle si la variable salir es true
            }
    
            System.out.println("\n--- Menú Empleado ---");
            System.out.println("1. Registrar vehículo");
            System.out.println("2. Registrar cliente");
            System.out.println("3. Realizar venta");
            System.out.println("4. Realizar alquiler");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
    
            if (opcion == 1) {
                registrarVehiculo(scanner, empleado);
            } else if (opcion == 2) {
                registrarCliente(scanner);
            } else if (opcion == 3) {
                realizarVenta(scanner, empleado);
            } else if (opcion == 4) {
                realizarAlquiler(scanner, empleado);
            } else if (opcion == 5) {
                salir = true;
            } else {
                System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }
    

    // Menú del Cliente
    private static void mostrarMenuCliente(Scanner scanner, Cliente cliente) {
        boolean salir = false;
    
        for (;;) {  // Bucle for que se ejecuta indefinidamente
            if (salir) {
                break;  // Salir del bucle si la variable salir es true
            }
    
            System.out.println("\n--- Menú Cliente ---");
            System.out.println("1. Buscar vehículos");
            System.out.println("2. Comprar vehículo");
            System.out.println("3. Alquilar vehículo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
    
            if (opcion == 1) {
                buscarVehiculos();
            } else if (opcion == 2) {
                comprarVehiculo(scanner, cliente);
            } else if (opcion == 3) {
                alquilarVehiculo(scanner, cliente);
            } else if (opcion == 4) {
                salir = true;
            } else {
                System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }
    

    // Métodos auxiliares

    private static void registrarEmpleado(Scanner scanner) {
        System.out.print("Ingrese nombre del empleado: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese apellido del empleado: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese DNI del empleado: ");
        String dni = scanner.nextLine();
        System.out.print("Ingrese email del empleado: ");
        String email = scanner.nextLine();
        System.out.print("Ingrese teléfono del empleado: ");
        String telefono = scanner.nextLine();
        System.out.print("Ingrese usuario del empleado: ");
        String usuario = scanner.nextLine();
        System.out.print("Ingrese contraseña del empleado: ");
        String contrasena = scanner.nextLine();

        Empleado nuevoEmpleado = new Empleado(nombre, apellido, dni, email, telefono, usuario, contrasena);
        empleados.add(nuevoEmpleado);
        System.out.println("Empleado registrado exitosamente.");
    }

    private static void registrarVehiculo(Scanner scanner, Empleado empleado) {
        System.out.print("Ingrese la marca del vehículo: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese el modelo del vehículo: ");
        String modelo = scanner.nextLine();
        System.out.print("¿Es nuevo? (true/false): ");
        boolean esNuevo = scanner.nextBoolean();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese el tipo de combustible (Gasolina, Diesel, Eléctrico, Híbrido): ");
        String combustible = scanner.nextLine();
        System.out.print("Ingrese el tipo de transmisión (Manual/Automático): ");
        String transmision = scanner.nextLine();

        Vehiculo nuevoVehiculo = new Vehiculo(marca, modelo, esNuevo, combustible, transmision);
        empleado.registrarVehiculo(nuevoVehiculo);
        vehiculosDisponibles.add(nuevoVehiculo);
        System.out.println("Vehículo registrado exitosamente.");
    }

    private static void registrarCliente(Scanner scanner) {
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la dirección del cliente: ");
        String direccion = scanner.nextLine();

        Cliente nuevoCliente = new Cliente(nombre, direccion);
        clientes.add(nuevoCliente);
        System.out.println("Cliente registrado exitosamente.");
    }

    private static void realizarVenta(Scanner scanner, Empleado empleado) {
        buscarVehiculos();
        System.out.print("Ingrese el índice del vehículo que desea vender: ");
        int indice = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        if (indice >= 0 && indice < vehiculosDisponibles.size()) {
            Vehiculo vehiculo = vehiculosDisponibles.get(indice);
            empleado.realizarVenta(vehiculo);
            System.out.println("¡Vehículo vendido exitosamente!");
        } else {
            System.out.println("Opción inválida.");
        }
    }

    private static void realizarAlquiler(Scanner scanner, Empleado empleado) {
        buscarVehiculos();
        System.out.print("Ingrese el índice del vehículo que desea alquilar: ");
        int indice = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        if (indice >= 0 && indice < vehiculosDisponibles.size()) {
            Vehiculo vehiculo = vehiculosDisponibles.get(indice);
            empleado.realizarAlquiler(vehiculo);
            System.out.println("¡Vehículo alquilado exitosamente!");
        } else {
            System.out.println("Opción inválida.");
        }
    }

    private static void comprarVehiculo(Scanner scanner, Cliente cliente) {
        buscarVehiculos();
        System.out.print("Ingrese el índice del vehículo que desea comprar: ");
        int indice = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        if (indice >= 0 && indice < vehiculosDisponibles.size()) {
            Vehiculo vehiculo = vehiculosDisponibles.get(indice);
            cliente.comprarVehiculo(vehiculo);
            System.out.println("¡Vehículo comprado exitosamente!");
        } else {
            System.out.println("Opción inválida.");
        }
    }

    private static void alquilarVehiculo(Scanner scanner, Cliente cliente) {
        buscarVehiculos();
        System.out.print("Ingrese el índice del vehículo que desea alquilar: ");
        int indice = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        if (indice >= 0 && indice < vehiculosDisponibles.size()) {
            Vehiculo vehiculo = vehiculosDisponibles.get(indice);
            cliente.alquilarVehiculo(vehiculo);
            System.out.println("¡Vehículo alquilado exitosamente!");
        } else {
            System.out.println("Opción inválida.");
        }
    }

    private static void buscarVehiculos() {{
        System.out.println("\n--- Vehículos Disponibles ---");
        for (Vehiculo vehiculo : vehiculosDisponibles) {
            System.out.println(vehiculo.toString());
        }
    }

}
}
