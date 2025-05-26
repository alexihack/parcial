/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaEnlasada;

/**
 *
 * @author SISTEMA
 */

    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaEnlazadaProducto lista = new ListaEnlazadaProducto();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("""
                1. Agregar al inicio
                2. Eliminar último
                3. Imprimir de adelante hacia atrás
                4. Imprimir de atrás hacia adelante
                5. Mostrar promedio de costos
                0. Salir""");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Código: ");
                    int cod = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nombre: ");
                    String nom = sc.nextLine();
                    System.out.print("Precio: ");
                    double prec = sc.nextDouble();
                    System.out.print("Cantidad: ");
                    double cant = sc.nextDouble();
                    sc.nextLine();

                    lista.agregarInicio(new Producto(cod, nom, prec, cant));
                }
                case 2 -> lista.eliminarUltimo();
                case 3 -> lista.imprimir();
                case 4 -> lista.imprimirInverso();
                case 5 -> System.out.println("Promedio costo: " + lista.promedioCosto());
            }
        } while (opcion != 0);
    }
}

   
