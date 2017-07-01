package com.yoghurt.dao;

import com.yoghurt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


/**
 * Created by admin on 2017/7/1.
 */
public interface UserDao extends JpaRepository<User, Long>{
    User findUserByName(String name);



    @Query("from User u where u.name=:name")
    User findUser(@Param("name") String name);

}
