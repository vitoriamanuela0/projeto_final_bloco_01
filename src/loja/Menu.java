package loja;

import java.util.Scanner;
import loja.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
				
				Scanner scanner = new Scanner(System.in);
				
				
				int opcao = 0;
				
				while (true) {
					
					System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_BLACK_BACKGROUND
							+"----------------------------------------------------------------------------------------------------------------");
					System.out.println("                                                                                                                ");
					System.out.println("                                                 LOJA - ECLIPSE                                                 ");
					System.out.println("                                                                                                                ");
					System.out.println("----------------------------------------------------------------------------------------------------------------");
					System.out.println("                                            Entre a opção que deseja realizar:                                  ");
					System.out.println("----------------------------------------------------------------------------------------------------------------");
					System.out.println("                                                                                                                ");
					System.out.println("                                                1 - CADASTRAR PRODUTO                                           ");
					System.out.println("                                                2 - BUSCAR PRODUTO                                              ");
					System.out.println("                                                3 - ATUALIZAR PRODUTO                                           ");
					System.out.println("                                                4 - EXCLUIR PRODUTO                                             ");
					System.out.println("                                                0 - SAIR                                                        ");
					System.out.println("                                                                                                                ");
					System.out.println("----------------------------------------------------------------------------------------------------------------");
					
					
					opcao = scanner.nextInt();
					
					if (opcao == 0) {
						System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_BLACK_BACKGROUND +"                                                                                                                ");
						System.out.println( 
								"                          Loja - ECLIPSE | O código é ser você.                                                         ");
						System.out.println("                                                                                                            ");
						sobre();
						scanner.close();
						System.exit(0);
					}
					
					switch (opcao) {
					
					case 1:
		                System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_BLACK_BACKGROUND + "Cadastrar produto\n\n                                     ");
		                                                                                      
		                break;
						
					case 2:
						System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_BLACK_BACKGROUND +"Buscar Produto\n\n                                          ");
						
		                break;
					
					case 3:
						System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_BLACK_BACKGROUND +"Atualizar Produto\n\n");
		                
		                break;
						
					case 4:
						System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_BLACK_BACKGROUND +"Excluir Produto\n\n");
					    
					    break;
						
					default:
						System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_BLACK_BACKGROUND+ "Opção inválida!                                             ");
						break;
					}
					
					
				}

			}
			
			public static void sobre() {
				System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_BLACK_BACKGROUND +"--------------------------------------------------------------------------------------------------------------------");
				System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_BLACK_BACKGROUND +"Projeto Desenvolvido por: Vitória Manuela da S. Santos.                                                             ");
				System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_BLACK_BACKGROUND +"Vitória Manuela - contatodavitoria@gmail.com                                                                        ");
				System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_BLACK_BACKGROUND +"github.com/vitoriamanuela0                                                                                          ");
				System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_BLACK_BACKGROUND +"Generation Brasil.                                                                                                  ");
				System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_BLACK_BACKGROUND +"------------------------------------------------------------------------------------------------------------------- ");

	}

}
