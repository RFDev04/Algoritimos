/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio1;
// importanto o Scanner
import java.util.Scanner;



public class Exercicio1 {
    public static void main(String[] args) throws Exception {
// ativando o Scanner
        Scanner teclado = new Scanner(System.in);
        // escreva o valor da variavel raio
        System.out.println("Infome o raio do cilindro em cm: ");
        double r = teclado.nextDouble();
// escreva o valor da variavel altura
        System.out.println("Informe a altura do cilindro em cm:");
        double h = teclado.nextDouble();
// declare as variaveis
        double n;

        double b;

        double a;

        double l;
// escreva de pi
        n = 3.14;
// calcule o valor da base do cilindro 
        b = n * (r * r);
// calcule o valor da area lateral do cilindro
        l = 2 * n * r * h;
// calcule o valor do volume do cilindro
        a = (2 * b) + l;

// o valor da base do cilindro é :
        System.out.println("A área da base do cilindro é:" +b+ "cm²" );
// o valor do volume do cilindro é:
        System.out.println(" O volume do cilindro é:" +a+ "cm³" );
    }
}