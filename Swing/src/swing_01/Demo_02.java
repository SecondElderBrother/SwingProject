package swing_01;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Chen
 * JFrame.EXIT_ON_CLOSE			--->�ر�ʱ�˳�����
 * JFrame.DISPOSE_ON_CLOSE		--->�ر�ʱ���ٴ���
 * JFrame.HIDE_ON_CLOSE			--->�ر�ʱ���ش���
 * JFrame.DO_NOTHING_ON_CLOSE	--->�ر�ʱû������
 */
public class Demo_02 extends JFrame{
	
	public Demo_02(){
		//���(���Է����)
		JPanel jPanel = new JPanel();
		//��ӵ���������
		this.add(jPanel);
		//���ñ�����ɫ
		//this.setBackground(Color.RED);
		//���ô�С
		//this.setSize(400, 400);
		this.setSize(new Dimension(400, 400));
		//����λ��
		//this.setLocation(200, 100);
		this.setLocation(new Point(200, 100));
		//���ùرշ�ʽ
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		//��ʾ����
		this.setVisible(true);
	}
	
	public static void main(String[] args){
		new Demo_02();
	}
	
}
