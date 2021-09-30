package exam;

import java.util.Scanner;

public class BankApplication {

	private static Account accountArray[] = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------");
			System.out.println("1. ���»��� |2. ���¸�� |3. ���� |4. ��� |5. ����");
			System.out.println("----------------------------------------------");
			System.out.println("����>");

			int selectNo = scanner.nextInt();
			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		} // while
		System.out.println("���α׷�����");
	}// mian

	// ���� ����
	private static void createAccount() {
		// �迭���� ��� �ִ��� Ȯ��

		// �������� ������� �Է°��� ������� ��ü ���� ����ִ� �迭�� ���
		// ���¹�ȣ �ޱ�,������,�ܾ�
		System.out.println("���¹�ȣ:");
		String ano = scanner.next();
		System.out.println("������:");
		String owner = scanner.next();
		System.out.println("�ܾ�:");
		int balance = scanner.nextInt();
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = new Account(ano, owner, balance);
				System.out.println("���°� �����Ǿ����ϴ�.");
				break;
			}

		}

	}

	// ���� ��� ����
	private static void accountList() {
		// accountarray�� ���� �ƴ� �κи� ���
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.printf("%s\t%s\t%d\n", accountArray[i].getAno(), accountArray[i].getOwner(),
						accountArray[i].getBalance());

			}

		}
	}

	// �����ϱ�
	private static void deposit() {
		System.out.print("�Աݰ����Է�:");
		String ano = scanner.next();
		// �Ա��� ���¹�ȣ�� �Է¹ޱ�
		Account account = findAccount(ano);

		// �Ա��ϱ�
		if (account != null) {
			System.out.println("�Աݾ�:");
			int amount = scanner.nextInt();
			account.setBalance(account.getBalance() + amount);
		} else {
			System.out.println("�Աݰ��¸� Ȯ�����ּ���");
		}

	}

// ����ϱ�
	private static void withdraw() {
		System.out.print("��ݰ����Է�:");
		String ano = scanner.next();
		// �Ա��� ���¹�ȣ�� �Է¹ޱ�
		Account account = findAccount(ano);

		// �Ա��ϱ�
		if (account != null) {
			System.out.println("��ݾ�:");
			int amount = scanner.nextInt();
			account.setBalance(account.getBalance() - amount);
		} else {
			System.out.println("��ݰ��¸� Ȯ�����ּ���");
		}

	}

	// account �迭���� ano �� ������ account ��ü ã��
	private static Account findAccount(String ano) {

		Account account = null;
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				if (ano.equals(accountArray[i].getAno())) {
					account = accountArray[i];
					break;
				}
			}

		}

		return account;
	}
}
