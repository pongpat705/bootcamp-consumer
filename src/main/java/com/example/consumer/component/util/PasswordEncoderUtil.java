package com.example.consumer.component.util;

public class PasswordEncoderUtil {

    public static PasswordEncoderUtil passwordEncoderUtil;
    public static PasswordEncoderUtil getInstance() {
        if(null == passwordEncoderUtil){
            passwordEncoderUtil = new PasswordEncoderUtil();
        }
        return passwordEncoderUtil;
    }
    public String encodePassword(){
        return "encodedPassword";
    }
}
