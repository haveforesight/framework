package com.xxx.util.crypto;

import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import com.alibaba.druid.util.Base64;


public class SymmetricEncoder {
	
	/**
	 * ����
	 * @param encodeRules
	 * @param content
	 * @return
	 */
	public static String AESEncode(String encodeRules,String content){
		try{
			//1.�����ܳ���������ָ��ΪAES�㷨�������ִ�С
			KeyGenerator keygen = KeyGenerator.getInstance("AES");
			//2.����ecnodeRules�����ʼ���ܳ�������
			//c����һ��128Ϊ�����Դ�����ݴ�����ֽ�����
			keygen.init(128, new SecureRandom(encodeRules.getBytes()));
			//3.����ԭʼ�Գ��ܳ�
			SecretKey original_key = keygen.generateKey();
			byte[] raw= original_key.getEncoded();
			SecretKey key = new SecretKeySpec(raw,"AES");
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE, key);
		    byte [] byte_encode = content.getBytes("utf-8");
		    byte [] byte_AES = cipher.doFinal(byte_encode);
		    String AES_encode = null; //= new String(Base64.encodeBase64(byte_AES),"utf-8");
		    return AES_encode;
		}catch(Exception ex){
			
		}
		return null;
	}
	
	/**
	 * ����
	 * @param encodeRules
	 * @param content
	 * @return
	 */
	public static String AESDncode(String encodeRules,String content){
		try{
			//1.�����ܳ���������ָ��ΪAES�㷨�������ִ�С
			KeyGenerator keygen = KeyGenerator.getInstance("AES");
			//2.����ecnodeRules�����ʼ���ܳ�������
			//c����һ��128Ϊ�����Դ�����ݴ�����ֽ�����
			keygen.init(128, new SecureRandom(encodeRules.getBytes()));
			//3.����ԭʼ�Գ��ܳ�
			SecretKey original_key = keygen.generateKey();
			//4.���ԭʼ�Գ��ܳ׵��ֽ�����
			byte[] raw= original_key.getEncoded();
			//5.�����ֽ���������AES�ܳ�
			SecretKey key = new SecretKeySpec(raw,"AES");
			//6.����ָ���㷨AES�ӳ�������
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
			//7.��ʼ������������һ������Ϊ���� ���߽���
			cipher.init(Cipher.DECRYPT_MODE, key);
			//8.�����ܲ����������ݽ�����ֽ�����
			byte [] byte_content = null;//Base64.decodeBase64(content);
			byte []byte_decode = cipher.doFinal(byte_content);
			String AES_decode = new String (byte_decode,"utf-8");
			return AES_decode;
		}catch(Exception ex){
			
		}
		return null;
		
	}
	
	
	public static void main(String [] args){
	String encode =SymmetricEncoder.AESEncode("aa", "bb");
	String content=	SymmetricEncoder.AESDncode("aa", encode);
	System.out.println(encode+":"+content);
	}

}
