package event;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//MouseListener
//mouseClicked(): 마우스가 컴포넌트를 클릭했을 때
//mousePressed(): 마우스 버튼이 눌러졌을 때
//mouseReleased(): 눌러진 버튼이 때어질떼
//mouseEntered() 마우스가 컴포넌트 위에올라갈때
//mouseExited //내려갈때

//MouseMotionListener
//mouseDragged 드래그되는동안
//mouseMoved  마우스가 움직이는동안
public class MouseEventTest1 extends JFrame implements MouseListener, MouseMotionListener {
	private JTextField textField;
	
	
	public MouseEventTest1() {
		setTitle("마우스 이벤트");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JButton btn = new JButton("클릭");
		btn.addMouseListener(this);
		add(btn, BorderLayout.NORTH);

		JTextArea textArea =new JTextArea(3,50);
		textArea.addMouseListener(this);
		textArea.addMouseMotionListener(this);
		add(textArea,BorderLayout.CENTER);
		
		 textField =new JTextField();
		 
		add(textField,BorderLayout.SOUTH);
		
		
		setSize(100, 100);
		setVisible(true);

	}

	public static void main(String[] args) {
		new MouseEventTest1();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouseClicked");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("mousePressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		textField.setText("mouseReleased");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		textField.setText("mouseEntered");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("mouseExited");
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("mouseDragged");

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("mouseMoved");

	}

}
