package com.guo.offer.testthread.deadthread;

import java.util.Date;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class UnLockTest {
	public static String obj1 = "obj1";
	public static final Semaphore a1 = new Semaphore(1);
	public static String obj2 = "obj2";
	public static final Semaphore a2 = new Semaphore(1);

	public static void main(String[] args) {
		LockAa la = new LockAa();
		new Thread(la).start();
		LockBb lb = new LockBb();
		new Thread(lb).start();
	}
}

class LockAa implements Runnable {
	public void run() {
		try {
			System.out.println(new Date().toString() + " LockA ��ʼִ��");
			while (true) {
				if (UnLockTest.a1.tryAcquire(1, TimeUnit.SECONDS)) {
					System.out.println(new Date().toString() + " LockA ��ס obj1");
					if (UnLockTest.a2.tryAcquire(1, TimeUnit.SECONDS)) {
						System.out.println(new Date().toString() + " LockA ��ס obj2");
						Thread.sleep(60 * 1000); // do something
					} else {
						System.out.println(new Date().toString() + "LockA �� obj2 ʧ��");
					}
				} else {
					System.out.println(new Date().toString() + "LockA �� obj1 ʧ��");
				}
				UnLockTest.a1.release(); // �ͷ�
				UnLockTest.a2.release();
				Thread.sleep(1000); // ���Ͻ��г��ԣ���ʵ�����do something�ǲ�ȷ����
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class LockBb implements Runnable {
	public void run() {
		try {
			System.out.println(new Date().toString() + " LockB ��ʼִ��");
			while (true) {
				if (UnLockTest.a2.tryAcquire(1, TimeUnit.SECONDS)) {
					System.out.println(new Date().toString() + " LockB ��ס obj2");
					if (UnLockTest.a1.tryAcquire(1, TimeUnit.SECONDS)) {
						System.out.println(new Date().toString() + " LockB ��ס obj1");
						Thread.sleep(60 * 1000); // do something
					} else {
						System.out.println(new Date().toString() + "LockB �� obj1 ʧ��");
					}
				} else {
					System.out.println(new Date().toString() + "LockB �� obj2 ʧ��");
				}
				UnLockTest.a1.release(); // �ͷ�
				UnLockTest.a2.release();
				Thread.sleep(10 * 1000); // ����ֻ��Ϊ����ʾ������tryAcquireֻ��1�룬����BҪ��A�ó���ִ�е�ʱ�䣬����������Զ������
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}