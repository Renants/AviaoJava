package concretas;
import  abstratas.Jatos;
import java.util.ArrayList;

public class JatoMilitar extends Jatos {
	protected int projeteis;
	protected int misseis;
	protected boolean turbo;
	protected boolean rebastecimento;
	protected ArrayList<String> tripulantes;
	
	public JatoMilitar(){
		autonomia = 2000;
		velocidademax = 1000;
		velocidademin = 300;
	}
	
	
	public  void	disparar(int projeteis){};
	public  void	disparar(int projeteis,int misseis){};
	

	public void		acelerar(int velocidade,boolean turbo){
		if ( turbo == true ){
			if ( velocidade <= this.velocidademax && velocidade > this.velocidademin )
			setSpeed( velocidade+ 200);}
		
		else if ( velocidade <= this.velocidademax && velocidade > this.velocidademin )
				setSpeed( velocidade);
		else System.out.println("erro velocidade incorreta");
		} 
	
}
