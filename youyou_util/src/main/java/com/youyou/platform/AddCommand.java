package com.youyou.platform;

/**
 * @author : pankx
 * @description:
 * @date: 2023/7/27  18:08
 */

public class AddCommand implements OperatorCommand {

    public AddCommand(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    private int num1;


    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    @Override
    public Integer execute() {
        return num1 + num2;
    }
}
