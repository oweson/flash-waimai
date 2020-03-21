package cn.enilu.flash.bean.entity.front;

import javax.persistence.MappedSuperclass;

/**
 * @author ：enilu
 * @date ：Created in 2019/9/4 14:31
 */
/**这个注解表示在父类上面的，用来标识父类。

 基于代码复用和模型分离的思想，在项目开发中使用JPA的@MappedSuperclass注解将实体类的多个属性分别封装到不同的非实体类中。例如，数据库表中都需要id来表示编号，id是这些映射实体类的通用的属性，交给jpa统一生成主键id编号，那么使用一个父类来封装这些通用属性，并用@MappedSuperclas标识。

 注意:

 1.标注为@MappedSuperclass的类将不是一个完整的实体类，他将不会映射到数据库表，但是他的属性都将映射到其子类的数据库字段中。

 2.标注为@MappedSuperclass的类不能再标注@Entity或@Table注解，也无需实现序列化接口*/
@MappedSuperclass
public class BaseMongoEntity     {

}
