package edu.eci.arep.sparkwebapp.Services;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class cipherServices {

    public static  String convertPass(String pass){
        MessageDigest cipher = null;
        try {
            cipher = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] result = cipher.digest(pass.getBytes());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < result.length; i++) {
            sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();
    }

    public static Boolean authenticate(String password){
        return password.equals("99800b85d3383e3a2fb45eb7d0066a4879a9dad0");
    }
}
