package event;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//keylistener
//keyevent 를 감지한느 리스너
//keyevent 는 포커스를 가진 컴포넌트에서만 발생
//keyTyped 누른키가 떨어지는순간 호출(단,유니코드만)
//keyPressed 키를누르는순간 발생
//keyReleased 키를 때는순간
public class KeyEventTest2 extends JFrame {
	private JPanel panel;
	private JTextField textField;
	private JTextArea textArea;

	public KeyEventTest2() {
		
	}

	protected void display(KeyEvent e, String str) {
	
	
	}
		

	public static void main(String[] args) {
		new KeyEventTest2();

	}

	class MyKeyListnener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			display(e,"keyPressed:");
		}
	}

}
