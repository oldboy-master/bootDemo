package com.example.demo.entity;

public class Rights {
    private Integer id;

    private String rightsName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRightsName() {
        return rightsName;
    }

    public void setRightsName(String rightsName) {
        this.rightsName = rightsName == null ? null : rightsName.trim();
    }
}