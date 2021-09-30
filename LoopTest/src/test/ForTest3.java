package test;

public class ForTest3 {

	public static void main(String[] args) {
		// ±¸±¸´Ü
		int i = 0;
		int j = 0;
		for (i = 1; i < 10; i++) {
			System.out.println("");
			for (j = 1; j < 10; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
				System.out.printf("%d*%d=%d\n",i,j,(i*j));
			}
		}

	}

}
