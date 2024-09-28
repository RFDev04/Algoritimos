/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// inicio
package exercicio2;
import java.util.Scanner;
/**
 *
 * @author fonte
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        // escreva o valor de a
        System.out.println("Digite o valor de a: ");
        double a = teclado.nextDouble();
        // escreva o valor de b
        System.out.println("Digite o valor de b: ");
        double b = teclado.nextDouble();
        // escreva o valor de c
        System.out.println("Digite o valor de c: ");
        double c = teclado.nextDouble();
        // o calculo de delta é b*b-4*a*c
        double delta = b*b-4*a*c;
        // se delta for maior de 0
        if (delta>=0) {
            double raiz1 = (-b + Math.sqrt (delta)) / (2*a);
            double raiz2 = (-b + Math.sqrt (delta)) / (2*a);
            
            System.out.println("São as raizer da equação:");
                     System.out.println( "Primeira raiz: " +raiz1);
                     System.out.println(" Segunda raiz: "+ raiz2);
        
        }
        // se delta não for maior que 0
        else {
            System.out.println(" A raiz não é real.");
        }
        
        // TODO code application logic here
    }
    
}
