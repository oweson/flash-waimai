import cn.enilu.flash.utils.Maps;

import java.util.HashMap;
import java.util.Map;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2020/3/21 16:35
 */
public class Demo1GuavaMapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> integerStringHashMap = Maps.newHashMap(1, "河南", 2, "广州", 3, "福州");
        for (Map.Entry<Integer, String> integerStringEntry : integerStringHashMap.entrySet()) {
            System.out.println("key is :" + integerStringEntry.getKey() + "  value is :" + integerStringEntry.getValue());
        }

    }
}
