package swing_02;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 网格布局(超出范围,自动增加列不会增加行)
 * @author Chen
 */
public class Demo_02 extends JFrame{
	
	private JPanel jPanel = new JPanel();
	
	public Demo_02(){
		jPanel.setLayout(new GridLayout(3, 4));//设置网格布局
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
		new Demo_02();
	}
	
}
