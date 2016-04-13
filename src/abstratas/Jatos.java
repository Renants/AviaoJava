package abstratas;
import Interfaces.Airplane;

public abstract class Jatos implements Airplane {
	
	protected int		velocidade;
	protected int		velocidademax;
	protected int		velocidademin;
	protected int		autonomia;
	protected int		capacidade;
	protected boolean	gps;
	protected boolean	noar;
	protected String	modelo;
	
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
	
	@override
	public void reabastecer(){
    	if ( noar == false ){
    	System.out.println("Erro nos sensores")
	 }else{
       
        System.out.println("Avião de reabastecimento acoplado ao " );
        System.out.println("Reabastecimento do em andamento...");
        System.out.println( "Autonomia anterior: "this.autonomia );
        this.autonomia = this.autonomia + 5;
        System.out.println("Autonomia Atual: " this->autonomia); 
    }
	}
        
       
	public void acelerar(int v){
		if (v > this.velocidademax && v<=0){
			System.out.println("erro velocidade incorreta");}
		setSpeed(v);}
	
}
