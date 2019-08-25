package com.caihao.springboot.entity;

import javax.persistence.*;

/**
 * @author CaiHao
 * @create 2019-08-25 10:53:01
 */



//使用jpa注解配置映射关系
//@Entity:说明这是一个实体类，和数据表映射的bean
//@Table:指定这个实体类和哪个库表对应；如果省略@table注解，默认就和类名小写的表对应

@Entity
@Table(name = "t_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private Integer id;
    @Column(name = "last_name",length = 50)
    private String lastName;
    @Column(name = "email",length = 50)//如果省略，默认列名就和属性名对应
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
