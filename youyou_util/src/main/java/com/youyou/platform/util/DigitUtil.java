package com.youyou.platform.util;

import com.youyou.platform.AddCommand;
import com.youyou.platform.Operation;
import com.youyou.platform.OperatorCommand;
import com.youyou.platform.em.Operator;
import com.youyou.platform.factory.OperationFactory;

import javax.smartcardio.CommandAPDU;

/**
 * 数字跑龙套
 *
 * @author pankx
 * @description: 数字工具类
 * @date: 2023/7/27  17:36
 * @date 2023/07/27
 */
public class DigitUtil {

    public static int calculate(int a, int b, String operator) {
        Operation targetOperation = OperationFactory
                .getOperation(operator)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Operator"));
        return targetOperation.apply(a, b);
    }

    public int calculateV2(int a, int b, Operator operator) {
        return operator.apply(a,b);
    }

    public static int calculateV3(OperatorCommand command) {
        Integer result = command.execute();
        return result;
    }
}
