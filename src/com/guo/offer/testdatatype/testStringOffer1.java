package com.guo.offer.testdatatype;

/**
 * true Ҫ˵��һ�㣺�������ַ�������ֵ����ʱ����ӣ����õ������ַ�����Ȼ���ַ�������ֵ�������ڳ������С�
 * 
 * @author Administrator
 *
 */
public class testStringOffer1 {
	private static String a = "ab";
	private static String a1 = new String("ab");

	public static void main(String[] args) {

	}

	public static void test1() {
		String a = "a1";
		String b = "a" + 1;
		System.out.println(a == b);
	}

	public static void test2() {
		String a = "ab";
		String bb = "b";
		String b = "a" + bb;
		System.out.println(a == b);
	}

	public static void test3() {
		String a = "ab";
		final String bb = "b";
		String b = "a" + bb;
		System.out.println(a == b);
	}

	public static void test4() {
		String a = "ab";
		final String bb = getBB();
		String b = "a" + bb;
		System.out.println(a == b);
	}

	public static void test5() {
		String s1 = "a";
		String s2 = "b";
		String s = s1 + s2;
		System.out.println(s == a);
		System.out.println(s.intern() == a);
	}

	public static void test6() {
		String s1 = "a";
		String s2 = "b";
		String s = s1 + s2;
		System.out.println(s == a1);
		System.out.println(s.intern() == a1);
		System.out.println(s.intern() == a1.intern());
	}

	private static String getBB() {
		return "b";
	}
}
