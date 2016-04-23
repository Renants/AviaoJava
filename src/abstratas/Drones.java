package abstratas;
import interfaces.Airplane;

public abstract class Drones implements Airplane {
	protected int		velocidade;
	protected int		autonomia;
	protected int		velocidademax;
	protected int		velocidademin;
	protected int		misseis;
	protected boolean	gps;
	protected boolean	noar;
	String modelo;
	public Drones(){
		this.noar = false;
		this.gps = false;
		this.autonomia = 3000;
	}
	
	public Drones(String modelo, int vmax, int vmin,int mss){
		this.noar = false;
		this.gps = false;
		this.modelo = modelo;
		this.velocidademax = vmax;
		this.velocidademin = vmin;
		this.misseis	   = mss;		   	
	}
	
	public  void decolar(){
		if ( noar == true )
		System.out.println("erro Airplane jah esta no ar.");
		else
			alterarVelocidade();
			System.out.println("Airplane decolou");
	}
	
	public void pousar(){
		if ( this.noar == false ){
			System.out.println("erro Airplane jah esta no ar.");}
		else
			System.out.println("reduza a velocidade em 1/3");
			
}
	
	
	public void alterarVelocidade(){
		if ( noar == false ){
			System.out.println("erro Airplane ainda em solo.");}
		else	
		System.out.println("Velociade desejada: ");
		//leia velocidade;
		// chame a função acelerar;
}
	
	
	public void setSpeed(int v){
		this.velocidade = v;
}	
	
	public int getSpeed(){
		return this.velocidade;
}
	
       
       
	public void acelerar(int v){ 
		if (v > this.velocidademax && v<=0){
			System.out.println("erro velocidade incorreta");}
		setSpeed(v);}
	

}

