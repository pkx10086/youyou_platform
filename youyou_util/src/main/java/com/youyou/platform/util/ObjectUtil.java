package com.youyou.platform.util;

import com.google.common.collect.Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

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
        //普通方式，这种方式我先注释掉
//        for (Map.Entry<K, T> ktEntry : map.entrySet()) {
//            mapnew.put(ktEntry.getKey(), func.apply(ktEntry.getValue()));
//        }
        //jdk1.8方式都可以
        map.forEach((key,value)->mapnew.put(key,func.apply(value)));
        return mapnew;
    }
    public static void main(String[] args) {
        //newHashMap("k", 1, "a", 2, "b", 3).forEach((key,value)->{System.out.println("key="+key+"  value="+value);});

        //普通方式调用
        common();
        //stream方式
        stream();
        //guava提供的方式
        transfer();
        //自己写的工具类
        Map<String, String> map = newHashMap("k", "1", "a", "2", "b", "3");
        transform(map,Integer::valueOf);

        Map<String, String> map2 = newHashMap("k", new User("aa",1), "a", "2", "b", "3");
       // Map<String, Tuser> transform = ObjectUtil.transform(map, Test::poToDto);
        //transform.forEach((k,v)->{System.out.println(k+"->"+v.getTname()+"->"+v.getTage());});
    }

    /**
     * 构造一个Map对象
     * @param kv kv
     * @return {@link Map}<{@link String}, {@link T}>
     */
    private static <T> Map<String, T> newHashMap(Object... kv) {
        Map<String, T> ans = new HashMap<>();
        for (int i = 0, size = kv.length; i < size; i += 2) {
            ans.put(String.valueOf(kv[i]), (T) kv[i + 1]);
        }
        return ans;
    }




    public static void common(){
        Map<String, String> map = newHashMap("k", "1", "a", "2", "b", "3");
        Map<String, Integer> ans = new HashMap<>(map.size());
        for (Map.Entry<String, String> entry: map.entrySet()) {
            ans.put(entry.getKey(), Integer.valueOf(entry.getValue()));
        }
        System.out.println(ans);
    }

    public static void stream() {
        Map<String, String> map = newHashMap("k", "1", "a", "2", "b", "3");
        Map<String, Integer> ans = map.entrySet().stream().collect(
                Collectors.toMap(Map.Entry::getKey, s -> Integer.valueOf(s.getValue())));
        System.out.println(ans);
    }

    public static void transfer() {
        Map<String, String> map = newHashMap("k", "1", "a", "2", "b", "3");
        Map<String, Integer> ans = Maps.transformValues(map, Integer::valueOf);
        System.out.println(ans);
    }
    public static Tuser poToDto(User user){
        Tuser tuser = new Tuser(user.getName(),user.getAge());
        return tuser;
    }

    static class Tuser{

        public Tuser(String tname,Integer tage){
            this.tname =tname;
            this.tage =tage;
        }
        private String tname;
        private int tage;

        public String getTname() {
            return tname;
        }

        public void setTname(String tname) {
            this.tname = tname;
        }

        public int getTage() {
            return tage;
        }

        public void setTage(int tage) {
            this.tage = tage;
        }
    }
    static class User{
        public User(String name,Integer age){
            this.name =name;
            this.age =age;
        }
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }


}
