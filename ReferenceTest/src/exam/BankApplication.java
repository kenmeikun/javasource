package exam;

import java.util.Scanner;

public class BankApplication {

	private static Account accountArray[] = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------");
			System.out.println("1. 계좌생성 |2. 계좌목록 |3. 예금 |4. 출금 |5. 종료");
			System.out.println("----------------------------------------------");
			System.out.println("선택>");

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
		System.out.println("프로그램종료");
	}// mian

	// 계좌 생성
	private static void createAccount() {
		// 배열에서 비어 있는지 확인

		// 비여있으면 사용자의 입력값을 기반으로 객체 생성 비어있는 배열에 담기
		// 계좌번호 받기,계좌주,잔액
		System.out.println("계좌번호:");
		String ano = scanner.next();
		System.out.println("계좌주:");
		String owner = scanner.next();
		System.out.println("잔액:");
		int balance = scanner.nextInt();
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = new Account(ano, owner, balance);
				System.out.println("계좌가 생성되었습니다.");
				break;
			}

		}

	}

	// 계좌 목록 보기
	private static void accountList() {
		// accountarray가 널이 아닌 부분만 출력
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.printf("%s\t%s\t%d\n", accountArray[i].getAno(), accountArray[i].getOwner(),
						accountArray[i].getBalance());

			}

		}
	}

	// 예금하기
	private static void deposit() {
		System.out.print("입금계좌입력:");
		String ano = scanner.next();
		// 입금할 계좌번호를 입력받기
		Account account = findAccount(ano);

		// 입금하기
		if (account != null) {
			System.out.println("입금액:");
			int amount = scanner.nextInt();
			account.setBalance(account.getBalance() + amount);
		} else {
			System.out.println("입금계좌를 확인해주세요");
		}

	}

// 출금하기
	private static void withdraw() {
		System.out.print("출금계좌입력:");
		String ano = scanner.next();
		// 입금할 계좌번호를 입력받기
		Account account = findAccount(ano);

		// 입금하기
		if (account != null) {
			System.out.println("출금액:");
			int amount = scanner.nextInt();
			account.setBalance(account.getBalance() - amount);
		} else {
			System.out.println("출금계좌를 확인해주세요");
		}

	}

	// account 배열에서 ano 와 동일한 account 객체 찾기
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
