package DecorateurBouton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class TextUpperCaseDecorator extends JButton {
	
	public TextUpperCaseDecorator(JButton bouton) {
		super(bouton.getText());
		
		for(ActionListener action : bouton.getActionListeners()){
			this.addActionListener(action);
		}
		
		this.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setText(getText().toUpperCase());
			}
		});	
		
		
	}
}
