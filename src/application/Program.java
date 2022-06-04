package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			Champion champion1 = new Champion();
			System.out.println("Digite os dados do primeiro campeão: ");
			System.out.print("Nome: ");
			champion1.setName(sc.nextLine());
			System.out.print("Vida inicial: ");
			champion1.setLife(sc.nextInt()); 
			System.out.print("Ataque: ");
			champion1.setAttack(sc.nextInt());
			System.out.print("Armadura: ");
			champion1.setArmor(sc.nextInt());
			
			System.out.println();
	
			Champion champion2 = new Champion();
			System.out.println("Digite os dados do segundo campeão: ");
			sc.nextLine();
			System.out.print("Nome: ");
			champion2.setName(sc.nextLine());
			System.out.print("Vida inicial: ");
			champion2.setLife(sc.nextInt()); 
			System.out.print("Ataque: ");
			champion2.setAttack(sc.nextInt());
			System.out.print("Armadura: ");
			champion2.setArmor(sc.nextInt());
			
			System.out.println();
			System.out.print("Quantos turnos você deseja executar? ");
			int N = sc.nextInt();
			System.out.println();
			
			for(int i = 0; i < N; i++) {
				champion1.takeDamege(champion2);
				champion2.takeDamege(champion1);
				System.out.printf("Resultado do turno %d: %n", i+1);
				if (champion1.getLife() <= 0 || champion2.getLife() <= 0 ) {
					System.out.println(champion1.Status());
					System.out.println(champion2.Status());
					break;
				}else {
					System.out.println(champion1.Status());
					System.out.println(champion2.Status());
				}
				System.out.println();
				
			}
			System.out.println();
			System.out.println("FIM DO COMBATE");
			
		sc.close();
	}



}
