package com.ai.sm4;

import com.ai.sm4.core.SM4Util;

/**
 * SM4提供给外部调用的类。
 *
 * @author Danni
 * @since 2018.11.23
 */
public class SM4 {

    /**
     * 加密。默认为ECB分组模式。
     *
     * @param plainText 明文
     * @param secretKey 密钥，需要为16位
     * @return 加密后密文
     */
    public static String encrypt(String plainText, String secretKey) {
        SM4Util sm4 = new SM4Util();
        sm4.secretKey = secretKey;// 16位

        // 加密
        String cipherText = sm4.encryptDataByECB(plainText);
        return cipherText;

    }

    /**
     * 解密。默认为ECB分组模式。
     *
     * @param cipherText 密文
     * @param secretKey 密钥，需要为16位
     * @return 解密后明文
     */
    public static String decrypt(String cipherText, String secretKey) {
        SM4Util sm4 = new SM4Util();
        sm4.secretKey = secretKey;// 16位

        // 解密
        String plainText = sm4.decryptDataByECB(cipherText);
        return plainText;

    }

}
