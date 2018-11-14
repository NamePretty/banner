package com.zdj.bannerproject.utils;

import java.util.Collection;
import java.util.Map;

/**
 * Created by zdj on 2016/12/27.
 */

public class Check {
    public Check() {
    }

    public static boolean isEmpty(CharSequence str) {
        return isNull(str) || str.length() == 0;
    }

    public static boolean isEmpty(Object[] os) {
        return isNull(os) || os.length == 0;
    }

    public static boolean isEmpty(Collection<?> l) {
        return isNull(l) || l.isEmpty();
    }

    public static boolean isEmpty(Map<?, ?> m) {
        return isNull(m) || m.isEmpty();
    }

    public static boolean isNull(Object o) {
        return o == null;
    }
}
