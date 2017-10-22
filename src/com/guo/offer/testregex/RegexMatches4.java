package com.guo.offer.testregex;

/**
 * �÷�˵����

String replaceAll(String replacement) 
��Ŀ���ַ����������ģʽ��ƥ����Ӵ�ȫ���滻Ϊָ�����ַ����� 
String replaceFirst(String replacement) 
��Ŀ���ַ������һ�������ģʽ��ƥ����Ӵ��滻Ϊָ�����ַ�����

appendReplacement(StringBuffer sb, String replacement) 
����ǰƥ���Ӵ��滻Ϊָ���ַ��������ҽ��滻����Ӵ��Լ���֮ǰ���ϴ�ƥ���Ӵ�֮����ַ���
����ӵ�һ��StringBuffer�������appendTail(StringBuffer sb) 
���������һ��ƥ�乤����ʣ����ַ�����ӵ�һ��StringBuffer����� 
���磬���ַ���fatcatfatcatfat,�������������ʽģʽΪ"cat"��
��һ��ƥ������appendReplacement(sb,"dog"),
��ô��ʱStringBuffer sb������Ϊfatdog��
Ҳ����fatcat�е�cat���滻Ϊdog������ƥ���Ӵ�ǰ�����ݼӵ�sb�
���ڶ���ƥ������appendReplacement(sb,"dog")��
��ôsb�����ݾͱ�Ϊfatdogfatdog���������ٵ���һ��appendTail��sb��,
��ôsb���յ����ݽ���fatdogfatdogfat�� 
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches4 {
	private static String REGEX = "a+b";
	private static String INPUT = "aabfooaabfooabfoob";
	private static String REPLACE = "-111-";

	public static void main(String[] args) {
		Pattern p = Pattern.compile(REGEX);
		// ��ȡ matcher ����
		Matcher m = p.matcher(INPUT);
		StringBuffer sb = new StringBuffer();
		while (m.find()) {
			m.appendReplacement(sb, REPLACE);
			// System.out.println(sb);
		}
		System.out.println(sb.toString());
		m.appendTail(sb);
		System.out.println(sb.toString());
	}
}