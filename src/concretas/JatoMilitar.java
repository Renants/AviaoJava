package concretas;
import  abstratas.Jatos;
import javax.swing.JOptionPane;

public class JatoMilitar extends Jatos {
		protected int projeteis;
		protected int misseis;
		protected boolean turbo;
		protected boolean sensor;
		public JatoMilitar(){
			super("Raptor",2000,350,2000,2);
			this.turbo = true;
			this.sensor= false;
			this.projeteis = 1000;
			this.misseis   = 4;
		}
		
		public JatoMilitar(String modelo, int vmax, int vmin, int aut,int cap,int projeteis, int misseis){
			super("Raptor",vmax,vmin,aut,cap);
			this.turbo = true;
			this.sensor= false;
			this.projeteis = projeteis;
			this.misseis   = misseis;
		}
		
		
		public  void	disparar(int projeteis){
			if ( projeteis == 0){
				 JOptionPane.showMessageDialog(null, "erro sem projeteis");
			}
			else
				JOptionPane.showMessageDialog(null, "disparo feito");
				this.projeteis-= 4;
		};
		
		public  void	disparar(int projeteis,int misseis){
			if ( this.projeteis == 0 | this.misseis == 0){
				JOptionPane.showMessageDialog(null, "erro sem projeteis\n"
													+"erro sem misseis");
			}
			else
				JOptionPane.showMessageDialog(null, "Disparo feito");
				this.projeteis-= 4;
		};
		

		public void acelerar(int velocidade,boolean turbo){
			if ( turbo == true ){
				if ( velocidade <= this.velocidademax && velocidade > this.velocidademin )
				setSpeed( velocidade+ 200);}
			
			else if ( velocidade <= this.velocidademax && velocidade > this.velocidademin )
					setSpeed( velocidade);
			else JOptionPane.showMessageDialog(null,"erro, velocidade incorreta");
			} 
		
		@Override
		public void reabastecer(){
	    	if ( noar == false && sensor == false ){
	    	JOptionPane.showMessageDialog(null, "Erro nos sensores de reabastecimento ");
	    	}else{
	    	JOptionPane.showMessageDialog(null, "Avião de reabastecimento acoplado ao "+modelo
	    			+"\nReabastecimento do em andamento..."
	    			+"\nAutonomia anterior: " +this.autonomia);
	        this.autonomia = this.autonomia + 5;
	        JOptionPane.showMessageDialog(null,"Autonomia Atual: " +this.autonomia); }
	}
		
		public void reabastecimentoAerio(){
		int aux;
		do{
		String	str = JOptionPane.showInputDialog(null,"Velocidade atual: "+this.velocidade
				+"Reduza a velocidade em pelo 1/3");
		 aux = Integer.parseInt( str.trim()  );
		}while(aux > velocidade - (velocidade/3) );
		acelerar(aux);
		sensor = true;
		reabastecer();}

		public void embarcar(){
			if ( noar){
			String nome;
			nome = JOptionPane.showInputDialog(null,"Nome do tripulante: ");
			setAbordo(nome);}
			else
				JOptionPane.showMessageDialog(null,"Erro" + this.modelo +"ainda em solo");	
		}
		
		
		public void atacar(){
			disparar(0,2);
		}
	}


