/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// inicio
package exercicio3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) throws Exception {
        // importando teclado
        Scanner teclado = new Scanner(System.in);
        // escreva o valor da cerca na Rua do Sol
        System.out.println("Informe a medida em metros da cerca na Rua do Sol: ");
        double a = teclado.nextDouble();
        // Escreva o valor da cerca na Estrada dos passaros verdes
        System.out.println("Informe a medida em metros da cerca na Estrada dos pássaros verdes:  ");
        double b = teclado.nextDouble();

        double x;

        double c;

        x = (a * a) + ( b * b ) ;

        c = Math.sqrt (x)  ;
            // O valor da cerca necessária é x metros
        System.out.println("A medida da cerca necessária é" + c + "metros");

    }
}
    
}
