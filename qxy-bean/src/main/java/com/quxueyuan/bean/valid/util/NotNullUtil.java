package com.quxueyuan.bean.valid.util;


public class NotNullUtil {

    public static boolean valid(Object obj) {
        if (obj == null) {
            return false;
        }
        return true;
    }
}