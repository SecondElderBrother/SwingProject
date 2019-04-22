package swing_03;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * ±ß½ç²¼¾Ö
 * @author Chen
 */
public class Demo_01 extends JFrame{
	
	private JPanel jp = new JPanel();
	
	public Demo_01(){
		add(jp);
		setSize(new Dimension(400, 400));
		setLocation(new Point(200, 100));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args){
		new Demo_01();
	}
	
}
