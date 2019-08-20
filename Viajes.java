/* Guia N°2
 * Ejercicio básico 2 numeral 3
 * Programa para determinar cantidad de viajes, dinero pagado por turistas y dinero pagado al propietario
 * Integrantes:
 * Andres Sneider Jimenez Garcia
 * Harold Felipe Zuluaga Grisales
 * Manuel leonardo Ayala Ayala 
*/
import java.util.Scanner;
public class Viajes {
		
		 public static void main(String[] args) {
		    System.out.println("Escriba la cantidad de turistas a transportar ");
	        Scanner entrada=new Scanner(System.in);
	        double npersonas=entrada.nextDouble();
	        double cantidad=10;
	        double viajes=(npersonas/cantidad);
	        double pasajes=10000*npersonas;
	        double precio=2000*viajes;
	        entrada.close();
	        System.out.println("Cantidad de viajes necesarios :"+""+viajes);
	        System.out.println("Dinero pagado por turistas :"+"$"+pasajes);
	        System.out.println("Dinero pagado al propietario :"+"$"+precio);
	        
		}
	}
