//Hunkar Purtul 
//https://hunkarpurtul.blogspot.com
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MouseTraining extends JFrame{

	
	JPanel _panel = new JPanel();
	String mouseState = "Not Yet Clicked";
	MouseListener _mouse = new MouseListener() {
		
		@Override
		public void mouseReleased(MouseEvent e){
			// TODO Auto-generated method stub
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseClicked(MouseEvent mouse) 
		{
			if(mouse.getButton() == 1)
				mouseState = "You Clicked Left Button";
			else if(mouse.getButton() == 3)
				mouseState = "You Clicked Right Button";
			else 
				mouseState = "You Clicked One Of The Other Buttons";
			repaint();
		}
	};
	
	MouseTraining()
	{
		setTitle("https://hunkarpurtul.blogspot.com");
		add(_panel);
		_panel.addMouseListener(_mouse);
		setVisible(true);
		setSize(500, 500);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	
	public void paint(Graphics gp)
	{

		super.paint(gp);
		Font _font = new Font("Arial Black", Font.ITALIC, 20);
		gp.setFont(_font);
		gp.drawString(mouseState, 20, 200);
	}
	
	
	public static void main(String[] args) 
	{
			new MouseTraining();
	}

}

