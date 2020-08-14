package com.bone.was;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class JasyptTest {
    public static void main(String[] args) {
        StandardPBEStringEncryptor jasypt = new StandardPBEStringEncryptor();
        jasypt.setPassword("test1234");      //��ȣȭ Ű(password)
        jasypt.setAlgorithm("PBEWithMD5AndDES");


        String encryptedText = jasypt.encrypt("test1234");    //��ȣȭ
        String plainText = jasypt.decrypt(encryptedText);  //��ȣȭ

        System.out.println("encryptedText:  " + encryptedText); //��ȣȭ�� ��
        System.out.println("plainText:  " + plainText);         //��ȣȭ�� ��
    }
}


