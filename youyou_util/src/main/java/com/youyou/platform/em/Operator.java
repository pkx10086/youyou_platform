package com.youyou.platform.em;

/**
 * 枚举类型实现加减乘除
 *
 * @author pankx
 * @date 2023/07/27
 */
public enum Operator {
    ADD {
        @Override
        public int apply(int num1, int num2) {
            return num1 + num2;
        }
    },
    DIVISION {
        @Override
        public int apply(int num1, int num2) {
            return num1 / num2;
        }
    };

    public abstract int apply(int num1, int num2);


}
