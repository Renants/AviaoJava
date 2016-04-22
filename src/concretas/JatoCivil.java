package concretas;
import abstratas.Jatos;
import java.util.Scanner;

public class JatoCivil extends Jatos {
	Scanner entrada = new Scanner(System.in);
	protected int passageiros;
	
	public JatoCivil(){
		super("Comcorde",2000,350,2000,2);
		this.passageiros = 32;
	};
		
	public JatoCivil(String modelo, int vmax, int vmin, int aut,int cap,int pass){
			super(modelo,vmax,vmin,aut,cap);
			this.passageiros = pass;
	}
			
		
	public void acelerar(int velocidade,boolean turbo){
		if ( turbo == true ){
			if ( velocidade <= this.velocidademax && velocidade > this.velocidademin )
			setSpeed( velocidade+ 200);}
			else if ( velocidade <= this.velocidademax && velocidade > this.velocidademin )
			setSpeed( velocidade);
			else System.out.println("erro velocidade incorreta");
			} 
	
	public void embarcar(){
		if ( !noar ){
		String nome;
		while ( this.passageiros > 0){
		System.out.println("Nome do passageiro: ");
		nome = entrada.nextLine();
		setAbordo(nome);
		this.passageiros --;}
		}
		else
		System.out.println("Erro" + this.modelo +"ainda em solo");	
	}
	
	@Override
	public void reabastecer(){
    	if ( !noar ){
    	System.out.println("Erro "+this.modelo+ "ainda em solo");
    	}else{
       	System.out.println("Avião de reabastecimento acoplado ao "+modelo );
        System.out.println("Reabastecimento do em andamento...");
        System.out.println( "Autonomia anterior: " +this.autonomia );
        this.autonomia = this.autonomia + 5;
        System.out.println("Autonomia Atual: " +this.autonomia); }
}
	
}	
