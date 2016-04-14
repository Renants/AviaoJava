package concretas;
import  abstratas.Jatos;
import java.util.ArrayList;
import java.util.Scanner;

public class JatoMilitar extends Jatos {
	 Scanner entrada = new Scanner(System.in);
     	int aux;
		protected int projeteis;
		protected int misseis;
		protected boolean turbo;
		protected boolean sensor;
		protected ArrayList<String> tripulantes;
		
		public JatoMilitar(){
			super("Raptor",2000,350,2000,2);
			this.turbo = true;
			this.sensor= false;
			this.projeteis = 1000;
			this.misseis   = 4;
		}
		
		
		public  void	disparar(int projeteis){
			if ( projeteis == 0){
				 System.out.println("erro sem projeteis");
			}
			else
				System.out.println("disparo feito");
				this.projeteis-= 4;
		};
		
		public  void	disparar(int projeteis,int misseis){
			if ( this.projeteis == 0 | this.misseis == 0){
				 System.out.println("erro sem projeteis");
				 System.out.println("erro sem projeteis");
			}
			else
				System.out.println("disparo feito");
				this.projeteis-= 4;
		};
		

		public void acelerar(int velocidade,boolean turbo){
			if ( turbo == true ){
				if ( velocidade <= this.velocidademax && velocidade > this.velocidademin )
				setSpeed( velocidade+ 200);}
			
			else if ( velocidade <= this.velocidademax && velocidade > this.velocidademin )
					setSpeed( velocidade);
			else System.out.println("erro velocidade incorreta");
			} 
		
		@Override
		public void reabastecer(){
	    	if ( noar == false && sensor == false ){
	    	System.out.println("Erro nos sensores de reabastecimento ");
	    	}else{
	       	System.out.println("Avião de reabastecimento acoplado ao " );
	        System.out.println("Reabastecimento do em andamento...");
	        System.out.println( "Autonomia anterior: " +this.autonomia );
	        this.autonomia = this.autonomia + 5;
	        System.out.println("Autonomia Atual: " +this.autonomia); }
	}
		
		public void reabastecimentoAerio(){
		while( aux > velocidade - (velocidade/3) ){
		System.out.println("reduza a velocidade em 1/3");
		aux = entrada.nextInt();}
		acelerar(aux);
		sensor = true;
		reabastecer();}

	}


