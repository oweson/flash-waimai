package cn.enilu.flash.service.demo;

import cn.enilu.flash.service.BaseApplicationStartTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2020/2/11 12:08
 */
public class MainTest extends BaseApplicationStartTest {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    public void demo1(){
        User user = new User();
        user.setId(0);
        user.setName("tom");
        mongoTemplate.save(user,"user");
    }
}
