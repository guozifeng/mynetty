package com.guo.offer.testdatatype;

/**
 * 
 * @author Administrator
 *
 */
public class b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * jdk1.7 �ַ��������ش��ھͷ��ض��󣬲����ھͷ��ضѶ�������á�
		 */
		// String str2 = "SEUCalvin";//�¼ӵ�һ�д��룬���಻��
		String str1 = new String("SEU") + new String("Calvin");
		System.out.println(str1.intern() == str1);
		System.out.println(str1 == "SEUCalvin");
		// System.out.println(str1.intern() == str1);
		System.out.println(str1.intern() == "SEUCalvin");
	}

}
