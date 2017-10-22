package com.guo.offer.testthread.deadthread;

import java.util.Date;

public class LockTest {
	public static String obj1 = "obj1";
	public static String obj2 = "obj2";

	public static void main(String[] args) {
		LockA la = new LockA();
		new Thread(la).start();
		LockB lb = new LockB();
		new Thread(lb).start();
	}
}

class LockA implements Runnable {
	public void run() {
		try {
			System.out.println(new Date().toString() + " LockA ��ʼִ��");
			while (true) {
				synchronized (LockTest.obj1) {
					System.out.println(new Date().toString() + " LockA ��ס obj1");
					Thread.sleep(3000); // �˴��ȴ��Ǹ�B����ס����
					synchronized (LockTest.obj2) {
						System.out.println(new Date().toString() + " LockA ��ס obj2");
						Thread.sleep(60 * 1000); // Ϊ���ԣ�ռ���˾Ͳ���
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class LockB implements Runnable {
	public void run() {
		try {
			System.out.println(new Date().toString() + " LockB ��ʼִ��");
			while (true) {
				synchronized (LockTest.obj2) {
					System.out.println(new Date().toString() + " LockB ��ס obj2");
					Thread.sleep(3000); // �˴��ȴ��Ǹ�A����ס����
					synchronized (LockTest.obj1) {
						System.out.println(new Date().toString() + " LockB ��ס obj1");
						Thread.sleep(60 * 1000); // Ϊ���ԣ�ռ���˾Ͳ���
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}