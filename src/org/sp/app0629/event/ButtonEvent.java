package org.sp.app0629.event;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ButtonEvent extends JFrame{
	JButton bt;
	JTextField t;
	
	public ButtonEvent() {
		bt=new JButton("나버튼");
		t=new JTextField(25); //15자만 허용x, 최초 생성 시 15자 크기를 확보함
		
		//레이아웃 변경
		this.setLayout(new FlowLayout());
		
		//버튼 부착
		add(bt);
		//텍스트필드 부착
		add(t);
		
		setSize(300,400); //this. 생략되어있음
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); //JFrame. 생략해도 됨
		
		//버튼과 이벤트 감지자인 리스너를 연결함
		MyListener m=new MyListener();
		bt.addActionListener(new MyListener()); //매개변수에는 리스너인 者, 위에서 정의한 m을 넣어도됨
		
		//텍스트필드와 리스너와의 연결
		t.addKeyListener(new MyKeyListener());
	}
		
	public static void main(String[] args) {
		new ButtonEvent();
		
	}
}
