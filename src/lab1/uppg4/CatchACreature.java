package lab1.uppg4;

import javax.swing.JFrame;

public class CatchACreature {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Catch-A-Creature");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CatchCreature panel = new CatchCreature();
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		

	}

}
