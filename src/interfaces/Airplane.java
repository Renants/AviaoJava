package interfaces;
import javax.swing.JFrame;

public interface Airplane {
		public static JFrame frame = new JFrame();
		public abstract void	decolar(); 
		public abstract void	pousar();
		public abstract void	acelerar(int velocidade);
		public abstract void	acelerar(int velocidade,boolean turbo );
		public abstract int		getSpeed();
		public abstract void	alterarVelocidade();
		public abstract void	reabastecer();	
		@Override
	    public String toString();
	}




