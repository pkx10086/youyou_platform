package com.youyou.platform.util;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * @author : pankx
 * @description:
 * @date: 2023/7/27  17:39
 */
public class ObjectUtil {

    /**
     * 变换
     *
     * @param map  原始集合数据
     * @param func 函数
     * @return {@link Map}<{@link K}, {@link V}>
     */
    public static <K, T, V> Map<K, V> transform(Map<K, T> map, Function<T, V> func) {
        Map<K, V> mapnew = new HashMap<>(map.size());
        for (Map.Entry<K, T> ktEntry : map.entrySet()) {
            mapnew.put(ktEntry.getKey(), func.apply(ktEntry.getValue()));
        }
        return mapnew;
    }
}
