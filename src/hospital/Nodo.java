/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author victo
 */
public class Nodo {

    public HospitalCola info;
    Hospital info1;
    public Nodo der;
    public Nodo izq;

    
    Nodo(Hospital info1) {
        this.info1 = info1;
        der = izq = null;
    }
    
    
    Nodo(HospitalCola info) {
        this.info = info;
        der = izq = null;
    }

}
