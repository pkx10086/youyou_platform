package com.youyou.platform;

/**
 * @author : pankx
 * @description: 加法
 * @date: 2023/7/27  17:24
 */
public class Addition implements Operation{
    /**
     * 应用
     *
     * @param num1 num1
     * @param num2 num2
     * @return int
     */
    @Override
    public int apply(int num1, int num2) {
        return num1 + num2;
    }


}
