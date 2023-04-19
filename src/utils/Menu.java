package utils;

import java.util.Scanner;

public class Menu {
    
    public static void menuPrincipal(){
        System.out.println("1 - Listar");
        System.out.println("2 - Inserir");
        System.out.println("3 - Apagar");
        System.out.println("4 - Atualizar");
        System.out.println("5 - Sair");
    }
    
    public static int pegaOpcao(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Opção: ");
            int opcao = sc.nextInt();
            return opcao;
        }
        catch(Exception e){
            System.out.println("Opção inválida! Certifique-se de colocar um numero inteiro");
            pegaOpcao();
        }
        return 0;
    }

}
