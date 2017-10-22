package com.guo.offer.testthread.threadstatus;

public class TestVolatile {

	public static void main(String[] args) {

		ThreadDemo td = new ThreadDemo();
		new Thread(td).start();

		while (true) {
			if (td.getFlag()) {
				System.out.println("���߳�flag:" + td.getFlag());
				break;
			}
		}
	}
}

class ThreadDemo implements Runnable {
	// �������
	private volatile boolean flag = false;

	public boolean getFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	@Override
	public void run() {

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}

		flag = true;

		System.out.println("�����߳�flag=" + getFlag());
	}
}