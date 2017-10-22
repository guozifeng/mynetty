package com.guo.offer.pecs;

import java.util.ArrayList;
import java.util.List;

/**
 * ͨ���
 * 
 * �ڱ��ĵ�ǰ��Ĳ������Ѿ�˵���˷������͵������͵Ĳ�����ԡ�����Щʱ������ϣ���ܹ���ʹ����ͨ��������ʹ�÷������ͣ�
 * 
 * ��������һ�����Ͷ�������� ��������һ�����Ͷ�������� ��������һ�����Ͷ��������
 * 
 * ���磬���������кܶ����ӣ�ÿ�������ﶼװ�в�ͬ��ˮ����������Ҫ�ҵ�һ�ַ����ܹ�ͨ�õĴ����κ�һ��ˮ������ͨ�׵�˵����A��B�������ͣ�
 * ������Ҫ�ҵ�һ�ַ����ܹ���C<A>���͵�ʵ������һ��C<B>���͵�������
 * 
 * Ϊ��������ֲ�����������Ҫʹ�ô���ͨ�������չ���������������������������
 * 
 * 1 2 List<Apple> apples = new ArrayList<Apple>(); List<? extends Fruit> fruits
 * = apples; ��? extends���Ƿ������͵�����������Գ�Ϊ��ʵ��Apple��Fruit�������ͣ�List<Apple> �� List<?
 * extends Fruit> �������͡�
 * 
 * ��������һ�����Ͷ��������
 * 
 * ����������������һ��ͨ�����? super���������B������A�ĳ�����(������)����ôC<B> �� C<? super A> �������ͣ�
 * 
 * 1 2 List<Fruit> fruits = new ArrayList<Fruit>(); List<? super Apple> =
 * fruits; Ϊʲôʹ��ͨ���������е�ͨ��
 * 
 * ԭ�������Ѿ������ף�����������������µ��﷨�ṹ��
 * 
 * ? extends
 * 
 * ���������¿�����ڶ�����ʹ�õ�һ�����ӣ�����̸����Java���������������ԣ�
 * 
 * 1 2 3 Apple[] apples = new Apple[1]; Fruit[] fruits = apples; fruits[0] = new
 * Strawberry();
 * �������ǿ����ģ�������һ������ΪFruit�����Apple�������������Strawberry����󣬴�����Ա��룬��������ʱ�׳��쳣��
 * 
 * �������ǿ���ʹ��ͨ�������صĴ���ת���ɷ��ͣ���ΪApple��Fruit��һ�����࣬����ʹ��? extends ͨ������������ܽ�һ��List
 * <Apple>����Ķ��帳��һ��List<? extends Fruit>�������ϣ�
 * 
 * 1 2 3 List<Apple> apples = new ArrayList<Apple>(); List<? extends Fruit>
 * fruits = apples; fruits.add(new Strawberry());
 * ��Σ�����ͱ��벻��ȥ�ˣ�Java����������ֹ����һ��Fruit
 * list�����strawberry���ڱ���ʱ���Ǿ��ܼ�⵽����������ʱ�Ͳ���Ҫ���м����ȷ�����б�����벻���ݵ������ˡ�
 * ��ʹ����list�����Fruit����Ҳ���У�
 * 
 * 1 fruits.add(new Fruit()); ��û�а취������Щ����ʵ���㲻�ܹ���һ��ʹ����? extends�����ݽṹ��д���κε�ֵ��
 * 
 * ԭ��ǳ��ļ򵥣�����������룺���? extends T
 * ͨ������߱����������ڴ���һ������T�������ͣ������ǲ�֪����������;�����ʲô����Ϊû��ȷ����Ϊ�˱�֤���Ͱ�ȫ�����ǾͲ���������������κ��������͵����ݡ�
 * ��һ���棬��Ϊ����֪������������ʲô���ͣ�����������T�������ͣ��������ڶ�ȡ����ʱ����ȷ���õ���������һ��T���͵�ʵ����
 * 
 * 1 Fruit get = fruits.get(0); ? super
 * 
 * ʹ�� ? super ͨ���һ����ʲô������������ȿ��������
 * 
 * 1 2 List<Fruit> fruits = new ArrayList<Fruit>(); List<? super Apple> =
 * fruits; ���ǿ���fruitsָ�����һ��װ��Apple��ĳ�ֳ���(supertype)��List��ͬ���ģ����ǲ�֪��������ʲô���࣬
 * ������֪��Apple���κ�Apple�����඼���������ͼ��ݡ���Ȼ���δ֪�����ͼ���Apple��Ҳ��GreenApple�ĳ��࣬���ǾͿ���д�룺
 * 
 * 1 2 fruits.add(new Apple()); fruits.add(new GreenApple());
 * ������������������Apple�ĳ��࣬�������ͻᾯ���㣺
 * 
 * 1 2 fruits.add(new Fruit()); fruits.add(new Object());
 * ��Ϊ���ǲ�֪�����������ĳ��࣬����������ʵ���Ͳ�������롣
 * 
 * ��������ʽ���������ȡ����������ô�����أ������������ֻ��ȡ��Objectʵ������Ϊ���ǲ�֪�����྿����ʲô��������Ψһ�ܱ�֤��ֻ�����Ǹ�Object��
 * ��ΪObject���κ�Java���͵ĳ��ࡣ
 * 
 * ��ȡԭ���PECS����
 * 
 * �ܽ� ? extends �� the ? super ͨ��������������ǿ��Եó����½��ۣ�
 * 
 * ��������һ�������������ȡ���ݣ�ʹ�� ? extends ͨ��� �������Ѷ���д��һ�����ݽṹ�ʹ�� ? super ͨ���
 * ��������棬����ȡ���Ǿͱ���ͨ�����
 * 
 * @author Administrator
 *
 */
public class test {

	public static void main(String[] args) {
		Apple apple = new Apple();
		apple.setI(11);
		Fruit fruit = new Fruit();
		fruit.setA(12);
		GreenApple greenapple = new GreenApple();
		greenapple.setB(220);
		Strawberry strawberry = new Strawberry();
		strawberry.setC(23);
		Apple[] apples1 = new Apple[1];
		apples1[0] = apple;
		Fruit[] fruits = apples1;
		fruits[0] = new GreenApple();
		System.out.println(fruits[0]);

		List<Apple> apples = new ArrayList<Apple>();
		apples.add(apple);
		apples.add(greenapple);
		List<? extends Fruit> fruits1 = apples;
		fruits1.add(null);
		System.out.println("+++++++fruits1.size()++++++++" + fruits1.size());
		for (int j = 0; j < fruits1.size(); j++) {
			Apple get = (Apple) fruits1.get(j);
			System.out.println(get);
		}

		List<Fruit> fruits2 = new ArrayList<Fruit>();
		// fruits2.add(fruit);
		fruits2.add(apple);
		// fruits2.add(strawberry);
		List<? super Apple> a = fruits2;
		a.add(new GreenApple());
		a.add(new Apple());

		// a.add(new Strawberry());
		System.out.println("+++++++a.size()++++++++" + a.size());
		for (int i = 0; i < a.size(); i++) {
			Apple aaa = (Apple) a.get(i);
			System.out.println(aaa);
		}

	}

}
