package edu.wust.array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KeyInputArr {

	public static void main(String[] args) {
		KeyInputArr k=new KeyInputArr();
		k.run();

	}
	public void run() {
		int[] mid = new int[100];
		int numScores = 0;
		while (true) {
		int score = readInt("?");
		if (score == -1)break;
		mid[numScores++] = score;
		}
		for (int i = 0; i < numScores; i++) {
			System.out.println(i + ":" + mid[i]);
		}
		}
	private int readInt(String s) {
		int i = -1;
		if (s.equals("?")) {                   // 对象的等值比较，不用==
			System.out.println("?:");
		try {                                         //捕获异常
			i = new Scanner(System.in).nextInt();    // 获得键盘输入的int
		} catch (InputMismatchException e) {
				e.printStackTrace();}
		}
		return i;
		}
}
