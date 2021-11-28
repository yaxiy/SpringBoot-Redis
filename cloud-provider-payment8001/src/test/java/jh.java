import lombok.extern.slf4j.Slf4j;
import com.atguigu.springcloud.controller.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
@Slf4j
public class jh {
    @org.junit.Test
    public List<Integer> test(){
        Test test = new Test();
        int[] string={1,2,3,4,5,6,7,8};
        List<Integer> list = test.Test01(string);
        for (Integer lists :list){
            System.out.println(lists);
        }
        return list;
    }

    public static void main(String[] args) {
        jh jh = new jh();
        System.out.println(jh.test());
    }
}
