package com.vsgajmp.aplikasirestkaryawan.model;

import com.google.gson.annotations.SerializedName;

public class EmployeeItem {
    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    public EmployeeItem() {

    }

    public EmployeeItem(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
