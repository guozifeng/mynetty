package com.guo.offer.testIoApp;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class a {

	public a() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		RandomAccessFile r = new RandomAccessFile("heihei.txt", "rw");

		r.writeChar('a');
		r.writeChar('b');
		r.writeChar('c');
		// �����ļ������ݲ���Ӧ����abc����?

		r.seek(2); // ָ��������a��.
		r.writeChar('d'); // �ļ���Ӧ���adbc,��ò�Ʋ�����ô����,����

		StringBuffer strBuf = new StringBuffer();
		r.seek(0); // ָ���س�ʼλ��
		strBuf.append(r.readChar());
		strBuf.append(r.readChar());
		strBuf.append(r.readChar());
		// strBuf.append(r.readChar());

		System.out.println(strBuf); // �����adc
	}

}
