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

public void forEachParse(){

}

    public static void main(String[] args) {
        System.out.println(DigitUtil.calculate(1, 2, "add"));
        DigitUtil util = new DigitUtil();
        System.out.println(util.calculateV2(2, 1, Operator.DIVISION));

        OperatorCommand command = new AddCommand(1, 2);
        System.out.println(DigitUtil.calculateV3(command));

        Map<String,User> map = new HashMap<>();
        User u = new  User();
        u.setName("aaa");
        u.setAge(11);

        map.put("a",u);
        User u2 = new  User();
        u2.setName("bbb");
        u2.setAge(222);
        map.put("b",u2);

        Map<String, Tuser> transform = ObjectUtil.transform(map, Test::poToDto);
        transform.forEach((k,v)->{System.out.println(k+"->"+v.getTname()+"->"+v.getTage());});

        System.out.println(ObjectUtil.transform(map,Test::poToDto));
    }

    public static Tuser poToDto(User user){
        Tuser tuser = new Tuser();
        tuser.setTage(user.getAge());
        tuser.setTname(user.getName());
        return tuser;
    }

    static class Tuser{
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
