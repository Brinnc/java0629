package org.sp.app0629.event;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyListener implements KeyListener{
	
	public void keyTyped(KeyEvent e) {
		System.out.println("keyTyped호출");
		//keyPressed+keyReleased 와 타이밍이 중복되는 경향
	}

	
	public void keyPressed(KeyEvent e) {
		//System.out.println("keyPressed호출");
		//키 누를 때 (js_keydown)
	}

	
	public void keyReleased(KeyEvent e) {
		//System.out.println("keyReleased호출");
		//키를 눌렀다 뗄때(js_keyup)
	}
	
}
