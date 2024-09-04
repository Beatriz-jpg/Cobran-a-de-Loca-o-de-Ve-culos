/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author beatr
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       //Declaração das variáveis 
       String modelo_carro;
       int dias;
       double valor_diaria;
       int km;
       //habilitando o leitor
       Scanner leitor = new Scanner(System.in);
       
        // Início do programa
        System.out.println("Programa Ag04 - Cobrança de Serviços de Locação de Veículos");
        
        //Entrada de dados
        System.out.println("- Digite o modelo do carro: ");
        //leitura dos dados do modelo do carro alugado
        modelo_carro = leitor.next();
        
        System.out.println("- Digite o valor da diária: R$ ");
        //leitura dos dados do valor da diária para locação
        valor_diaria = leitor.nextDouble();
        
        System.out.println("- Digite o número de dias para locação: ");
        //leitura dos dados da quantidade de dias de locação
        dias = leitor.nextInt();
        
        System.out.println("- Digite a quantidade de Km percorridos: ");
        //leitura dos dados da quantidade de Km percorridos
        km = leitor.nextInt();
        
        
        //Cálculo do valor total a pagar 
        double valorTotalDiaria = valor_diaria * dias;
        double valorTotalKm = km * 0.20;
        double valorTotal = valorTotalDiaria + valorTotalKm;
        
        
        //Saída de dados: será exibido na tela o modelo do carro e o valor total que o cliente terá que pagar
        System.out.println("\nO modelo do carro é: " + modelo_carro);
        System.out.printf("O valor total a ser pago é: R$ %.2f\n", valorTotal);
    }
    
}
