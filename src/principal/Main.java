package principal;
import static interfaces.Airplane.frame;
import interfaces.Airplane;
import concretas.JatoMilitar;
import	concretas.JatoCivil;
import javax.swing.JOptionPane;
public class Main {
	public static Airplane jato;
	
	public static void main(String[] args) {
		String[] Hangar = {"Jato Militar","Jato Civil", "Drone"};
		 String  escolha = (String) JOptionPane.showInputDialog(frame, "Escolha uma Aéronave", "Hangar", JOptionPane.QUESTION_MESSAGE, null, Hangar, Hangar[0]);
	    if (escolha == null) {
            escolha = "0";}

			switch ( escolha ){
			case "Jato Militar":
				jato = new JatoMilitar();
				break;
			case "Jato Civil":
				jato = new JatoCivil();
				break;
			case "Drone":
				JOptionPane.showConfirmDialog(null, "Drone ainda nao implementado!!!");
				break;
			default:
				JOptionPane.showMessageDialog(null,"Erro...");
				
			} while( menu( escolha) == 0 );
	}
	
	public static int menu(String escolha){
		String str;
		int op;
		if ( escolha == "Jato Militar" ){
			str = JOptionPane.showInputDialog(null,
					"Decolar		-1-\n"
					+"Velocidade	-2-\n"
					+"Embarcar		-3-\n"
					+"Reabastecer	-4-\n"
					+"Atacar		-5-\n"
					+"Pousar		-6-\n");
			op = Integer.parseInt( str.trim()  );
				switch (op){
				case 1:
					jato.decolar();
					break;
				case 2:
					jato.alterarVelocidade();
					break;
				case 3:
					((JatoMilitar) jato).embarcar();
					break;
				case 4:
					((JatoMilitar) jato).reabastecimentoAerio();
					break;
				case 5:
					((JatoMilitar) jato).atacar();
					break;
				case 6:
					jato.pousar();
				default:
					System.out.println("Erro");	}
				}
	
		
		else if ( escolha == "Jato Civil" ){
			str = JOptionPane.showInputDialog(null,
					"Decolar		-1-\n"
					+"Velocidade	-2-\n"
					+"Embarcar		-3-\n"
					+"Reabastecer	-4-\n");
			
			op = Integer.parseInt( str.trim()  );
			switch (op){
			case 1:
				jato.decolar();
				break;
			case 2:
				jato.alterarVelocidade();
				break;
			case 3:
				((JatoCivil) jato).embarcar();
				break;
			case 4:
				jato.reabastecer();
				break;
			case 5:
				jato.pousar();
				break;
			default:
				JOptionPane.showMessageDialog(null,"Erro");}
	}
		else{
			str = JOptionPane.showInputDialog(null,
					"Decolar		-1-\n"
					+"Velocidade	-2-\n"
					+"Pousar		-3-\n");
			
			op = Integer.parseInt( str.trim()  );
			switch (op){
			case 1:
				jato.decolar();
				break;
			case 2:
				jato.alterarVelocidade();
				break;
			case 3:
				jato.pousar();
				break;
			default:
				JOptionPane.showMessageDialog(null,"Erro");}
		}
			return 0;
	}

}