package com.guo.offer.commons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testToArray {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>(2);
		list.add("guan");
		list.add("bao");
		String[] array = new String[list.size()];
		array = list.toArray(array);
		System.out.println(array[0]);
		System.out.println(array[1]);
		
		
		/**
		 * ֱ��ʹ�� toArray �޲η����������⣬�˷�������ֵֻ���� Object[]�࣬��ǿת����
		 * �������齫���� ClassCastException ����
		 */
		Object[] array1 = new String[list.size()];
		array1 = (Object[]) list.toArray();
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		
	}

}
