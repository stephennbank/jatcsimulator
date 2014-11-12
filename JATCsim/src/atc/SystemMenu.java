package atc;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

/**
 * Holds the panels which direct control of the program's mani functionality.
 * @author jminer2
 *
 */
public class SystemMenu extends JFrame implements ActionListener, WindowListener {

	private static final long serialVersionUID = 3019063753587570684L;
	private static JFrame window = new JFrame();
    private JButton startSimButton = new JButton("Start Simulation");
    private JButton testHistory = new JButton("Test History");
    private JButton editAccount = new JButton("Edit Account");
    private JButton testScores = new JButton("Test Scores");
    private JScrollPane scrollPanel;
    private static Simulator simulator = new Simulator();
    static volatile Thread simThread = new Thread(simulator);
    //private Dimension stdButtonDim = new Dimension(30,10);
    
    private User
	loggedInUser;
	
	public SystemMenu(User loggedInUser){
		window.setTitle("System Menu");
		
		SpringLayout spring = new SpringLayout();
		
		startSimButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		startSimButton.addActionListener(this);
		testHistory.setAlignmentX(Component.CENTER_ALIGNMENT);
		testHistory.addActionListener(this);
		editAccount.setAlignmentX(Component.CENTER_ALIGNMENT);
		editAccount.addActionListener(this);
		testScores.setAlignmentX(Component.CENTER_ALIGNMENT);
		testScores.addActionListener(this);
		
		window.setSize(220,650);
		window.setLocation(30, 30);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout( new BorderLayout() );
        window.setResizable(false);
        
        JPanel buttonPanel = new JPanel();
        BoxLayout boxLayout = new BoxLayout(buttonPanel, BoxLayout.Y_AXIS);
        buttonPanel.setLayout(boxLayout);
		buttonPanel.setSize(220,200);
        
        JPanel mainPanel = new JPanel( spring );
        window.add(mainPanel);
		
		JPanel dispPanel = new JPanel(new GridLayout(1,10));
		scrollPanel = new JScrollPane(dispPanel);
		scrollPanel.createVerticalScrollBar();
		scrollPanel.setPreferredSize(new Dimension(200, 440));
		dispPanel.setBackground(Color.WHITE);
		
		mainPanel.add(buttonPanel);
		mainPanel.add(scrollPanel);
		
		
		spring.putConstraint(SpringLayout.NORTH, buttonPanel, 10, SpringLayout.NORTH, mainPanel);
		spring.putConstraint(SpringLayout.WEST, buttonPanel, 10, SpringLayout.WEST, mainPanel);
		spring.putConstraint(SpringLayout.NORTH, scrollPanel, 180, SpringLayout.NORTH, mainPanel);
		spring.putConstraint(SpringLayout.WEST, scrollPanel, 10, SpringLayout.WEST, mainPanel);
        
        JLabel text = new JLabel("Welcome to the Flight Simulator\n", JLabel.CENTER);
        text.setHorizontalTextPosition(JLabel.CENTER);
        text.setFont(new Font("Serif", Font.PLAIN, 16));
        
        text.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        buttonPanel.add(text, BorderLayout.NORTH);
        buttonPanel.add(new JLabel() );
        buttonPanel.add(startSimButton);
        buttonPanel.add(testHistory);
        buttonPanel.add(editAccount);
        buttonPanel.add(testScores);
        
        window.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("Start Simulation")){
			if(!simThread.isAlive())
				simThread.start();
			else{
				simThread.stop();
				simThread = new Thread(simulator);
				simThread.start();
			}
		}
		if(e.getActionCommand().equals("Test History"))
			;
		if(e.getActionCommand().equals("Start Simulation"))
			;
		if(e.getActionCommand().equals("Start Simulation"))
			;
	
	}
	
	public void windowOpened(WindowEvent e) {
		//do nothing
	}
	public void windowClosing(WindowEvent e) {
		//do nothing
	}
	public void windowClosed(WindowEvent e) {
		if( e.getClass().equals(simulator.getClass()) ){
			System.out.println("yes");
		}
		System.out.println("yup");
	}
	public void windowIconified(WindowEvent e) {
		//do nothing
	}
	public void windowDeiconified(WindowEvent e) {
		//do nothing
	}
	public void windowActivated(WindowEvent e) {
		//do nothing
	}
	public void windowDeactivated(WindowEvent e) {
		if( e.getClass().equals(simulator.getClass()) ){
			System.out.println("yes");
		}
		System.out.println("yup");
	}
	
	public static Point getPosition(){
		return window.getLocation();
	}
	
	public static int getFrameWidth(){
		return window.getWidth();
	}
	
	public static int getFrameHeight(){
		return window.getHeight();
	}
	
	public static void main(String[] args){
		
		new SystemMenu(new Student("aaa", "aaa", "john", "smith", "123 sesame st", false));
	
	}
	
}
