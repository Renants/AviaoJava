package Interfaces;

public interface Airplane {

	public abstract void	decolar(); 
	public abstract void	pousar();
	public abstract void	acelerar(int velocidade);
	public abstract void	acelerar(int velocidade,boolean turbo );
	public abstract void	setSpeed(int v );
	public abstract int		getSpeed();
	public abstract void	alterarVelocidade();
		
	@Override
    public String toString();
}


