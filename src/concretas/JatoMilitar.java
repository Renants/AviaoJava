package concretas;
import  abstratas.Jatos;
import java.util.ArrayList;

public class JatoMilitar extends Jatos {
	protected int projeteis;
	protected int misseis;
	protected boolean turbo;
	protected boolean sensor;
	protected ArrayList<String> tripulantes;
	
	public JatoMilitar(){
		super("Rapotr",2000,350,2000,2);
		this.turbo = true;
		this.sensor= false;
		this.projeteis = 1000;
		this.misseis   = 4;
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
	
	@override
	public void reabastecer(){
    	if ( noar == false && sensor == false ){
    	System.out.println("Erro nos sensores de reabastecimento ")
    	}else{
       	System.out.println("Avião de reabastecimento acoplado ao " );
        System.out.println("Reabastecimento do em andamento...");
        System.out.println( "Autonomia anterior: "this.autonomia );
        this.autonomia = this.autonomia + 5;
        System.out.println("Autonomia Atual: " this->autonomia); }
}
	
	public void reabastecimentoAerio(){
	while( this.velocidade > velocidade - (velocidade/3) ){
	System.out.println("reduza a velocidade em 1/3");
	acelerar()
	sensor = true;
	reabastecer();}

}
