package com.guo.offer.testdatatype;

/**
 * intern()������JDK1.6�е������ǣ� ����String s = new String("SEU_Calvin")��
 * �ٵ���s.intern()����ʱ����ֵ�����ַ���"SEU_Calvin"�� �����Ͽ����������������ûʲô�ô�����ʵ���ϣ���JDK1.6�������˸�С������
 * ����ַ��������Ƿ����"SEU_Calvin"��ôһ���ַ�����������ڣ��ͷ��س�����ַ�����
 * ��������ڣ��÷������"SEU_Calvin"��ӵ��ַ������У�Ȼ���ٷ����������á� Ȼ����JDK1.7��ȴ���������ģ���������ۡ�
 * 
 * 
 * 
 * 
 * 
 * @author Administrator
 *         http://blog.csdn.net/seu_calvin/article/details/52291082
 */

public class a {

	public static void main(String... args) {
		System.out.println("---------------1-----");
		String str2 = "SEUCalvin";// �¼ӵ�һ�д��룬���಻��
		String str1 = new String("SEU") + new String("Calvin");
		// String str1 = new String("SEUCalvin");
		// str1.intern();

		System.out.println(str1.intern() == str1); // false
		System.out.println(str1 == "SEUCalvin");// false
		System.out.println(str1.intern() == "SEUCalvin");// true

		System.out.println("---------------2-----");

		String s = new String("1");
		// s.intern();
		String s2 = "1";
		System.out.println("1" == s2);// true
		// 1.6��s ���ض��� s.intern()�����ַ���
		// 1.7��s ���ض��� s.intern()�����ַ���
		System.out.println(s == s2);// false
		System.out.println(s.intern() == s2);// true

		System.out.println("-------------3-------");

		// String s5 = "11";
		String s3 = new String("1") + new String("1");
		// s3.intern();
		String s4 = "11";
		// 1.6��s3 ���ض��� s3.intern()�����ַ���
		// 1.7��s3 �����ַ��� s3.intern()�����ַ���
		System.out.println("11" == s4);// true
		System.out.println(s3 == s4);// false
		System.out.println(s3.intern() == s4);// true
	}

}