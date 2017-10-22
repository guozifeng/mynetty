package com.guo.offer.testthread.threadstatus;

public class ThreadInterrupt extends Thread {
	public void run() {
		try {
			sleep(50000); // �ӳ�50��
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) throws Exception {
		Thread thread = new ThreadInterrupt();
		thread.start();
		System.out.println("��50��֮�ڰ�������ж��߳�!");
		System.in.read();
		thread.interrupt();
		thread.join();
		System.out.println("�߳��Ѿ��˳�!");
	}
}