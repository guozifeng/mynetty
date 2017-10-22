package com.guo.offer.testeasyapi;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * ����Random()�����ֹ��췽����
 * 
 * Random()������һ���µ��������������
 * 
 * Random(long seed)��ʹ�õ��� long ���Ӵ���һ���µ��������������
 * 
 * ���ǿ����ڹ���Random�����ʱ��ָ�����ӣ�����ָ�������к����ã���������¿������磺Random r1 = new Random(20);
 * 
 * ����Ĭ�ϵ�ǰϵͳʱ��ĺ�������Ϊ������:Random r1 = new Random();
 * 
 * ��Ҫ˵�����ǣ����ڴ���һ��Random�����ʱ����Ը�������һ���Ϸ�����������������ֻ������㷨����Դ���֣������ɵ������������û���κι�ϵ��
 * �������Java���룺
 * 
 * Random rand =new Random(25); int i; i=rand.nextInt(100);
 * ��ʼ��ʱ25��û����ֱ�����ã�ע�⣺����û�������ã�,rand.nextInt(100);�е�100�������������,�����������Ϊ0-100������,
 * ������100�� ����Math���е�random����
 * ��ʵ��Math����Ҳ��һ��random��������random�����Ĺ���������һ��[0,1.0)��������С����
 * ͨ���Ķ�Math���Դ������Է��֣�Math���е�random��������ֱ�ӵ���Random���е�nextDouble����ʵ�ֵġ�
 * ֻ��random�����ĵ��ñȽϼ򵥣����Ժܶ����Ա��ϰ��ʹ��Math���random����������������֡�
 * 
 * @author Administrator
 *
 */
public class testrandom {
	public static void main(String[] args) throws Exception {
		test1();
	}

	public static void test1() {
		System.out.println("Math.random()=" + Math.random());
		System.out.println("Math.random()=" + ((int) (Math.random() * 8) + 1));

		Random ran = new Random();
		System.out.println(ran.nextInt());// ����һ��int����ȡֵ��Χ�������
		System.out.println(ran.nextInt(100));// ����һ��0-100��int���͵������
		System.out.println(ran.nextFloat());// ����һ��Float���͵������
		System.out.println(ran.nextDouble());// ����һ��Double���͵������
		/*
		 * ���1�� -405998184 81 0.7216265 0.8820657901017879
		 */
		Random r2 = new Random(50);// ����Ϊ50�Ķ���
		Random r3 = new Random(50);// ����Ϊ50�Ķ���
		System.out.println("r2.nextInt():" + r2.nextInt(50) + "-------r3.nextInt():" + r3.nextInt(50));
		// �������Random������������ͬ����ô�������ɵĽ������һ��������ʹ�õ�ǰʱ����Ϊ���ӣ�System.currentTimeMillis()

		System.out.println("---------------���̻߳�����ʹ��ThreadLocalRandom�࣬�÷���Random���������---------------------");
		ThreadLocalRandom tlr = ThreadLocalRandom.current();
		System.out.println(tlr.nextInt(10, 50));// ����һ��10~50֮��������
	}
}
