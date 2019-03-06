package com.whz.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kevin on 2018/4/16 23:47
 * <p>
 * 描述：容器单例
 * <p>
 * 使用缓存存储
 */
public class Singleton6 {

    private static Map<String, Object> maps = new HashMap<>();

    private Singleton6() {
    }

    public static void registerService(String key, Object value) {
        if (!maps.containsKey(key)) {
            maps.put(key, value);
        }
    }

    public static Object getService(String key) {
        return maps.get(key);
    }
}
