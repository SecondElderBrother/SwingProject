package swing_01;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Chen
 * JFrame.EXIT_ON_CLOSE			--->关闭时退出程序
 * JFrame.DISPOSE_ON_CLOSE		--->关闭时销毁窗口
 * JFrame.HIDE_ON_CLOSE			--->关闭时隐藏窗口
 * JFrame.DO_NOTHING_ON_CLOSE	--->关闭时没有作用
 */
public class Demo_02 extends JFrame{
	
	public Demo_02(){
		//面板(可以放组件)
		JPanel jPanel = new JPanel();
		//添加到主窗体中
		this.add(jPanel);
		//设置背景颜色
		//this.setBackground(Color.RED);
		//设置大小
		//this.setSize(400, 400);
		this.setSize(new Dimension(400, 400));
		//设置位置
		//this.setLocation(200, 100);
		this.setLocation(new Point(200, 100));
		//设置关闭方式
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		//显示窗体
		this.setVisible(true);
	}
	
	public static void main(String[] args){
		new Demo_02();
	}
	
}
