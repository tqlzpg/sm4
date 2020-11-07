package com.ai.sm4;

import org.junit.Assert;
import org.junit.Test;

public class SM4Test {

    private String plainText = "科技danni123";

    @Test
    public void encrypt() {
        String cipher = SM4.encrypt(plainText, "Da&^*9wHFOMfs2Y8");
        System.out.println("密文：" + cipher);
        Assert.assertNotSame("加密后与原明文不同", plainText, cipher);
    }

    @Test
    public void decrypt() {
        String cipher = SM4.encrypt(plainText, "Da&^*9wHFOMfs2Y8");
        String d = SM4.decrypt(cipher, "Da&^*9wHFOMfs2Y8");
        Assert.assertEquals("解密后相等", plainText, d);
    }
}