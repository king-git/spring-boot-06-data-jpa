package com.caihao.springboot.repository;

import com.caihao.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author CaiHao
 * @create 2019-08-25 11:04:41
 */

//继承JpaRepository来完成对数据库的操作
public interface UserRepository extends JpaRepository<User,Integer> {



}
