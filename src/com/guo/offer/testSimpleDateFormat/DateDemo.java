package com.guo.offer.testSimpleDateFormat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		test5();
	}

	public static void test1() {
		Date date = new Date();
		String strDateFormat = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
		System.out.println(sdf.format(date));
	}
	
	public static void test5() {
		try {
			System.out.println(DateUtil.parse("10-10-2017"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void test2() {
		SimpleDateFormat sdf = new SimpleDateFormat();// ��ʽ��ʱ��
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");// aΪam/pm�ı��
		Date date = new Date();// ��ȡ��ǰʱ��
		System.out.println("����ʱ�䣺" + sdf.format(date));
	}

	public static void test3() {
		Long timeStamp = System.currentTimeMillis(); // ��ȡ��ǰʱ���
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp)))); // ʱ���ת����ʱ��
		System.out.println(sd);
	}

	public static void test4() {
		Calendar cal = Calendar.getInstance();
		int day = cal.get(Calendar.DATE);
		int month = cal.get(Calendar.MONTH) + 1;
		int year = cal.get(Calendar.YEAR);
		int dow = cal.get(Calendar.DAY_OF_WEEK);
		int dom = cal.get(Calendar.DAY_OF_MONTH);
		int doy = cal.get(Calendar.DAY_OF_YEAR);

		System.out.println("����ʱ��: " + cal.getTime());
		System.out.println("����: " + day);
		System.out.println("�·�: " + month);
		System.out.println("���: " + year);
		System.out.println("һ�ܵĵڼ���: " + dow); // ������Ϊһ�ܵĵ�һ�����Ϊ 1������һ���Ϊ 2���Դ�����
		System.out.println("һ���еĵڼ���: " + dom);
		System.out.println("һ��ĵڼ���: " + doy);
	}
}
