/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaEnlasada;

/**
 *
 * @author SISTEMA
 */
public class ListaEnlasadaProducto {

    private Nodo cabeza;

    public void agregarInicio(Producto producto) {
        Nodo nuevo = new Nodo(producto);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }

    public void eliminarUltimo() {
        if (cabeza == null) return;

        if (cabeza.siguiente == null) {
            cabeza = null;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = null;
        }
    }

    public void imprimirInverso() {
        imprimirInversoRecursivo(cabeza);
    }

    private void imprimirInversoRecursivo(Nodo nodo) {
        if (nodo != null) {
            imprimirInversoRecursivo(nodo.siguiente);
            System.out.println(nodo.producto);
        }
    }

    public double promedioCosto() {
        if (cabeza == null) return 0;

        double suma = 0;
        int contador = 0;
        Nodo actual = cabeza;

        while (actual != null) {
            suma += actual.producto.costoProd;
            contador++;
            actual = actual.siguiente;
        }
        return suma / contador;
    }

    public void imprimir() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.producto);
            actual = actual.siguiente;
        }
    }
}


