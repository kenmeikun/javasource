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
//keyevent �� �����Ѵ� ������
//keyevent �� ��Ŀ���� ���� ������Ʈ������ �߻�
//keyTyped ����Ű�� �������¼��� ȣ��(��,�����ڵ常)
//keyPressed Ű�������¼��� �߻�
//keyReleased Ű�� ���¼���
public class KeyEventTest1 extends JFrame implements KeyListener {
	private JPanel panel;
	private JTextField textField;
	private JTextArea textArea;

	public KeyEventTest1() {
		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 2));

		panel.add(new Label("���ڸ� �Է��ϼ���"));

		textField = new JTextField(10);
		textField.addKeyListener(this);
		panel.add(textField);

		textArea = new JTextArea(3, 30);

		getContentPane().add(panel, BorderLayout.NORTH);
		getContentPane().add(textArea, BorderLayout.CENTER);

		setTitle("Ű �̺�Ʈ");
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
		char keyChar = e.getKeyChar();//Ű ���ڰ�
		int keyCode = e.getKeyCode();//Ű �ڵ尪

		String modifiers = "Alt:" + e.isAltDown() + "Ctrl:" + e.isControlDown() + "shift:" + e.isShiftDown();
		textArea.append(str + "����:" + keyChar + "(�ڵ�:" + keyCode + ")" + modifiers + "\n");
	}

	public static void main(String[] args) {
		new KeyEventTest1();

	}

}
