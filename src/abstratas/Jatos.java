package abstratas;
import interfaces.Airplane;
import interfaces.Atacavel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
  
public abstract class Jatos implements Airplane,Atacavel {
	 	protected int		velocidade;
		protected int		velocidademax;
		protected int		velocidademin;
		protected int		autonomia;
		protected int		capacidade;
		protected boolean	gps;
		protected boolean	noar;
		protected String	modelo;
		protected ArrayList<String> abordo = new ArrayList();
		
		public Jatos(String modelo, int vmax, int vmin, int aut,int cap){
			this.noar = false;
			this.gps = false;
			this.modelo = modelo;
			this.velocidademax = vmax;
			this.velocidademin = vmin;
			this.autonomia	   = aut;
			this.capacidade	   = cap;
	}
		public Jatos( Jatos j ){
			this.velocidademax = j.velocidademax;
			this.velocidademin = j.velocidademin;
			this.autonomia		= j.autonomia;
			this.capacidade		= j.capacidade;
			this.noar			= j.noar;
			this.modelo			= j .modelo;
			this.abordo			= j.abordo;
		}
		
		public  void	decolar(){
			if ( noar == true )
				JOptionPane.showMessageDialog(null,"erro,"+this.modelo+" jah esta no ar.");
			else
			alterarVelocidade();
			
		}
		
		public void pousar(){
			int aux = 0;
			if ( this.noar == false ){
				JOptionPane.showMessageDialog(null,"erro "+this.modelo+" nao esta no ar.");}
			else{
			try{
			String	str = JOptionPane.showInputDialog(null,"Velocidade atual: "+this.velocidade
					+"\nReduza a velocidade para: " +(this.velocidade - this.velocidade/3));
			 aux = Integer.parseInt( str.trim()  );
			if ( aux > (this.velocidade - this.velocidade/3) ){ 
				str = "velocidade excedente!";
				 throw new IllegalArgumentException ( str );}}
			catch ( IllegalArgumentException iae ){
				JOptionPane.showMessageDialog(null,iae.getMessage(),"Erro",0);}
			acelerar(aux);this.noar = false; acelerar(0); 
			JOptionPane.showMessageDialog(null,""+this.modelo+ " pousou com sucesso");
			}
			
				
	}
		
		public void alterarVelocidade(){
			int v=0;
			String	str = JOptionPane.showInputDialog(null,"Velociade desejada: ");
				 try{
					v = Integer.parseInt( str.trim() );
					 
					 if ( v < this.velocidademin ){
						 str = "velocidade insuficiente!";
						 throw new IllegalArgumentException ( str );}
					 if ( v > this.velocidademax ){
						 str = "velocidade excedente!";
						 throw new IllegalArgumentException ( str );}
					 }
				 catch ( NumberFormatException nfe){
					 JOptionPane.showMessageDialog(null,nfe.getMessage(),"Erro",0);}
				 catch ( IllegalArgumentException iae ){
				
					 JOptionPane.showMessageDialog(null,iae.getMessage(),"Erro",0);}
				 acelerar(v); this.noar = true;
		 
}
	
		public int getSpeed(){
			return this.velocidade;
	}
		
		
		public void reabastecer(){
	    	if ( noar == false ){
	    		JOptionPane.showMessageDialog(null, "Erro nos sensores");
		 }else{
	       
				JOptionPane.showMessageDialog(null, "Avião de reabastecimento acoplado ao "+modelo
		    			+"Reabastecimento do em andamento..."
		    			+"Autonomia anterior: " +this.autonomia);
		        this.autonomia = this.autonomia + 5;
		        JOptionPane.showMessageDialog(null,"Autonomia Atual: " +this.autonomia); 
	    }
		}
		
		public void acelerar(int v){ // metodo sobrecarregado na abstrata
			this.velocidade = v;}
		
		public void setAbordo(String nome){
			this.abordo.add(nome);}
		
		
		public void getAbordo(){
			JOptionPane.showMessageDialog(null,"A bordo: ");
			for ( int i = 0; i< this.abordo.size(); i++){
				this.abordo.get(i);}
		}
		

		public void dispararMisseis(){}    
		public void reabastecimentoAerio(){} // especifica de Jato Militar
		public void autoDestruição(){}		// especificar de Drone
		
	}


