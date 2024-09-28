/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//inicio
package exercicio7;
import java.util.Scanner;   
/**
 *
 * @author fonte
 */
public class Exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        // escreva um numero inteiro
        System.out.println ("Digite um numeto inteiro: ");
        int num1 = teclado.nextInt();
        // escreva o segundo numero inteiro
        System.out.println ("Digite o segundo numeto inteiro: ");
        int num2 = teclado.nextInt();
        // declarando as funções matematicas
        int soma = num1+num2;
        int subtracao = num1-num2;
        int multiplicacao = num1*num2;
        double divisao = num1/num2;
        int resto = num1%num2;
        // Os resultados das funções são:
        System.out.println("A soma dos numeros é: " +soma);
        System.out.println("A subtração dos numeros é: " +subtracao);
        System.out.println("A multiplicação dos numeros é: " +multiplicacao);
        System.out.println("A divisão dos numeros é: " +divisao);
        System.out.println("O resto divisão dos numeros é: " +resto);
        
        
       
        // TODO code application logic here
    }
    
}
