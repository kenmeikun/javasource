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
//keyevent �� �����Ѵ� ������
//keyevent �� ��Ŀ���� ���� ������Ʈ������ �߻�
//keyTyped ����Ű�� �������¼��� ȣ��(��,�����ڵ常)
//keyPressed Ű�������¼��� �߻�
//keyReleased Ű�� ���¼���
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
