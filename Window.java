package DecorateurBouton;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Window extends JFrame{
	


	public Window(){
		this.setTitle("Decorator");
	    this.setSize(500, 200);              
	 
	    JPanel pan = new JPanel();
	    
	    JButton textUpperCaseButton = new TextUpperCaseDecorator(new JButton("TextUpperCase"));
	    
	    JButton alert = new MyAlertDecorator(new JButton("alert"));
	    
	    JButton hide = new HideDecorator(new JButton("hide button"));
	    
	    // Double action
	    JButton alertAndUpper = new TextUpperCaseDecorator(new MyAlertDecorator(new JButton("alertAndUpper"))); 
	    
	    // Double action via décorateur existant
	    JButton hideAndAlert = new HideDecorator(alert); 
	    hideAndAlert.setText("hideAndAlert");
	    
	    pan.add(textUpperCaseButton);
	    pan.add(alert);
	    pan.add(hide);
	    pan.add(alertAndUpper);
	    pan.add(hideAndAlert);
	    
	    this.setContentPane(pan);               
	    this.setVisible(true);
	}
	
	public static void main(String[] args){
		new Window();
	}
}
