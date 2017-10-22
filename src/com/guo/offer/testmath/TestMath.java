package com.guo.offer.testmath;

/**
 * 
 * Math�����ṩ��������ȡ���йصķ�����ceil,floor,round, ��Щ���������������ǵ�Ӣ�����Ƶĺ������Ӧ��
 * ���磺ceil��Ӣ���������컨�壬�÷����ͱ�ʾ����ȡ���� Math.ceil��11.3���Ľ��Ϊ12��
 * Math.ceil(-11.6)�Ľ��Ϊ-11��
 * floor��Ӣ���ǵذ壬�÷����ͱ�ʾ����ȡ����Math.floor(11.6)�Ľ����11�� 
 * Math.floor(-11.4)�Ľ��-12��
 * �������յ���round����������ʾ���������롱�� �㷨ΪMath.floor(x+0.5),
 * ����ԭ�������ּ���0.5��������ȡ����
 * ���ԣ�Math.round(11.5)�Ľ����12��Math.round(-11.5)�Ľ��Ϊ-11. 
 * Math.round( * )���������Ĺ��ɣ�С��������5ȫ���ӣ�����5�����ӣ�С��5ȫ���ӡ� 
 * �����ǿ���JDK��˵���� (1)public static long
 * round(double a) returns the closest long to the argument. the result is
 * rounded to an integer by adding 1/2, taking the floor of the result, and
 * casting the result to type long. in other words, the result is equal to the
 * value of the expression:
 * 
 * (long)math.floor(a + 0.5d)
 * 
 * (2)public static double floor(double a) returns the largest(closest to
 * positive infinity) double value that is not greater than the argument and is
 * equal to a mathematical integer.special cases: if the argument value is
 * already equal to a mathematical integer, then the result is the same as the
 * argument. if the argument is nan or an infinity or positive zero or negative
 * zero, then the result is the same as the argument.
 * 
 * parameters: a - a value. returns: the smallest (closest to negative infinity)
 * floating-point value that is not less than the argument and is equal to a
 * mathematical integer.
 * 
 * @author Administrator
 *
 */
public class TestMath {

	public TestMath() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		test1();
		test2();
	}
	public static void test1(){
		
		int i = 0;
		for (int j = 0; j < 10; j++) {
			i = i++;
		}
		System.out.println("i�������" + i);

		int temp = i;
		// ������
		i = i++;
		System.out.println("i�������" + temp);
		
	}
	public static void test2(){
		System.out.println(Math.round(-11.52));

		// Math.round():Java�е��������뺯��

		System.out.println("Case1��С������һλ = 5");

		System.out.println("������Math.round(11.5) = " + Math.round(11.5));// 12

		System.out.println("������Math.round(-11.5) = " + Math.round(-11.5));// -11

		System.out.println("Case2��С������һλ < 5");

		System.out.println("������Math.round(11.49) = " + Math.round(11.49));// 11

		System.out.println("������Math.round(-11.49) = " + Math.round(-11.49));// -11

		System.out.println("Case3��С������һλ > 5");

		System.out.println("������Math.round(11.69) = " + Math.round(11.69));// 12

		System.out.println("������Math.round(-11.69) = " + Math.round(-11.69));// -12

		System.out.println("���ۣ�����С��������5���λ������С�����С���Լ�����5����ȥ������5�����λ");

		System.out.println("Ҳ����˵��С��������5ȫ���ӣ�����5�����ӣ�С��5ȫ����");
	}
	public static void test20(){
		System.out.println("90 �ȵ�����ֵ��" + Math.sin(Math.PI / 2));
		System.out.println("0�ȵ�����ֵ��" + Math.cos(0));
		System.out.println("60�ȵ�����ֵ��" + Math.tan(Math.PI / 3));
		System.out.println("1�ķ�����ֵ�� " + Math.atan(1));
		System.out.println("��/2�ĽǶ�ֵ��" + Math.toDegrees(Math.PI / 2));
		System.out.println(Math.PI);
	}
}
