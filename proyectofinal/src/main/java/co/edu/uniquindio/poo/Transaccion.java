package co.edu.uniquindio.poo;
import java.time.LocalDate;


public class Transaccion {
    private String tipoTransaccion;
    private LocalDate fecha;
    private Empleado empleado;
    private Cliente cliente;
    private Vehiculo vehiculo;
    public Transaccion(String tipoTransaccion, LocalDate fecha, Empleado empleado, Cliente cliente, Vehiculo vehiculo) {
        this.tipoTransaccion = tipoTransaccion;
        this.fecha = fecha;
        this.empleado = empleado;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }
    public String getTipoTransaccion() {
        return tipoTransaccion;
    }
    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public Empleado getEmpleado() {
        return empleado;
    }
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    

    
}
