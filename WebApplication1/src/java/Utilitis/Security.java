/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitis;


import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author mendezgonzalez.9
 */
public class Security {
    private static Security seguro;
    private String file;
    
    public Security(String strClearText){
        this.file = strClearText;
    }
    
        public static Security getInstance(String uName, String pWord){
        if(seguro == null){
                    
           return new Security("o"); 
       } return seguro;
    }
    
     public String encrypt(String strClearText,String strKey) throws Exception{
    String strData="";

    try {
        SecretKeySpec skeyspec=new SecretKeySpec(strKey.getBytes(),"Blowfish");
        Cipher cipher=Cipher.getInstance("Blowfish");
        cipher.init(Cipher.ENCRYPT_MODE, skeyspec);
        byte[] encrypted=cipher.doFinal(strClearText.getBytes());
        strData=new String(encrypted);

    } catch (Exception e) {
        e.printStackTrace();
        throw new Exception(e);
    }
    return strData;
}
     public String decrypt(String strEncrypted,String strKey) throws Exception{
    String strData="";

    try {
        SecretKeySpec skeyspec=new SecretKeySpec(strKey.getBytes(),"Blowfish");
        Cipher cipher=Cipher.getInstance("Blowfish");
        cipher.init(Cipher.DECRYPT_MODE, skeyspec);
        byte[] decrypted=cipher.doFinal(strEncrypted.getBytes());
        strData=new String(decrypted);

    } catch (Exception e) {
        e.printStackTrace();
        throw new Exception(e);
    }
    return strData;
}
}
