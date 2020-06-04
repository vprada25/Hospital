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
public class HospitalCola {

    nodoCol tmp;
    nodoCol ultimo;
    int tamaño;
    String nombre;
    int id;
    int nivel;

    public HospitalCola() {
        tmp = ultimo = null;
        tamaño = 0;
    }

    public HospitalCola(String nombre, int id, int nivel) {
        tmp = ultimo = null;
        tamaño = 0;
        this.nombre = nombre;
        this.id = id;
        this.nivel = nivel;
    }

    public boolean vacia() {
        return tmp == null;
    }

    public void IngresarPaciente(int c, String n, String ta) {
        nodoCol cola = new nodoCol(c, n, ta);
        if (vacia()) {
            tmp = cola;
        } else {
            ultimo.siguiente = cola;
        }
        ultimo = cola;
        tamaño++;
    }

    public String atenderPaciente() {
        String auxiliar = tmp.nombre;
        tmp = tmp.siguiente;
        tamaño--;
        return auxiliar;
    }

    public String PrimerPaciente() {
        return tmp.nombre;
    }

    public String UltimoPaciente() {
        return ultimo.nombre;
    }

    public int TamaCola() {
        return tamaño;
    }

    public void Vaciar() {
        while (!vacia()) {
            atenderPaciente();
        }
    }

    public String MostrarPacientes() {
        nodoCol Temporal = tmp;
        String mPacientes = "Hospital "+ id +" ";
        
        while (!vacia()) {
            mPacientes += "\n" + tmp.nombre + " - " + tmp.cedula + "-" + tmp.tipo_atencion + "\n";
            tmp = tmp.siguiente;
        }
        tmp = Temporal;
        return mPacientes;
    }

}
