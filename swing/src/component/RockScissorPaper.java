package component;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RockScissorPaper extends JFrame implements ActionListener {

	private JTextField textField;
	private JButton btnRock, btnPaper, btnScissor;

	static final int ROCK = 0;
	static final int PAPER = 1;
	static final int SCISSOR = 2;

	public RockScissorPaper() {

		setTitle("가위바위보 게임");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// 현재 contentPane 가져오기
		Container contentpane = getContentPane();

		// 상단 메시지 출력
		JLabel label = new JLabel("아래의 버튼 중에서 하나를 클릭하시오");
		label.setFont(new Font("굴림", Font.BOLD, 18));
		contentpane.add(label, BorderLayout.NORTH);
		// add(label,BorderLayout.NORTH);

		// 가운데 이미지 출력
		// jpanel 을 center에 부착=> jpanel을 gridlayout 변경 =>버튼 3개 부착
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 3));

		btnRock = new JButton();
		btnRock.setIcon(new ImageIcon(RockScissorPaper.class.getResource("/component/rock.png")));
		btnRock.setActionCommand("rock");
		btnRock.addActionListener(this);
		panel.add(btnRock);

		btnPaper = new JButton();
		btnPaper.setIcon(new ImageIcon(RockScissorPaper.class.getResource("/component/paper.png")));
		btnPaper.setActionCommand("paper");
		btnPaper.addActionListener(this);
		panel.add(btnPaper);

		btnScissor = new JButton();
		btnScissor.setIcon(new ImageIcon(RockScissorPaper.class.getResource("/component/scissor.png")));
		btnScissor.setActionCommand("scissor");
		btnScissor.addActionListener(this);
		panel.add(btnScissor);

		contentpane.add(panel, BorderLayout.CENTER);

		// 하단 이미지 출력
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.BOLD, 18));
		contentpane.add(label, BorderLayout.SOUTH);

		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new RockScissorPaper();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 게임자가 누른 가위,바위,보 가져오기
		e.getActionCommand(); // rock,paper,scissor
		String cmd = e.getActionCommand();
		// 컴퓨터의 가위,바위,보 결정
		int computer = (int) (Math.random() * 3);
		// System.out.println(num);

		// 컴퓨터와 게임자 사이에서 누가 이겼는지 출력
		if (cmd.equals("rock")) {
			if (computer == ROCK) {
				textField.setText("비겼음. 다시 가위바위보");
			} else if (computer == SCISSOR) {
				textField.setText("내가이겼음");
			} else {
				textField.setText("컴퓨터가 이겼음");
			}
		} else if (cmd.equals("scissor")) {
			if (computer == ROCK) {
				textField.setText("짐 ㅠ");
			} else if (computer == SCISSOR) {
				textField.setText("비김");
			} else {
				textField.setText("이김");
			}
		} else {//보자기 낸경우
			if (computer == ROCK) {
				textField.setText("내가 이김 ㅋ");
			} else if (computer == SCISSOR) {
				textField.setText("컴터가이김");
			} else {
				textField.setText("비김");
			}
		}

	}
}
