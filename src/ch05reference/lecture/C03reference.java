package ch05reference.lecture;

public class C03reference {
	public static void main(String[] args) {
		int a = 5;
		int b = a;

		String c = "java";
		String d = c;

		System.out.println(a == b);
		System.out.println(c == d);

	}
}
