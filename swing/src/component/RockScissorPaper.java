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

		setTitle("���������� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// ���� contentPane ��������
		Container contentpane = getContentPane();

		// ��� �޽��� ���
		JLabel label = new JLabel("�Ʒ��� ��ư �߿��� �ϳ��� Ŭ���Ͻÿ�");
		label.setFont(new Font("����", Font.BOLD, 18));
		contentpane.add(label, BorderLayout.NORTH);
		// add(label,BorderLayout.NORTH);

		// ��� �̹��� ���
		// jpanel �� center�� ����=> jpanel�� gridlayout ���� =>��ư 3�� ����
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

		// �ϴ� �̹��� ���
		textField = new JTextField();
		textField.setFont(new Font("����", Font.BOLD, 18));
		contentpane.add(label, BorderLayout.SOUTH);

		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new RockScissorPaper();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// �����ڰ� ���� ����,����,�� ��������
		e.getActionCommand(); // rock,paper,scissor
		String cmd = e.getActionCommand();
		// ��ǻ���� ����,����,�� ����
		int computer = (int) (Math.random() * 3);
		// System.out.println(num);

		// ��ǻ�Ϳ� ������ ���̿��� ���� �̰���� ���
		if (cmd.equals("rock")) {
			if (computer == ROCK) {
				textField.setText("�����. �ٽ� ����������");
			} else if (computer == SCISSOR) {
				textField.setText("�����̰���");
			} else {
				textField.setText("��ǻ�Ͱ� �̰���");
			}
		} else if (cmd.equals("scissor")) {
			if (computer == ROCK) {
				textField.setText("�� ��");
			} else if (computer == SCISSOR) {
				textField.setText("���");
			} else {
				textField.setText("�̱�");
			}
		} else {//���ڱ� �����
			if (computer == ROCK) {
				textField.setText("���� �̱� ��");
			} else if (computer == SCISSOR) {
				textField.setText("���Ͱ��̱�");
			} else {
				textField.setText("���");
			}
		}

	}
}
