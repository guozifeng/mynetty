package com.guo.offer.outofmemory;

import java.util.ArrayList;
import java.util.List;

/**
 * VM Args��-XX:PermSize=10M -XX:MaxPermSize=10M
 * 
 * @author zzm
 * 
 * �����ɵ��ַ����ڶ����������eden���������ô�ûʲô��ϵ�� 1.7�汾
 */
public class RuntimeConstantPoolOOM {

	public static void main(String[] args) {
		// ʹ��List�����ų��������ã�����Full GC���ճ�������Ϊ
		List<String> list = new ArrayList<String>();
		// 10MB��PermSize��integer��Χ���㹻����OOM��
		int i = 0;
		while (true) {
			list.add(String.valueOf(i++).intern());
		}
	}
}
