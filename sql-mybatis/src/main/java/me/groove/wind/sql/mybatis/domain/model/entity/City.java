package me.groove.wind.sql.mybatis.domain.model.entity;

import me.wind.groove.base.domain.model.entity.BaseEntity;

/**
 * Created by Administrator on 2017/4/20.
 */
public class City extends BaseEntity<Long> {

    private String name;
    private String state;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return getId() + "," + getName() + "," + getState() + "," + getCountry();
    }

}
