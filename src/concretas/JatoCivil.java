package concretas;
import abstratas.Jatos;
import java.util.Scanner;

import javax.swing.JOptionPane;

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
			this.velocidade = velocidade+ 200 ; }
		
		else if ( velocidade <= this.velocidademax && velocidade > this.velocidademin )
			this.velocidade = velocidade;
		else JOptionPane.showMessageDialog(null,"erro, velocidade incorreta");
		} 
	
	public void embarcar(){
		if ( !noar ){
		String nome;
		while ( this.passageiros > 0){
		JOptionPane.showMessageDialog(null,"Nome do passageiro: ");
		nome = entrada.nextLine();
		setAbordo(nome);
		this.passageiros --;}
		}
		else
			JOptionPane.showMessageDialog(null,"Erro" + this.modelo +"ainda em solo");	
	}
	
	
	
}	
