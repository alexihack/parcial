/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
        import DAO.DocenteDAO;
import modelo.Docentes;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        DocenteDAO dao = new DocenteDAO();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Agregar Docente");
            System.out.println("2. Modificar Docente");
            System.out.println("3. Eliminar Docente");
            System.out.println("4. Mostrar todos");
            System.out.println("5. Mostrar más alto");
            System.out.println("6. Mostrar más bajo");
            System.out.println("7. Promedio de edades");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Código: ");
                    String codigo = sc.nextLine();
                    System.out.println("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.println("Fecha de Nacimiento (AAAA-MM-DD): ");
                    LocalDate fn = LocalDate.parse(sc.nextLine());
                    System.out.println("Dirección: ");
                    String direccion = sc.nextLine();
                    System.out.println("Talla: ");
                    double talla = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Correo: ");
                    String correo = sc.nextLine();

                    dao.agregar(new Docentes(codigo, nombre, fn, direccion, talla, correo));
                }
                case 2 -> {
                    System.out.println("Índice a modificar: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    // repetir código para agregar y usarlo como reemplazo
                }
                case 3 -> {
                    System.out.println("Índice a eliminar: ");
                    int index = sc.nextInt();
                    dao.eliminar(index);
                }
                case 4 -> dao.obtenerTodos().forEach(System.out::println);
                case 5 -> System.out.println("Más alto: " + dao.obtenerMasAlto());
                case 6 -> System.out.println("Más bajo: " + dao.obtenerMasBajo());
                case 7 -> System.out.println("Promedio edades: " + dao.promedioEdades());
            }
        } while (opcion != 0);
    }
}
