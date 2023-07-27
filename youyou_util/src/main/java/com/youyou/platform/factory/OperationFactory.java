package com.youyou.platform.factory;

import com.youyou.platform.Addition;
import com.youyou.platform.Division;
import com.youyou.platform.Operation;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * 工厂操作
 *
 * @author pankx
 * @description:操作工厂模式实现加减乘除
 * @date: 2023/7/27  17:27
 * @date 2023/07/27
 */
public class OperationFactory {
    static Map<String, Operation> operationMap = new HashMap<>();
    static {
        operationMap.put("add", new Addition());
        operationMap.put("divide", new Division());
        // more operators
    }

    public static Optional<Operation> getOperation(String operator) {
        return Optional.ofNullable(operationMap.get(operator));
    }
}
