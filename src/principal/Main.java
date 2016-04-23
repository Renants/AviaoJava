package principal;
import concretas.JatoMilitar;
import	concretas.JatoCivil;
import	abstratas.Jatos;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int op;
		String str;
		JOptionPane.showMessageDialog(null,"****Hangar Helios One****");
		Jatos jato;
		str = JOptionPane.showInputDialog(null, "Jato Militar -1-\n"
												+"Jato Civil -2-"
												+"Sair -0-");
		op = Integer.parseInt( str.trim()  );
			switch ( op ){
			case 1:
				jato = new JatoMilitar();
				menu( jato );
				break;
			case 2:
				jato = new JatoCivil();
				menu( jato );
			case 3:
				JOptionPane.showConfirmDialog(null, "Desesa realmente sair");
			default:
				JOptionPane.showMessageDialog(null,"Erro...");
			}
	}

	public static void menu( Jatos j ){
		String str;
		int op;
		if ( j instanceof JatoMilitar ){
			str = JOptionPane.showInputDialog(null,
					"Decolar		-1-"
					+"Velocidade	-2-"
					+"Embarcar		-3-"
					+"Reabastecer	-4-"
					+"Atacar		-5-"
					+"Pousar		-6-");
			op = Integer.parseInt( str.trim()  );
				switch (op){
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
			str = JOptionPane.showInputDialog(null,
					"Decolar		-1-"
					+"Velocidade	-2-"
					+"Embarcar		-3-"
					+"Reabastecer	-4-");
			
			op = Integer.parseInt( str.trim()  );
			switch (op){
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
				JOptionPane.showMessageDialog(null,"Erro");}
	}
	
	}

}