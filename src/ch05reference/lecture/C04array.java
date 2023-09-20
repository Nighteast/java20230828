package ch05reference.lecture;

import java.util.Arrays;

public class C04array {
	public static void main(String[] arg) {
		int a = 5;
		int b = a;

		System.out.println(a);
		System.out.println(b);

		int[] c = { 3, 4, 5 };
		int[] d = c;
		
		System.out.println(c[1]); //4
		System.out.println(d[1]); //4
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
		
		c[2] = 55;
		
		System.out.println(c[2]); //55
		System.out.println(d[2]); //55
		
		int[] e;
		e = new int[5];
		e[0] = 1;
		e[1] = 2;
		e[2] = 3;
		
		System.out.println(Arrays.toString(e));
		
		
		
	}

}
