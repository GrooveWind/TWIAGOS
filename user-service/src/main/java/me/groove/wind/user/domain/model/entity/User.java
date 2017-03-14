package me.groove.wind.user.domain.model.entity;

import me.wind.groove.base.domain.model.entity.BaseEntity;
import me.wind.groove.base.domain.model.enums.Sex;

import java.util.Date;

/**
 * User 实体
 * Created by GrooveWind on 2017/2/23.
 */
public class User extends BaseEntity<Long> {

    private String realname;
    private String nickname;

    private Sex sex;
    private Date birthday;
    private int age;

    public User() {

    }

    public User(Long id) {
        this.setId(id);
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
