package day14_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x,y, result;
		System.out.println("수 입력");
		x = input.nextInt();
		y = input.nextInt();
		try {
			result = x/y;
			System.out.println("x / y = "+result);
		}catch(ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("0으로는 나눌 수 없습니다");
		}catch(InputMismatchException e) {
		System.out.println(" 다음 문장들 실행");
	}
		System.out.println("다음 문장들 실행");
}
}