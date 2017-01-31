package DecorateurBouton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class MyAlertDecorator extends JButton {
	
	public MyAlertDecorator(JButton bouton) {
		super(bouton.getText());
		
		for(ActionListener action : bouton.getActionListeners()){
			this.addActionListener(action);
		}
		
		this.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, getText());
				
			}
		});
		
		

	}
}
