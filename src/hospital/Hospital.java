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
public class Hospital {

    String nombre;
    Arbol arbol;
    int id;
    int nivel;

    public Hospital(String nombre, int id, int nivel) {
        this.nombre = nombre;
        this.id = id;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Hospital{" + "nombre=" + nombre + ", id=" + id + ", nivel=" + nivel + '}';
    }

}
