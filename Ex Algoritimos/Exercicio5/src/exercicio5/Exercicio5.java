/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio5;
import java.util.Scanner;
/**
 *
 * @author fonte
 */
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o valor da base: ");
        float b = teclado.nextFloat();
        
        System.out.println("Informe o valor da altura: ");
        float h = teclado.nextFloat();
        
        float area = (b*h) / 2;
        
        System.out.println("O valor da area é" + area);
        
        // TODO code application logic here
    }
    
}
