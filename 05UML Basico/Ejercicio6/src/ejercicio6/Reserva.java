/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author user
 */
public class Reserva {
    private String fecha;
    private String hora;
    private Mesa mesa;
    private Cliente cliente;

    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public void setCliente(Cliente cliente) {
        if (cliente != null) {
            this.cliente = cliente;
        }

    }
    
    
    public void obtenerNumeroDeMesa(){
        this.mesa.obtenerNumeroDeMesa();
    }
    
    public void obtenerNombreDeCliente(){
        System.out.println("La reserva es del cliente "+cliente.getNombre());
    }
    
    
}
