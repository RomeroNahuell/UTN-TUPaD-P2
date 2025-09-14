/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author user
 */
public class Impuesto {
    private int monto;
    private Contribuyente contribuyente;

    public Impuesto(int monto) {
        this.monto = monto;
    }

    public void setContribuyente(Contribuyente contribuyente) {
        if (contribuyente != null) {
            this.contribuyente = contribuyente;
        }
    }

    public int getMonto() {
        return monto;
    }
    
    public void obtenerInformacionDelContribuyente(){
        this.contribuyente.nombreCuitDelContribuyente();
    }
    
    
    
    
    
    
    
}
