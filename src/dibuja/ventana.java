
package dibuja;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

import clases.dibuja;

public class ventana extends JFrame {
	private static final long serialVersionUID = 1L;
JFrame miventana;

public ventana(){

	dibuja Odibuja = new dibuja();

	miventana = new JFrame("crear mi juego");
	miventana.setSize(600, 600);
	miventana.add(Odibuja);
	miventana.setVisible(true);
	miventana.setLocationRelativeTo(null);
	miventana.setResizable(false);
	miventana.addWindowListener(new WindowListener() {
		
		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void windowClosing(WindowEvent e) {
			miventana.dispose();
			
		}
		
		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void windowActivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	});
}
	public static void main (String juego[]){
	new ventana();
        }
}