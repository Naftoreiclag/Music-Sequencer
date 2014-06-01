package naftoreiclag.musicsequencer;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MainFrame extends JFrame
{
	public static final String title = "Music Sequencer";
	
	private MainFrame()
	{
		super(title);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);

		MainPanel m = new MainPanel();
		
		this.add(m);
	}
	
	// This is where the magic begins
	public static void main(String[] args)
	{
		MainFrame mainFrame = new MainFrame();
		mainFrame.setVisible(true);
	}
}
