package com.guo.offer.testutils;

import java.util.Arrays;

public class testArraysSort {

	public testArraysSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// �����ʼ��
		int[] a = { 3, 5, 2, 1, 8, 6, 9, 4, 0 };
		// ����
		Arrays.sort(a);
		// �������֮��Ľ��
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
