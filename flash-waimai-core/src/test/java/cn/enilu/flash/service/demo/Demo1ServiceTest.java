package cn.enilu.flash.service.demo;

import cn.enilu.flash.dao.MongoRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2020/2/11 12:05
 */
@Repository
public interface Demo1ServiceTest extends JpaRepository<Integer,User> {
}
