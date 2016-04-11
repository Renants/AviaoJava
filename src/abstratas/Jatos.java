package abstratas;
import Interfaces.Airplane;


public abstract class Jatos implements Airplane {
	
	protected int		velocidade;
	protected int		velocidadeMax;
	protected int		autonomia;
	protected int		capacidade;
	protected boolean	gps;
	protected boolean	noar;
	protected String	modelo;
	
	public Jatos(){
		noar = false;
		gps = false;
}
	
	public  void	decolar(){
		if ( noar == true )
		System.out.println("erro Airplane jah esta no ar.");
		else
			alterarVelocidade();
			System.out.println("Airplane decolou");
	}
	
	public void pousar(){
		if ( this.noar == false ){
			System.out.println("erro Airplane jah esta no ar.");
			break;}
		else
			System.out.println("reduza a velocidade em 1/3");
			
		}
	}
	
	public void alterarVelocidade(){
		if ( noar == false ){
			System.out.println("erro Airplane ainda em solo.");}
		else	
		System.out.println("Velociade desejada: ");
		//leia velocidade;
		if ( this.velocidade > this.velocidadeMax ){
			System.out.println("erro velocidade maxima excedida: ");
			break;}
		else
			setSpeed(v);
			
		}
	
	
	public void setSpeed(int v){
		this.velocidade = v;
}	
	
	public int getSpeed(){
		return this.velocidade;
}

	public void reabastecer(){
		if (this.noar == false){
			System.out.println("erro Airplane ainda em solo.");
			break;}
		else
	}
