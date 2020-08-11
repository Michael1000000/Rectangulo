/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo;

import java.util.Scanner;

/**
 *
 * @author admon
 */
public class Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // En el siguiente ejercicio se solicita calcular el área y el perímetro de un Rectángulo, 
       // para ello deberemos crear las siguientes variables:
       // alto (int)
       // ancho (int)
       // El usuario debe proporcionar los valores de largo y ancho, 
       // y después se debe imprimir el resultado en el siguiente formato
       //(no usar acentos y respetar los espacios, mayúsculas, minúsculas y saltos de línea):
       
       int alto, ancho, area, perimetro;
       Scanner sc =  new Scanner(System.in);
       System.out.println("**********************************************");
       System.out.println("Por favor digite el valor correspondiente al alto: ");
       alto =  Integer.parseInt (sc.nextLine());
       System.out.println("Por favor digite el valor correspondiente al ancho: ");
       ancho = Integer.parseInt(sc.nextLine());
       
       perimetro = alto * ancho;
       area =  (alto *  ancho)/2;
       
       System.out.println("El area es la siguiente :"+area);
       System.out.println("El perimetro es la siguiente :"+perimetro);
    }
    
}
