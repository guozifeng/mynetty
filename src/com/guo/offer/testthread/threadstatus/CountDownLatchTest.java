package com.guo.offer.testthread.threadstatus;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ��һЩӦ�ó����У���Ҫ�ȴ�ĳ�������ﵽҪ����������������飻ͬʱ���̶߳���ɺ�Ҳ�ᴥ���¼����Ա���к���Ĳ�����
 * ���ʱ��Ϳ���ʹ��CountDownLatch��CountDownLatch����Ҫ�ķ�����countDown()��await()��
 * ǰ����Ҫ�ǵ���һ�Σ�
 * �����ǵȴ�������0�����û�е���0����ֻ�������ȴ��ˡ�
 * 
 * @author Administrator
 *
 */

public class CountDownLatchTest {

	// ģ����100�����ܣ�10��ѡ���Ѿ�׼��������ֻ�Ȳ���һ�����¡��������˶������յ�ʱ������������
	public static void main(String[] args) throws InterruptedException {

		// ��ʼ�ĵ�����
		final CountDownLatch begin = new CountDownLatch(1);

		// �����ĵ�����
		final CountDownLatch end = new CountDownLatch(10);

		// ʮ��ѡ��
		final ExecutorService exec = Executors.newFixedThreadPool(10);

		for (int index = 0; index < 10; index++) {
			final int NO = index + 1;
			Runnable run = new Runnable() {
				public void run() {
					try {
						// �����ǰ����Ϊ�㣬��˷����������ء�
						// �ȴ�
						begin.await();
						Thread.sleep((long) (Math.random() * 10000));
						System.out.println("No." + NO + " arrived");
					} catch (InterruptedException e) {
					} finally {
						// ÿ��ѡ�ֵ����յ�ʱ��end�ͼ�һ
						end.countDown();
					}
				}
			};
			exec.submit(run);
		}
		System.out.println("Game Start");
		// begin��һ����ʼ��Ϸ
		begin.countDown();
		// �ȴ�end��Ϊ0��������ѡ�ֵ����յ�
		end.await();
		System.out.println("Game Over");
		exec.shutdown();
	}
}