package type;

public class TypeChange2 {
	public static void main(String s[]) {
	    int  b = 8;                     // 0000 1000
	    System.out.println(b >> 1);     // 0000 0100
	    System.out.println(b >> 2);     // 0000 0010
	    System.out.println(b >> 3);     // 0000 0001
	    System.out.println(b >> 4);     // 0000 0000
	    System.out.println(b >> 31);    // 0000 0000
	    System.out.println(b >> 32);    // 0000 1000
	    // 左側のオペランドが int の場合
	    // 右側のオペランド(32) の下位５ビットのみがシフト距離として使用される
	    // 32 は 0010 0000 であるので、シフト距離は 0 となる
	}
}
// Java right shift integer by 32 [duplicate]
// https://stackoverflow.com/questions/32648097/java-right-shift-integer-by-32
