package Interfaces;

public interface Airplane {

	public abstract void	decolar();
	public abstract void	pousar();
	public abstract void	acelerar();
	public abstract void	setSpeed(int v );
	public abstract int		getSpeed();
	public abstract void	defAlterarvoo();
	public abstract void	alterarVelocidade();
	public abstract float	retVelocidade(); 	
	
	@Override
    public String toString();
}


