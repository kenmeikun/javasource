package event;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;
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
public class KeyEventTest1 extends JFrame implements KeyListener {
	private JPanel panel;
	private JTextField textField;
	private JTextArea textArea;

	public KeyEventTest1() {
		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 2));

		panel.add(new Label("문자를 입력하세요"));

		textField = new JTextField(10);
		textField.addKeyListener(this);
		panel.add(textField);

		textArea = new JTextArea(3, 30);

		getContentPane().add(panel, BorderLayout.NORTH);
		getContentPane().add(textArea, BorderLayout.CENTER);

		setTitle("키 이벤트");
		setSize(400, 200);
		setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		display(e, "keyTyped:");

	}

	@Override
	public void keyPressed(KeyEvent e) {
		display(e, "keyPressed:");

	}

	@Override
	public void keyReleased(KeyEvent e) {
		display(e, "keyReleased:");

	}

	protected void display(KeyEvent e, String str) {
		char keyChar = e.getKeyChar();//키 문자값
		int keyCode = e.getKeyCode();//키 코드값

		String modifiers = "Alt:" + e.isAltDown() + "Ctrl:" + e.isControlDown() + "shift:" + e.isShiftDown();
		textArea.append(str + "문자:" + keyChar + "(코드:" + keyCode + ")" + modifiers + "\n");
	}

	public static void main(String[] args) {
		new KeyEventTest1();

	}

}
