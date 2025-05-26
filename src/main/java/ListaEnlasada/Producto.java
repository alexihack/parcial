/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaEnlasada;

/**
 *
 * @author SISTEMA
 */
public class Producto {
    int codiProd;
    String nombProd;
    double precProd;
    double cantProd;
    double costoProd;

    public Producto(int codiProd, String nombProd, double precProd, double cantProd) {
        this.codiProd = codiProd;
        this.nombProd = nombProd;
        this.precProd = precProd;
        this.cantProd = cantProd;
        this.costoProd = precProd * cantProd;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codiProd=" + codiProd +
                ", nombProd='" + nombProd + '\'' +
                ", precProd=" + precProd +
                ", cantProd=" + cantProd +
                ", costoProd=" + costoProd +
                '}';
    }
}

    

