package me.groove.wind.sql.mybatis.domain.model.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/4/20.
 */
public class Hotel implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long city;
    private String name;
    private String address;
    private String zip;

    public Long getCity() {
        return city;
    }

    public void setCity(Long city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return getCity() + "," + getName() + "," + getAddress() + "," + getZip();
    }

}
