package principal;
import concretas.JatoMilitar;
import	concretas.JatoCivil;
import	abstratas.Jatos;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("****Hangar Helios One****");
		Jatos jato;
		int opt;
			System.out.println("Jato Militar -1-");
			System.out.println("Jato Civil -2-");
			opt = entrada.nextInt();
			switch (opt){
			case 1:
				jato = new JatoMilitar();
				menu( jato );
				break;
			case 2:
				jato = new JatoCivil();
				menu( jato );
			default:
			System.out.println("Erro...");
			}
				
		entrada.close();		
	}

	public static void menu( Jatos j ){
		if ( j instanceof JatoMilitar ){
				Scanner entrada = new Scanner (System.in);
				System.out.println("Decolar -1-");
				System.out.println("Velocidade -2-");
				System.out.println("Embarcar -3-");
				System.out.println("Reabastecer -4-");
				System.out.println("Atacar -5-");
				int opt;
				opt = entrada.nextInt();
				entrada.close();
				switch (opt){
				case 1:
					j.decolar();
					break;
				case 2:
					j.alterarVelocidade();
					break;
				case 3:
					((JatoMilitar) j).embarcar();
					break;
				case 4:
					((JatoMilitar) j).reabastecimentoAerio();
					break;
				case 5:
					((JatoMilitar) j).atacar();
					break;
				case 6:
					j.pousar();
				default:
					System.out.println("Erro");	}
				}
		
		
		else if ( j instanceof JatoCivil ){
			Scanner entrada = new Scanner (System.in);
			System.out.println("Decolar -1-");
			System.out.println("Velocidade -2-");
			System.out.println("Embarcar -3-");
			System.out.println("Reabastecer -4-");
			int opt;
			opt = entrada.nextInt();
			entrada.close();
			switch (opt){
			case 1:
				j.decolar();
				break;
			case 2:
				j.alterarVelocidade();
				break;
			case 3:
				((JatoCivil) j).embarcar();
				break;
			case 4:
				j.reabastecer();
				break;
			case 5:
				j.pousar();
				break;
			default:
				System.out.println("Erro");}
	}
	
	}

}