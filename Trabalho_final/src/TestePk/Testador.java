//-*- coding: utf-8 -*-
package TestePk;
import infos.*;
import java.util.Scanner;




public class Testador {
    
    
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("Selecione uma opcao do menu:");
            System.out.println("1 - Controle de Funcionarios");
            System.out.println("2 - Controle de Frota");
            System.out.println("3 - Controle de Clientes");
            System.out.println("0 - Encerrar o programa");
            
            System.out.print("Escolha: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1 -> System.out.println("Opcao 1 selecionada.");
                // Adicione ações específicas para a Opção 1 aqui
                case 2 -> System.out.println("Opcao 2 selecionada.");
                
                case 3 -> System.out.println("Opcao 3 selecionada.");
                // Adicione ações específicas para a Opção 2 aqui
                case 0 -> System.out.println("Encerrando o menu.");
                
                default -> System.out.println("Opcao inválida. Tente novamente.");
            }
            System.out.println();
        } while (escolha != 0);

        scanner.close();
        
    }
    
    
    
    
    
    
    
}
