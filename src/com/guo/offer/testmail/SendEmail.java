package com.guo.offer.testmail;

import java.security.GeneralSecurityException;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import com.sun.mail.util.MailSSLSocketFactory;

public class SendEmail {
	public static void main(String[] args) {

		// �ռ��˵�������
		String to = "guozifengjian@qq.com";

		// �����˵�������
		String from = "602394902@qq.com";

		// ָ�������ʼ�������Ϊ smtp.qq.com
		String host = "smtp.qq.com"; // QQ �ʼ�������

		// ��ȡϵͳ����
		Properties properties = System.getProperties();

		// �����ʼ�������
		properties.setProperty("mail.smtp.host", host);

		properties.put("mail.smtp.auth", "true");
		MailSSLSocketFactory sf = null;
		try {
			sf = new MailSSLSocketFactory();
		} catch (GeneralSecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sf.setTrustAllHosts(true);

		properties.put("mail.smtp.auth", "true");
		properties.setProperty("mail.user", "guozifengjian@qq.com");
		properties.setProperty("mail.password", "abcd1234++");

		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.ssl.socketFactory", sf);
		// ��ȡĬ��session����
		Session session = Session.getDefaultInstance(properties, new Authenticator() {
			public PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("602394902@qq.com", "fvzmostizjlsbebi"); // �������ʼ��û���������
			}
		});

		Address[] aa = new InternetAddress[2];
		try {
			aa[0] = new InternetAddress(to);
			aa[1] = new InternetAddress(from);
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			// ����Ĭ�ϵ� MimeMessage ����
			MimeMessage message = new MimeMessage(session);

			// Set From: ͷ��ͷ�ֶ�
			message.setFrom(new InternetAddress(from));

			// Set To: ͷ��ͷ�ֶ�
			/*
			 * message.addRecipient(Message.RecipientType.TO, new
			 * InternetAddress(to));
			 */

			message.addRecipients(Message.RecipientType.TO, aa);

			// Set Subject: ͷ�ֶ�
			message.setSubject("This is the Subject Line!");

			// ������Ϣ����
			BodyPart messageBodyPart = new MimeBodyPart();

			// ��Ϣ
			messageBodyPart.setText("This is message body");

			// ����������Ϣ
			Multipart multipart = new MimeMultipart();

			// �����ı���Ϣ����
			multipart.addBodyPart(messageBodyPart);

			// ��������
			messageBodyPart = new MimeBodyPart();
			String filename = "E:/tmp/employee.ser";
			DataSource source = new FileDataSource(filename);
			messageBodyPart.setDataHandler(new DataHandler(source));
			messageBodyPart.setFileName(filename);
			multipart.addBodyPart(messageBodyPart);

			// ����������Ϣ
			message.setContent(multipart);

			// ������Ϣ
			Transport.send(message);
			System.out.println("Sent message successfully....");
		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
	}
}