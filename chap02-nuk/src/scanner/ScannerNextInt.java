package scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * https://teratail.com/questions/117784
 * try-catchの処理で何故か無限ループになる
 * @author user
 */
public class ScannerNextInt {

	public static void main(String[] args) {
		play();
	}
	
	public static void play() {
        int rounds = 0;
        Scanner scan = new Scanner( System.in);
        System.out.print( "ゲーム回数を入力してください:");
        try {
            rounds = scan.nextInt();
            System.out.println("ゲーム回数は " + rounds + " です");
        }
        catch (InputMismatchException e) {
        	e.printStackTrace();
        	System.out.println("数字ではありません");
        }
        catch ( Exception e) {
        	e.printStackTrace();
            System.out.println( "エラーです。");
        }
	}
}
