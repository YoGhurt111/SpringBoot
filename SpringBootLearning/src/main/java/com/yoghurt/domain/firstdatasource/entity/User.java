package com.yoghurt.domain.firstdatasource.entity;



/**
 * Created by admin on 2017/6/22.
 */
//@Entity
public class User {
    private long id;
    private String name;
    private Integer age;

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
