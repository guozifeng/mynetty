package com.guo.offer.testdatatype;

/**
 * ��ӡ������AB B �뿴����������䣺 String x = "abc"; String y = new String("abcd");
 * 
 * ����������һ���ڴ�ķ����������ͼ��
 * 
 * ���Կ�����x��y����ջ�У����Ǳ�������Ӧ��������á���һ�����û���ڶ��з����ڴ棬
 * ���ǽ���abc�������ڳ������С����ڵڶ�����䣬ͬ�����ڳ���������һ����abcd�����ַ�������newʱ��
 * �´��һ�ݸ��ַ�����ŵ����У�����yָ���˶��е��Ǹ���abcd���ַ�������֪��polaris��û�н����ס�
 * ����������ˣ���ô��ǰ�����������ûʲô�����ˡ� ��Ϊ��AB B
 * ����a\b\x\y�д洢����StringBuffer���������ö�����һ��StringBuffer����
 * ���ݷǻ������Ͳ�������Ϊ���ô��ݵĹ���operate���յĲ���ֻ��StringBuffer���������.
 * ��˿������Ϊx��a����ָ��ͬһ������;b��yҲ��ָ��ͬһ��StringBuffer����
 * ����x.append(y)������x��aָͬ��StringBuffer����ı䣨����"B"����
 * ��y=xֻ���ñ���y�ı�ָ��Ϊ��x��ͬ��StringBuffer���� ��yԭ����ָ�Ķ��󲢲��ᷢ���κθı䡣
 * ����StringBuffer�����ô��ݴ��ݵ��ǵ�ַ
 * 
 * ��String ��ȻҲ�Ƕ��󣬵���ʵfinal���͵������൱��ֵ����
 * 
 * @author Administrator
 *
 */
public class TestStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer a = new StringBuffer("A");
		StringBuffer b = new StringBuffer("B");
		append(a, b);
		System.out.println(a + " " + b);
	}

	public static void append(StringBuffer a, StringBuffer b) {
		a.append(b);
		b = a;
		System.out.println(a + " " + b);
	}
}
