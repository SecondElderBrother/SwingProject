package swing_02;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * ��ʽ����(������,���ϵ���,Ĭ�Ͼ���)
 * @author Chen
 */
public class Demo_01 extends JFrame{
	
	private JPanel jPanel = new JPanel();
	
	public Demo_01(){
		jPanel.setLayout(new FlowLayout());//������ʽ����
		for (int i = 0; i < 12; i++) {
			JButton bt = new JButton("��ť" + i);
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
