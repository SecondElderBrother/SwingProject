package swing_02;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 流式布局(从左到右,从上到下,默认居中)
 * @author Chen
 */
public class Demo_01 extends JFrame{
	
	private JPanel jPanel = new JPanel();
	
	public Demo_01(){
		jPanel.setLayout(new FlowLayout());//设置流式布局
		for (int i = 0; i < 12; i++) {
			JButton bt = new JButton("按钮" + i);
			jPanel.add(bt);
		}
		add(jPanel);
		setSize(new Dimension(400, 400));
		setLocation(new Point(200, 100));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args){
		new Demo_01();
	}
	
}
