package swing_01;

import javax.swing.JFrame;

public class Demo_01 {

	public static void main(String[] args){
		//111
		//搭建窗口类
		JFrame jf = new JFrame();
		//设置大小
		jf.setSize(400, 400);
		//设置位置
		jf.setLocation(100, 100);
		//设置关闭方式
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//设置窗体显示
		jf.setVisible(true);
		
	}
}
