package cn.enilu.flash.bean.entity.rabbit;

import cn.enilu.flash.bean.entity.BaseEntity;
import cn.enilu.flash.bean.entity.front.BaseMongoEntity;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2020/3/21 16:43
 */
@Data
@Document(collection = "fish")
public class Fish extends BaseMongoEntity {
    private String _id;
    private Integer id;
    private String address;

}
