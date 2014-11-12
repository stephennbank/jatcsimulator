package atc;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class Simulator implements Runnable, WindowListener{

	private static AtcScreen atcscreen;
    private static JFrame frame;

	public Simulator(){
		
	}
	
	public void run(){
        	createAndShowGUI();
        	startSim();
	}
	
	private static void startSim(){
                
        AirPlane ap1 = new AirPlane("a1", 50, 5, 100, 50000, "bogus1", 200, 200, 200, 10);
        AirPlane ap2 = new AirPlane("a2", 50, 5, 100, 10000, "bogus2", 200, 300, 250, 10);
        
        
        ap1.SetClearAlt(1000);
        ap1.SetClearHeading(1);
        ap1.SetClearSpeed(75);     
        
        	/*
                    try
            {
                Thread.sleep(2000);
            }
            catch(Exception e)
            {
                System.out.println("insomnia!");
            }
            */
        
        atcscreen.addplane(ap1);
        atcscreen.addplane(ap2);
        
        while(true)
        {  	
            try
            {
                Thread.sleep(4000);
            }
            catch(Exception e)
            {
                System.out.println("insomnia!");
            }  
            atcscreen.update(); // this will update the "radar" screen
            frame.repaint();
        }
    }  
	
	private static void createAndShowGUI() {
		//Make sure we have nice window decorations.
        JFrame.setDefaultLookAndFeelDecorated(true);
        
        //Create and set up the window.
        frame = new JFrame("ATC simulator");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        //WindowEvent wev = new WindowEvent(frame, WindowEvent.WINDOW_CLOSING);
		//Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(wev);

        atcscreen = new AtcScreen();
        atcscreen.setOpaque(true);
        frame.setContentPane(atcscreen);
        
        //Display the window.
        frame.setSize(1000,650);
        frame.setLocation(SystemMenu.getPosition().x + SystemMenu.getFrameWidth(), 
        		SystemMenu.getPosition().y);
        frame.addWindowListener(new Simulator());
       //atcscreen.setSize(300,300);
        //frame.pack();
        frame.setVisible(true);
    }
	
	public void windowOpened(WindowEvent e) {
		//do nothing
	}
	public void windowClosing(WindowEvent e) {
		SystemMenu.simThread.interrupt();
	}
	public void windowClosed(WindowEvent e) {
		//do nothing
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
		//do nothing	
	}
	
	private class DrawCoordCircles{
		
		//public DrawCoordCircles(){
		//	Graphics2D c1 = new Graphics2D();
		//}
		
		
		
	}
	
	public static void main(String[] args){
		Simulator s = new Simulator();
		Thread sim = new Thread(s);
		
		sim.start();
	}
}
