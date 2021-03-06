package concretas;
import abstratas.Jatos;
import javax.swing.JOptionPane;

public class Drone extends Jatos {

		protected int		velocidade;
		protected int		velocidademax;
		protected int		velocidademin;
		protected int		misseis;
		protected boolean	gps;
		protected boolean	noar;
		String modelo;
		public Drone(){
			super("Predator",2000,350,2000,0);
			this.misseis = 6;
		}
		
		public Drone(String modelo, int vmax, int vmin,int mss){
			super("Predator",vmax,vmin,2000,0);
			this.misseis = mss;
		}
		
		public Drone ( Drone d){
			super( d);
			this.misseis = d.misseis;
		}
		
		public  void	decolar(){
			if ( noar == true )
				JOptionPane.showMessageDialog(null,"erro,"+this.modelo+" jah esta no ar.");
			else
				alterarVelocidade();
			JOptionPane.showMessageDialog(null,""+this.modelo+ " decolou");
		}
		
		public void pousar(){
			if ( this.noar == false ){
				JOptionPane.showMessageDialog(null,"erro "+this.modelo+" jah esta no ar.");}
			else
				JOptionPane.showMessageDialog(null,""+this.modelo+" pousou.");
				
	}
		
		
			public void acelerar(int velocidade,boolean turbo){
			if ( turbo == true ){
				if ( velocidade <= this.velocidademax && velocidade > this.velocidademin )
				this.velocidade = velocidade+ 200 ; }
			
			else if ( velocidade <= this.velocidademax && velocidade > this.velocidademin )
				this.velocidade = velocidade;
			else JOptionPane.showMessageDialog(null,"erro, velocidade incorreta");
			} 
		 
				
		
			public void dispararMisseis(int misseis){
				if ( this.misseis == 0 )
				JOptionPane.showMessageDialog(null,"Sem munição");
				else
					JOptionPane.showMessageDialog(null,"Disparo Feito");
				this.misseis --;
			}
			
			public void autoDestruição(){
				JOptionPane.showMessageDialog(null,"O "+this.modelo+" jah era");
			} 
			
			
}



