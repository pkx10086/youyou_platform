import com.youyou.platform.AddCommand;
import com.youyou.platform.OperatorCommand;
import com.youyou.platform.em.Operator;
import com.youyou.platform.util.DigitUtil;
import com.youyou.platform.util.ObjectUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : pankx
 * @description:
 * @date: 2023/7/27  17:31
 */

public class Test {

    public static void main(String[] args) {
        System.out.println(DigitUtil.calculate(1, 2, "add"));
        DigitUtil util = new DigitUtil();
        System.out.println(util.calculateV2(2, 1, Operator.DIVISION));

        OperatorCommand command = new AddCommand(1, 2);
        System.out.println(DigitUtil.calculateV3(command));

        Map<String,String> map = new HashMap<>();
        map.put("a","1");
        map.put("b","2");
        map.put("c","3");
        map.put("d","4");


        System.out.println(ObjectUtil.transform(map, Integer::valueOf));
    }

}
