package arrays;

import java.util.Arrays;

public class ArraysEx1 {
	/*
	 * arrays:배열을 다루느느데 유용한 메서드 제공 배열복사,배열 치우기,배열의 ㅈ정렬,검색,문자열 비교,출력 배열을 리스트로 변환
	 */

	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4 };
		int[][] arr2 = { { 11, 12, 13 }, { 21, 22, 23 } };
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2));
	}// main

}
