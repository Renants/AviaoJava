package abstratas;
import interfaces.Airplane;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;
  
public abstract class Jatos implements Airplane {
	 	protected int		velocidade;
		protected int		velocidademax;
		protected int		velocidademin;
		protected int		autonomia;
		protected int		capacidade;
		protected boolean	gps;
		protected boolean	noar;
		protected String	modelo;
		protected ArrayList<String> abordo = new ArrayList();
		Scanner entrada = new Scanner(System.in);

		public Jatos(String modelo, int vmax, int vmin, int aut,int cap){
			this.noar = false;
			this.gps = false;
			this.modelo = modelo;
			this.velocidademax = vmax;
			this.velocidademin = vmin;
			this.autonomia	   = aut;
			this.capacidade	   = cap;
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
			else{
				int aux;
			do{
			String	str = JOptionPane.showInputDialog(null,"Velocidade atual: "+this.velocidade
					+"Reduza a velocidade em  1/3");
			 aux = Integer.parseInt( str.trim()  );
			}while(aux > velocidade - (velocidade/3) );
			acelerar(aux);}
			
				
	}
		
		
		public void alterarVelocidade(){
			if ( noar == false ){
				JOptionPane.showMessageDialog(null,"Erro"+this.modelo+ " ainda em solo");}
			else{	
				 String	str = JOptionPane.showInputDialog(null,"Velociade desejada: ");
				 int v = Integer.parseInt( str.trim() );
			acelerar(v);
				}
	}
		
		
		public void setSpeed(int v){
			this.velocidade = v;
	}	
		
		public int getSpeed(){
			return this.velocidade;
	}
		
		
		public void reabastecer(){
	    	if ( noar == false ){
	    	System.out.println("Erro nos sensores");
		 }else{
	       
				JOptionPane.showMessageDialog(null, "Avião de reabastecimento acoplado ao "+modelo
		    			+"Reabastecimento do em andamento..."
		    			+"Autonomia anterior: " +this.autonomia);
		        this.autonomia = this.autonomia + 5;
		        JOptionPane.showMessageDialog(null,"Autonomia Atual: " +this.autonomia); 
	    }
		}
	        
	       
		public void acelerar(int v){ // metodo sobrecarregado na abstrata
			if (v > this.velocidademax && v <= this.velocidademin){
				JOptionPane.showMessageDialog(null,"erro velocidade incorreta");}
			setSpeed(v);}
		
		public void setAbordo(String nome){
			this.abordo.add(nome);}
		
		public void getAbordo(){
			JOptionPane.showMessageDialog(null,"A bordo: ");
			for ( int i = 0; i< this.abordo.size(); i++){
				this.abordo.get(i);}
		}
		
	}


