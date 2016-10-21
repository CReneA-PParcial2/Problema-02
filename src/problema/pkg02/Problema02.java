/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg02;
import java.util.*;
/**
 *
 * @author Samsung
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Convertidor de metros a: Pies, Yardas y Millas.
        double metros, pies, yardas, millas;
        metros = pedirMetros();
        pies = calcularPies(metros);
        yardas = calcularYardas(metros);
        millas = calcularMillas(metros);
        mostrarResultados(metros, pies, yardas, millas);
    }
    
    public static double pedirMetros(){
        double metros;
        System.out.println("Introduce la cantidad de metros que deseas convertir:");
        Scanner entradaMetros = new Scanner(System.in);
        metros = entradaMetros.nextDouble();
        return metros;
    }
    
    public static double calcularPies(double metros){
        double pies;
        pies = (metros*3.28084);
        return pies;
    }
    
    public static double calcularYardas(double metros){
        double yardas;
        yardas = (metros*1.09361);
        return yardas;
    }
    
    public static double calcularMillas(double metros){
        double millas;
        millas = (metros*0.000621371);
        return millas;
    }
    
    public static void mostrarResultados(double metros, double pies, double yardas, double millas){
        System.out.println(metros + "m equivalen a:");
        System.out.println(pies + "ft");
        System.out.println(yardas + "yd");
        System.out.println(millas + "mi");
    }


}
