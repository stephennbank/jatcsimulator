package atc;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Displays the login window and takes the user's information. The login information is then
 * compared to database records.
 * @author jminer2
 */
public class LoginWindow extends JPanel implements ActionListener {
	
	//private String title = "Login Menu";
	
	private JFrame
	window = new JFrame();
	
	private JLabel
	userLabel = new JLabel("User Name: "),
	passLabel = new JLabel("Password: "),
	promptLabel = new JLabel("Please Login");
	
	private JButton 
	forgot = new JButton("Forgot Password"),
	login = new JButton("Login");
	
	private TextField
	userField = new TextField(12),
	passField = new TextField(12);
	
	private String
	userName,
	password;
	
	private User
	loggedInUser = new Student("aaa","aaa","john","smith","321 sesame st", false);
	
	/**
	 * LoginWindow Constructor
	 * @param s
	 */
	public LoginWindow(String s){
		
		GridLayout grid = new GridLayout(4,4);
		grid.setHgap(20);
		grid.setVgap(20);
		
		//Get screen size for window centering.
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		//Initialize window variables.
		window.setTitle("Account Login");
		window.setSize(300,220);
		window.setResizable(false);
		window.setLayout(new FlowLayout());
		window.setLocation( screenSize.width/2 - window.getSize().width/2, 
				screenSize.height/2 - window.getSize().height/2 );
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Initialize internal panels.
        JPanel panel = new JPanel( grid );
        JPanel buttonPanel = new JPanel();
        //BoxLayout boxLayout = new BoxLayout(buttonPanel, BoxLayout.X_AXIS);
        //buttonPanel.setLayout(boxLayout);
        
        //Add panels to window frame.
        window.add(panel, BorderLayout.NORTH);
        window.add(buttonPanel, BorderLayout.SOUTH);
        
        //Set user name label.
        userLabel.setHorizontalTextPosition(JLabel.LEFT);
        userLabel.setFont(new Font("Serif", Font.PLAIN, 16));
        
        //Set password label.
        passLabel.setHorizontalTextPosition(JLabel.LEFT);
        passLabel.setFont(new Font("Serif", Font.PLAIN, 16));
        
        //Set the prompt label.
        promptLabel.setHorizontalTextPosition(JLabel.LEFT);
        promptLabel.setFont(new Font("Serif", Font.BOLD, 16));
        
        //Set text field settings.
        userField.setBackground(Color.LIGHT_GRAY);
        passField.setBackground(Color.LIGHT_GRAY);
        
        panel.add(promptLabel);
        panel.add(new JLabel(""));
        
        //Add the user name label and text entry field
        panel.add(userLabel);
        panel.add(userField);
        
        //Add the password label and text entry field
        panel.add(passLabel);
        panel.add(passField);
        
        forgot.setAlignmentX(Component.CENTER_ALIGNMENT);
        forgot.addActionListener(this);
        login.setAlignmentX(Component.CENTER_ALIGNMENT);
        login.addActionListener(this);
        
        buttonPanel.add(forgot);
        buttonPanel.add(login);
        
        window.setVisible(true);
		
	}
	
	
	public static void main(String[] args){
		
		new LoginWindow("Air Traffic Control Simulator");
		
	}

	public void actionPerformed(ActionEvent e) {
		//Determine which button was pressed.
		
		if(e.getActionCommand().equals("Login"))
			performLogin();
		if(e.getActionCommand().equals("Forgot Password"))
			performForgotPassword();
			
	}
	
	/**
	 * The entered login information is checked for input errors and then compared to the
	 * database records.
	 */
	private void performLogin(){
		boolean
		userFound = false;
		
		userName = userField.getText();
		password = passField.getText();
		
		if(userName.length() < 3 || userName.length() > 16 || password.length() < 3 || password.length() > 16 )
			;//present error message.
		else
			userFound = searchForUser();
		
		if(userFound){
			window.setVisible(false);
			new SystemMenu(loggedInUser);
			window.dispose();
		}
	}
	
	/**
	 * Opens a new window to allow the user to recover his password.
	 */
	private void performForgotPassword(){
		System.out.println("Forgot");
	}
	
	/**
	 * Performs the database check
	 * @return true if the user/pass was found
	 */
	private boolean searchForUser(){
		return true;
	}

}
