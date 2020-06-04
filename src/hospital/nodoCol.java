package hospital;

public class nodoCol {

    nodoCol siguiente;
    Arbol info;
    String tipo_atencion, nombre;
    int cedula;

    public nodoCol(int c, String n, String ta) {
        siguiente = null;
        cedula = c;
        nombre = n;
        tipo_atencion = ta;
        info=info;

    }
}
