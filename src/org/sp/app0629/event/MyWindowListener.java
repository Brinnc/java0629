package org.sp.app0629.event;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWindowListener implements WindowListener{

	//모든 리스너가 보유한 추상메서드는 해당 이벤트 발생 시 시스템에 의해서 자동 호출됨
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened호출~");
		//프레임이 등장할때(열릴때) 호출
	}

	
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing호출~");
		//프레임이 사라질때(닫힐때) 호출
	}

	
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed호출~");
		//프레임이 사라진 후(완전히 닫혔을 때) 호출
	}

	
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified호출~");
		//윈도우가 상태 표시줄로 작아질 때 (즉 최소화되어 아이콘화될 때)
	}

	
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified호출~");
		//윈도우가 상태 표시줄에서 다시 복원될 때
	}

	
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated호출~");
		//윈도우가 활성화될 때 (해당 창에 포커스_커서가 올라와있을때, 즉 사용 활성화)
	}

	
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated호출~");
		//윈도우가 비활성화될 때 (해당 창을 포커스하지 않을 때, 즉 사용하지 않을때)
	}

}
