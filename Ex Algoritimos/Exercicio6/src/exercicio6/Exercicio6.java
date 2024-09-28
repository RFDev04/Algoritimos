/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// inicio
package exercicio6;
import java.util.Scanner;
/**
 *
 * @author fonte
 */
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        // informe o valor gasto pelo cliente
        System .out.println("Digite o valor gasto pelo cliente: ");
        double a = teclado.nextDouble ();
        
        double b = a + (10*a)/100;
        
        // o calculo do valor gasto + 10% é:
        System.out.println(" O valor gasto pelo cliente + 10% do garçom é:" + b);
    }
    
}
